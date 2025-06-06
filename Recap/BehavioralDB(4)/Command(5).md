# Command

- Este folosit pentru implementare lose coupling - componentele au dependinte minime unele de altele

- In acest mod ascunde apliacrea de comenzi fara sa se stie concret ce presupune acea comanda

- Decupleaza clientul de cel care executa actiunea

- **SINTAGMA:** se realizeaza prin intermediul

![Diagrama Command](../img/Diagrama%20Command.png)

## Problema

- Managerul agenției dorește ca în cadrul aplicației operatorul să poată da comenzi de rezervare sau vânzare pentru pachetele de cazare sau pentru pachetele de transport.

- Aceste comenzi vor fi realizate prin intermediul clasei Operator.

### Implementare

- Command -> interfata care defineste la nivel abstract comenzile sau actiunile

- ComandaVanzare, ComandaRezervare -> clasele concrete pentru fiecare comanda

- PachetTuristic (Cazare / Transport) -> Receiverul, adica obiectul responsabil cu executia actiunilor

- Operator -> Invoker, adica clasa care se ocupa cu gestionarea comenzilor

![Diagrama Problemei Command](../img/Diagrama%20Problemei%20Command.png)

#### Clasele pachet (Receiverul)

- Interfata comuna

```java
package agentie.clase;

public interface PachetTuristic {
	void vanzare();
	void rezerva();
}
```

- Pachetul de transport

```java
package agentie.clase;

public class PachetTransport implements PachetTuristic {

	private int cod;

	public PachetTransport(int cod) {
		super();
		this.cod = cod;
	}

	@Override
	public void vanzare() {
		System.out.println("Pachetul de transport cu codul "+cod+" a fost vandut");

	}

	@Override
	public void rezerva() {
		System.out.println("Pachetul de transport cu codul "+cod+" a fost rezervat");

	}
}
```

- Pachetul de cazare

```java
package agentie.clase;

public class PachetCazare implements PachetTuristic {
	private int cod;


	public PachetCazare(int cod) {
		super();
		this.cod = cod;
	}

	@Override
	public void vanzare() {
		System.out.println("Pachetul de cazare cu codul "+cod+" a fost vandut");

	}

	@Override
	public void rezerva() {
		System.out.println("Pachetul de cazare cu codul "+cod+" a fost rezervat");

	}

}
```

#### Clasele Command

- Interfata comuna

```java
package agentie.clase;

public interface Command {
	void executa();
}
```

- Comanda concrete de Rezervare

```java
package agentie.clase;

public class ComandaRezervare implements Command {

	private PachetTuristic pachet;

	public ComandaRezervare(PachetTuristic pachet) {
		super();
		this.pachet = pachet;
	}

	@Override
	public void executa() {
		pachet.rezerva();
	}

}
```

- Comanda concreta de Vanzare

```java
package agentie.clase;

public class ComandaVanzare implements Command {

	private PachetTuristic pachet;

	public ComandaVanzare(PachetTuristic pachet) {
		super();
		this.pachet = pachet;
	}

	@Override
	public void executa() {
		pachet.vanzare();

	}

}
```

#### Clasa Operator (Invoker)

- Clasa operator care cere executarea unei comenzi

```java
package agentie.clase;

public class Operator {

	public void invoca(Command comanda){
		comanda.executa();
	}
}
```

#### Programul Main

- Definim tipul de pachet pe care ni-l dorim si operatorul invoca comanda de care are nevoie

```java
package agentie.program;

import agentie.clase.ComandaRezervare;
import agentie.clase.ComandaVanzare;
import agentie.clase.Command;
import agentie.clase.Operator;
import agentie.clase.PachetCazare;
import agentie.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachet=new PachetCazare(23);

		Operator operator=new Operator();

		Command vanzare=new ComandaVanzare(pachet);
		Command rezervare=new ComandaRezervare(pachet);

		operator.invoca(rezervare);
		operator.invoca(vanzare);


	}

}
```

#### Observatii

- Practic definim comenzi care se apeleaza la nivelul unui obiect

- In cazul nostru apelam comenzile de vanzare si de cumparare din comenzi separate

- Comanda poate sa fie invocata doar de catre cineva specailizat

## Extra Use - Case

- Invokerul poate sa implementeze o lista de comenzi

- Astfel, se poate mentine un istoric al comenzilor invocate si se poate implementa logica de undo

## Utilizari

- Macro-urile

- Lucrul cu fisiere

- Oriunde se doreste revenirea la o stare anterioare prin intermediul comenzilor

---

[Back](0_IntroinDesignPatternsComportamentale.md)
