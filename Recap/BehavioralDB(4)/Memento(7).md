# Memento

- Folosit atunci cand se doreste salvarea anumitor stari pentru obiectele unei clase

- Permite salvarea si revenirea ori de cate ori este dorit

- Folosit ca un mecanism de BackUp

![Diagrama Memento](../img/Diagrama%20Memento.png)

## Problema

- Pachetele din oferta agenției își modifică des prețul, în funcție de ofertele zilei sau de cererea din acea zi pentru pachete turistice.

- Agenția dorește implementarea unui modul prin care aceste prețuri să fie salvate, astfel încât să fie permisă revenirea la un anumit preț folosit anterior.

- Să se implementeze acest modul

### Implementare

- MementoPachetTuristic -> Memento -> clasa care gestioneaza starea interna a obiectului, care realizeaza imaginile sau starile intermendiare

- PachetTuristic -> Originator -> Clasa care are obiecte pentru care se pot salva stari intermediare

- ManagerPachete -> CareTaker -> Care care gestioneaza obiectele de tip Memento

#### Clasa memento

- MementoPachetTuristic -> Tine minte pretul pachetului la un moment dat

```java
package agentie.clase;

public class MementoPachetTuristic {
	double pretPachet;

	public MementoPachetTuristic(double pretPachet) {
		super();
		this.pretPachet = pretPachet;
	}

	public double getPretPachet() {
		return pretPachet;
	}
}
```

#### Clasa de baza

- PachetTurisitc -> Clasa care defineste modelul obiectului

```java
package agentie.clase;

public class PachetTuristic {

	private double pret;
	private String numePachet;

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public PachetTuristic(double pret) {
		super();
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "PachetTuristic [pret=" + pret + "]";
	}

	public MementoPachetTuristic salvareMemento(){
		return new MementoPachetTuristic(pret);
	}

	public void undoToMemento(MementoPachetTuristic memento){
		this.pret=memento.getPretPachet();
	}
}
```

#### Clasa Manager - Versionare

- ManagerPacheteTuristice -> Salveaza toate memento-urile

```java
package agentie.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerPacheteTuritice {
	private List<MementoPachetTuristic> listaPachete=new ArrayList<>();

	public void adaugaMemento(MementoPachetTuristic memento){
		listaPachete.add(memento);
	}

	public MementoPachetTuristic getMemento(int index){
		return listaPachete.get(index);
	}
	public MementoPachetTuristic getLastMemento() throws Exception{
		if(listaPachete.size()!=0){
			MementoPachetTuristic memento = listaPachete.get(listaPachete.size()-1);
			listaPachete.remove(listaPachete.size()-1);
			return memento;
		} else {
			throw new Exception("Nu exista stari salvate");
		}
	}

}
```

#### Clasa Program

- Salveaza pretul cand apeleaza adaugaMemento

```java
package agentie.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerPacheteTuritice {
	private List<MementoPachetTuristic> listaPachete=new ArrayList<>();

	public void adaugaMemento(MementoPachetTuristic memento){
		listaPachete.add(memento);
	}

	public MementoPachetTuristic getMemento(int index){
		return listaPachete.get(index);
	}
	public MementoPachetTuristic getLastMemento() throws Exception{
		if(listaPachete.size()!=0){
			MementoPachetTuristic memento = listaPachete.get(listaPachete.size()-1);
			listaPachete.remove(listaPachete.size()-1);
			return memento;
		} else {
			throw new Exception("Nu exista stari salvate");
		}
	}

}
```

### Observatii

- Este similar cu un caiet de notite in care iti notezi cheltuielile lunare atunci cand faci una

- Clasa Memeno este una externa si se ocupa de atributele pentru care trebuie realizata imaginea intermediara

## Utilizari

- Salvarea fisierelor

- Realizarea de backupuri

---

[Back](0_IntroinDesignPatternsComportamentale.md)
