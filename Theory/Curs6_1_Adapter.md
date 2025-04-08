# Adapter

- Rezolva problema utilizarii anumitor clase din framework-uri diferite (care nu au o interfata comuna)

- Se implementeaza prin clase Wrapper => clasele existente nu se modifica. **IMPORTANT:** Adapterul NU adauga funtionalitati noi.

- **Sintagma:** Clasele nu sunt asemenatoare cu cele din softul ... / Cele doua softuri sa fie folosite impreuna fara a modifica clasele / Nu sunt compatibile si nu vreau sa modific codul existent

- Avem Adaptor de Clase si Adaptor de Obiecte

- Adapterul de obiecte are clasa Adapter care contine o sintanta a clasei existente si implementeaza interfata la care trebuie sa se faca adaptarea

```java
public class PachetMasinaInchiriata implements PachetTuristic {

 private MasinaInchiriata masinaInchiriata;
 
 public PachetMasinaInchiriata(MasinaInchiriata masinaInchiriata){
  this.masinaInchiriata=masinaInchiriata;
 }
 
 @Override
 public void descriere() {
  System.out.println(this.masinaInchiriata.toString());
 }

 @Override
 public void rezervaPachet() {
  this.masinaInchiriata.inchiriazaMasina();
 }

```