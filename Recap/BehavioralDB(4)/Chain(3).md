# Chain of Responsability

- Este folosit atunci cand cel care are neboie de rezolvarea unei probleme nu stie exact cine poate sa rezolve problema, insa are o lista de posibile obiecte ce pot rezolva problema

- Este asemanator cu un lant din zale in care se imbina o za cu alta pentru a format tot lantul

- Aceste obiecte posibile se ordoneaza intr-un lant, apoi cel care are solutia se apeleaza prima za din lant

![Diagrama Chain](../img/Diagrama%20Chain.png)

## Problema

- Transmiterea notificărilor către clienții fideli se realizează prin mesaje SMS sau prin e-mail.

- Problema este că agenția deține pentru anumiți clienți numărul de telefon, iar pentru alți clienți doar adresa de mail. Să se implementeze funcționalitatea de a trimite notificări clienților prin SMS, iar în cazul în care pentru anumiți clienți agenția nu are în baza de date numărul de telefon, să se trimită notificarea prin email. În cazul clienților pentru care nu există nici numărul de telefon, nici adresa de mail, se trimite managerului agenției o notificare cu numele clientului pentru care nu există date de contact.

### Implementare

- Notificator -> Handler -> Clasa abstracta / interfata care defineste interfata obiectelor ce vor gestiona cererea de procesare si de rezolvare a problemei

- NotificatorSMS, NotificatorEmail, NotificatorManager -> Clasele concrete ale caror obiecte vor forma lantul

#### Clasa Client

- Catre cel care pleaca notificarile

```java
package agentie.clase;

public class Client {
	private String nume;
	private String nr_telefon;
	private String adresa_mail;

	public Client(String nume, String nr_telefon, String adresa_mail) {
		super();
		this.nume = nume;
		this.nr_telefon = nr_telefon;
		this.adresa_mail = adresa_mail;
	}
	public Client(String nume) {
		super();
		this.nume = nume;
		this.nr_telefon = null;
		this.adresa_mail = null;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getNr_telefon() {
		return nr_telefon;
	}
	public void setNr_telefon(String nr_telefon) {
		this.nr_telefon = nr_telefon;
	}
	public String getAdresa_mail() {
		return adresa_mail;
	}
	public void setAdresa_mail(String adresa_mail) {
		this.adresa_mail = adresa_mail;
	}
}
```

#### Clasa Notificator

- Seteaza care este urmatoarea za din lant

- Metoda abstracta o sa fie implemententata in clasa concreta

```java
package agentie.clase;

public abstract class Notificator {

	private Notificator urmatorulNotificator;

	public Notificator getUrmatorulNotificator() {
		return urmatorulNotificator;
	}

	public void setUrmatorulNotificator(Notificator notificator){
		this.urmatorulNotificator = notificator;
	}

	public abstract void notifica(Client client, String mesaj);
}
```

#### Clasele de notificare

- Notificare Email

```java
package agentie.clase;

public class NotificatorEmail extends Notificator {

	@Override
	public void notifica(Client client, String mesaj) {
		if(client.getAdresa_mail()!=null)
			System.out.println(client.getNume() + " ai un E-Mail cu mesajul " + mesaj);
		else
			super.getUrmatorulNotificator().notifica(client, mesaj);
	}
}
```

- Notificare SMS

```java
package agentie.clase;

public class NotificatorSMS extends Notificator {

	@Override
	public void notifica(Client client, String mesaj) {
		if(client.getNr_telefon()!=null)
			System.out.println(client.getNume() + " ai un SMS cu mesajul " + mesaj);
		else
			super.getUrmatorulNotificator().notifica(client, mesaj);
	}

}
```

- Notificare Manager

```java
package agentie.clase;

public class NotificatorManager extends Notificator {

	@Override
	public void notifica(Client client, String mesaj) {
			System.out.println("Domnule Manager, agentia nu detine date de contact pentru clientul: " + client.getNume());
		}
}
```

#### Program Main

- Setez lantul

```java
package agentie.program;

import agentie.clase.Client;
import agentie.clase.Notificator;
import agentie.clase.NotificatorEmail;
import agentie.clase.NotificatorManager;
import agentie.clase.NotificatorSMS;

public class Program {

	public static void main(String[] args) {
		Notificator notificatorSMS=new NotificatorSMS();
		Notificator notificatorEmail=new NotificatorEmail();
		Notificator notificatorManager=new NotificatorManager();

		notificatorSMS.setUrmatorulNotificator(notificatorEmail);
		notificatorEmail.setUrmatorulNotificator(notificatorManager);

		Client client=new Client("Popescu", null, null);

		notificatorSMS.notifica(client, "Notificare TEST");
	}

}
```

### Observatii

- Gestiunea urmatorului handler se face in clasa abstracta

- In cazul in care un handler concret nu poate sa rezolve problema il apeleaza pe urmatorul

- Ultimul handler din lant NU trebuie sa apeleze un next handler deoarece acesta nu exista

## Utilizari

- DNS Resolver

---

[Back](0_IntroinDesignPatternsComportamentale.md)
