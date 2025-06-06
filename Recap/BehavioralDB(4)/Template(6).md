# Template

- Folosit atunci cand un algoritm este cunoscut si urmeaza anumiti pasi precisi

- Fiecare pas este realizat de cate o metoda

- Exista o metoda care implementeaza algoritmul si apeleaza celelalte metode

- Folosit ca un sablon care arata modul in care faci actiunile

- **SINTAGMA:** O actiune se realizeaza de fiecare data dupa un pattern bine stabilit

![Diagrama Template](../img/Diagrama%20Template.png)

## Problema

- Vânzarea unui pachet turistic se realizează de fiecare data după un pattern bine stabilit:

  - Se caută cazare;
  - Se caută transport;
  - Se rezervă întreg pachetul;
  - Se vinde pachetul, prin realizarea plății.

- Să se implementeze modulul care realizează vânzarea de pachete turistice.

### Implementare

- PachetTuristic -> Template -> Clasa abstracta care implementeaza metoda template si anunta celelalte metode, care vor fi folosite in cadrul metodei template

- PachetCazare/Transport/CazareTransport -> ConcreteTemplate -> Clasele concrete care vor implementa metodele abstracte, determinand astfel modul de realizarea a template-ului

#### Clasa Template

- Clasa abstracta unde imi definesc o metoda abstracta pentru fiecare pas din procesul de vanzare

```java
package agentie.clase;

public abstract class PachetTuristic {

	protected int codPachet;

	public PachetTuristic(int codPachet) {
		super();
		this.codPachet = codPachet;
	}

	public abstract void cautareCazare(int codPachet);
	public abstract void cautareTransport(int codPachet);
	public abstract void rezervaPachet(int codPachet);
	public abstract void platirePachet(int codPachet);

	public final void vindePachet(){
		cautareCazare(codPachet);
		cautareTransport(codPachet);
		rezervaPachet(codPachet);
		platirePachet(codPachet);
	}
}
```

#### Clasele Template Concrete

- Extind clasa mea template si introduc logica necesara

- Daca un pas din template nu este relevant, se suprascrie dar fara o implementare efectiva

- Clasa PachetTransport, care rezerva un pachet turistic cu transport inclus, dar fara cazare

```java
package agentie.clase;

public class PachetTransport extends PachetTuristic {

	public PachetTransport(int codPachet) {
		super(codPachet);
	}

	@Override
	public void cautareCazare(int codPachet) {

	}

	@Override
	public void cautareTransport(int codPachet) {
		System.out.println("S-a gasit transport pentru pachetul cu codul "+codPachet);

	}

	@Override
	public void rezervaPachet(int codPachet) {
		System.out.println("S-a rezervat pachetul " + codPachet);
	}

	@Override
	public void platirePachet(int codPachet) {
		System.out.println("S-a platit pachetul " + codPachet);
	}

}
```

- Clasa PachetCazare care se ocupa de vanzarea unui pachet turistic cu cazare, dar fara transport

```java
package agentie.clase;

public class PachetCazare extends PachetTuristic {

	public PachetCazare(int codPachet) {
		super(codPachet);
	}

	@Override
	public void cautareCazare(int codPachet) {
		System.out.println("S-a gasit cazare pentru pachetul cu codul "+codPachet);

	}

	@Override
	public void cautareTransport(int codPachet) {

	}

	@Override
	public void rezervaPachet(int codPachet) {
		System.out.println("S-a rezervat pachetul " + codPachet);
	}

	@Override
	public void platirePachet(int codPachet) {
		System.out.println("S-a platit pachetul " + codPachet);
	}
}
```

- Clasa PachetCazareTransport care se ocupa de vanzarea unui pachet turistic si cu cazare si cu transport

```java
package agentie.clase;

public class PachetCazareTransport extends PachetTuristic {

	public PachetCazareTransport(int codPachet) {
		super(codPachet);
	}

	@Override
	public void cautareCazare(int codPachet) {
		System.out.println("S-a gasit cazare pentru pachetul cu codul "+codPachet);
	}

	@Override
	public void cautareTransport(int codPachet) {
		System.out.println("S-a gasit transport pentru pachetul cu codul "+codPachet);

	}

	@Override
	public void rezervaPachet(int codPachet) {
		System.out.println("S-a rezervat pachetul " + codPachet);
	}

	@Override
	public void platirePachet(int codPachet) {
		System.out.println("S-a platit pachetul " + codPachet);
	}
}
```

#### Program Main

- Executa vanzarea tipurilor de pachete prin metoda finala din PachetTuristic

```java
package agentie.program;

import agentie.clase.PachetCazare;
import agentie.clase.PachetCazareTransport;
import agentie.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachetCazare=new PachetCazare(5);
		pachetCazare.vindePachet();

		PachetTuristic pachetCT=new PachetCazareTransport(23);
		pachetCT.vindePachet();

	}

}
```

### Observatii

- In clasa abstracta, metoda template se declara finala pentru a nu se mai modifica ulterior

- In clasele concrete template sunt implementate metodele folosite in metoda template

## Utilizari

- Atunci cand modul de procesare sau de rezolvare a unei probleme urmeaza un numar finit de pasi

---

[Back](0_IntroinDesignPatternsComportamentale.md)
