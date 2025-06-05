# Mocks

- Mocks = Dubluri de testare

- În testarea automată este obișnuită folosirea obiectelor care arată și se comportă ca echivalentele lor de producție, dar sunt de fapt simplificate. Acest lucru reduce complexitatea, permite verificarea codului independent de restul sistemului și, uneori, este chiar necesar să se efectueze teste de auto-validare. Un termen generic folosit pentru aceste obiecte este dublură de testare.

- O dublura de testare este pur si simplu un alt obiect care se potriveste cu interfata colaboratorului necesar si poate fi trecut in locul sau. Exista mai multe tipuri de mocks

## Dummy Object

- Un obiect care respecta interfata, dar metodele nu fac nimic sau returneaza 0 sau null

- Cand trebuie sa folosim un obiect real, folosim un obiect dummy

```java
@Test
public void test {
    Companie company = new Companie("Company", new PersoanaDummy(), 0);

    List<IPersoana> lista = new ArrayList<>();
    lista.add(new PersoanaDummy());
    lista.add(new PersoanaDummy());
    lista.add(new PersoanaDummy());
    company.setSalariati(lista);

    assertEquals(3, company.getNumarSalariati());
}
```

## Stub

- Metodele de la un Stub vor returna raspunsuri hardcodate

- In acest fel putem folosi aceste obiecte cu apeluri reale

```java
public int getVarsta() {
    return 33;
}
```

```java
@Test
public void test_verificaLegalitatea() {
    IPersoana persoana = new PersoanaStub("Nume Prenume", "43");
    Companie c = new Companie("Companie", persoana, 1000);
    assertTrue(c.verificaLegalitate()); // verifica daca persoana director general este major
}
```

## Fake

- Este un obiect care se comporta ca unul real, dar are o versiune simplificata

- De obicei, pentru un fake, putem stabili ce valoare ar trebui sa se intoarca, dar NU va fi o valoarea hardcodata

```java
public class PersoanaFake {
    private int valoareaGetVarsta;

    public void setValoareaGetVarsta(int valoareaGetVarsta) {
        this.valoareaGetVarsta = valoareaGetVarsta;
    }

    @Override
    public int getVarsta() {
        returna valoareaGetVarsta;
    }
}
```

- Folosim seterul pentru a modifica valoarea varstei in functie de cum avem nevoie in scenariile de test

- Evitam folosirea mai multor stub-uri

## Spy

- Este un Stub sau un Fake care gestioneaza si numarul de apeluri realizate pentru metodele acestor obiecte

```java
public int getVarsta() {
    numberGetVarsta++;
    return 33;
}
```

```java
private int valoareaGetVarsta;

public int getVarsta() {
    numberGetVarsta++;
    returna valoareaGetVarsta;
}
```

## Mock

- Diferit de toate celelalte, dar functioneaza similar
