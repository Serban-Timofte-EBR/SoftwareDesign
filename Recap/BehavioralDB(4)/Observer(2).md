# Observer

- Defineste o relatie de 1:n

- Subiectul notifica mai multi observatori

- Este folosit cand un element trebuie sa anunte mai multi observatori de schimbarea starii

- Comunicarea este unidirectionala. Observatorii primesc mesaje de la un subiect, dar nu pot raspunde

- Este similar conceptului de newsletter

- **SINTAGMA:** Vrea sa notifice clientii cu informatii despre => Agentia este subiectul - Clientul este observatorul

- NU incalca principiile SOLID

![Diagrama Observer](../img/Diagrama%20Observer.png)

## Problema

- Agenția de turism dorește să anunțe clienții fideli ori de câte ori apar noi oferte. Astfel se dorește implementarea unui modul care atunci când se realizează o ofertă de preț sau se introduce un nou pachet să se trimită notificări tuturor clienților abonați la notificările agenției de turism.

### Implementare

- Observer -> clasa abstracta / intefata care defineste la nivel abstract obiectele ce vor fi notificate

- Concrete Observer -> ClientFidel -> abonatii la notificarile Agentiei

- Observabil -> Subject -> Clasa care gestioneaza lista de observatori la nivel abstract

- Concrete Observabil -> Agentie -> Clasa concreta care gestioneaza efectiv lista de observatori

#### Clasele observatori (clienti)

- Intefata observator

```java
package agentie.client;

public interface Observer {
	public void receptionareMesaj(String mesaj);
}
```

- Observatorul concret din cerinta

```java
package agentie.client;

public class ClientFidel implements Observer {

	private String numeClient;

	public ClientFidel(String nume) {
		this.numeClient=nume;
	}

	@Override
	public void receptionareMesaj(String mesaj) {
		System.out.println(numeClient + " ai primit mesajul: " + mesaj);
	}
}
```

#### Clasele subiect

- Interfata subiect

```java
package agentie.clase;

import agentie.client.Observer;

public interface Subject {
	void adaugaObserver(Observer observer);
	void stergeObserver(Observer observer);
	void trimiteNotificare(String mesaj);
}
```

- Agentia - subietul care notifica clientii

```java
package agentie.clase;

import java.util.ArrayList;
import java.util.List;

import agentie.client.Observer;

public class Agentie implements Subject {

	private List<Observer> observeri;
	private String numeAgentie;

	public Agentie(String numeAgentie) {
		this.numeAgentie=numeAgentie;
		observeri = new ArrayList<Observer>();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		observeri.add(observer);
	}

	@Override
	public void stergeObserver(Observer observer) {
		observeri.remove(observer);
	}

	@Override
	public void trimiteNotificare(String mesaj) {
		for(Observer observer:observeri){
			observer.receptionareMesaj(numeAgentie+":"+ mesaj);
		}
	}

	public void notificareOfertaNoua(){
		trimiteNotificare("A fost adaugata o noua oferta. Consultati noul nostru catalog!");
	}

	public void notificareReducerePret(){
		trimiteNotificare("Preturile au fost reduse. Consultati noul nostru catalog!");
	}

}
```

#### Observatii

- In metoda de trimitere notificare se apeleaza functia de receptionare a fiecarui observator din lista

## Utilizari

- In arhitectura MVC (Model - View - Controller)

---

[Back](0_IntroinDesignPatternsComportamentale.md)
