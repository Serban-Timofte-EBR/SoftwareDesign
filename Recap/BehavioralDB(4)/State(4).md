# State

- State este un design pattern folosit atunci cand un obiect isi schimba comportamentul pe baza starii in care se afla

- Este asemanator cu strategy, dar starea se schimba in anumite conditii, nu se alege la runtime => **NU am setter public**

- Obiectul poate efectua diferite actiuni doar pe baza starii in care se afla, inclusiv schimbarea in alta stare

- **SINTAGMA:** Adaugam un modul care se poate afla in urmatoarele stari

![Diagrama State](../img/Diagrama%20State.png)

## Problema

- Agenția de turism dorește implementare a unui modul pentru gestiunea rezervărilor realizate pentru pachetele din oferta sa. Rezervările pot fi într-un din următoarele stări: neplatita, platita, efectuata.

- Sa se implementeze modulul dorit de către agenția de turism.

### Implementare

- Stare -> interfata / clasa abstracta care defineste la nivel abstract starile in care se poate afla un obiect

- StareNeplatita, StarePlatita, StareEfectuata -> starile concrete in care poate fi un obiect

- Rezervare -> clasa care defineste obiectul care va trece prin starile create

#### Clasele de stare

- Intefata de stare

```java
package agentie.clase;

public interface Stare {

	void doAction(Rezervare rezervare);
}
```

- Stare Efectuata

```java
package agentie.clase;

public class StareEfectuata implements Stare {

	@Override
	public void doAction(Rezervare rezervare) {
		System.out.println("Rezervarea cu id-ul "+rezervare.getId()+" este trecuta in starea EFECTUATA");
		rezervare.setState(this);
	}
}
```

- Stare Neplatita

```java
package agentie.clase;

public class StareNeplatita implements Stare {

	@Override
	public void doAction(Rezervare rezervare) {
		System.out.println("Rezervarea cu id-ul "+rezervare.getId()+" este trecuta in starea NEPLATITA");
		rezervare.setState(this);
	}

}
```

- Stare Platita

```java
package agentie.clase;

public class StarePlatita implements Stare {

	@Override
	public void doAction(Rezervare rezervare) {
		System.out.println("Rezervarea cu id-ul "+rezervare.getId()+" este trecuta in starea PLATITA");
		rezervare.setState(this);
	}
}
```

#### Clasa de rezervare

- Rezervarea defineste starea actuala

```java
package agentie.clase;

public class Rezervare {

	private int id;
	private Stare state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Rezervare(int id){
		state=null;
		this.id=id;
	}

	public Stare getState() {
		return state;
	}

	public void setState(Stare state) {
		this.state = state;
	}
}
```

#### Programul care apeleaza

- Apelam din stare actiunea si ultimul status se reflecta in atributul de stare al rezervarii

```java
package agentie.program;

import agentie.clase.Rezervare;
import agentie.clase.StareNeplatita;
import agentie.clase.StarePlatita;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(1000);

		StareNeplatita neplatita=new StareNeplatita();
		neplatita.doAction(rezervare);

		StarePlatita platita=new StarePlatita();
		platita.doAction(rezervare);

	}

}
```

#### Observatii

- In cadrul fiecarei clase care defineste o stare exista metoda comuna care implementeaza o logica si seteaza urmatoarea stare

- Modificarea starii NU se face prin setarea din programul apelator ca la Strategy, ci prin apelul acestei stari

## Utilizari

- Starile rezervarilor sau a comenzilor in orice aplicatie

- Evitam utilizarea switch / if-else
