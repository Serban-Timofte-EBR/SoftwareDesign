# CORRECT

- Fiecare subprincipiu are o intrebare care ar trebui sa fie in mintea testerului

- Acest principiu este folosit pentru a stabili conditiile limita pentru testele de Boundary din Right-BICEP

## C = Conformance

- Conformitatea formatului

- Se aplica in numeroase domenii in care ceva ar trebui sa indeplineasca anumite standarde specifice

- De obicei, pentru orice intrare si pentru orice iesire trebuie sa se verifice conformitatea cu un format sau cu un standard

- Testele pot fi efectuate pentru a verifica ce se întâmplă dacă datele de intrare nu sunt conforme cu formatul sau pentru a vedea dacă rezultatul obținut este conform cu formatul specific proiectului.

- Exemplul 1: Validarea unui CNP

```java
public class Validatori {
    public boolean esteCNPValid(String cnp) {
        if (cnp == null || !cnp.matches("\\d{13}")) {
            return false;
        }
        return true;
    }
}
```

```java
@Test
public void testCNPFormatCorect() {
    Validatori v = new Validatori();
    boolean rezultat = v.esteCNPValid("1980101223345");
    assertTrue(rezultat);
}

@Test
public void testCNPFormatPreaScurt() {
    Validatori v = new Validatori();
    boolean rezultat = v.esteCNPValid("12345");
    assertFalse(rezultat);
}

@Test
public void testCNPFormatCaractereNepermise() {
    Validatori v = new Validatori();
    boolean rezultat = v.esteCNPValid("abcdeFGHIJKLM");
    assertFalse(rezultat);
}
```

- Conformance poate fi aplicat și pe output (ex: "prețul afișat trebuie să aibă două zecimale", "emailul trimis trebuie să conțină domeniu valid").

## O = Ordering

- Ordinea

- Testele de ordine sunt specifice listelor, dar nu numai

- In cazul listelor, trebuie sa verificam daca ordinea articolelor este cea dorita

- De asemenea, putem testa comportamentul metodei daca primeste anumiti parametrii intr-o alta ordine sau o lista de elemente intr-o ordine diferita de cea asteptata

- Exemplul 1: Sortarea

```java
public class Sortator {
    public List<Integer> sorteaza(List<Integer> lista) {
        if (lista == null) {
            throw new IllegalArgumentException("Lista nu poate fi null");
        }
        List<Integer> copie = new ArrayList<>(lista);
        Collections.sort(copie); // sortare crescătoare
        return copie;
    }
}
```

```java
@Test
public void testListaSortataCrescator() {
    Sortator s = new Sortator();
    List<Integer> input = Arrays.asList(5, 3, 8, 1);
    List<Integer> rezultat = s.sorteaza(input);

    assertEquals(Arrays.asList(1, 3, 5, 8), rezultat);
}

@Test
public void testListaDejaSortata() {
    Sortator s = new Sortator();
    List<Integer> input = Arrays.asList(1, 2, 3, 4);
    List<Integer> rezultat = s.sorteaza(input);

    assertEquals(Arrays.asList(1, 2, 3, 4), rezultat);
}

@Test
public void testListaInversa() {
    Sortator s = new Sortator();
    List<Integer> input = Arrays.asList(9, 7, 3, 1);
    List<Integer> rezultat = s.sorteaza(input);

    assertEquals(Arrays.asList(1, 3, 7, 9), rezultat);
}
```

## R = Range

- Pentru valorile de intrare / iesire sunt setate anumite intervale. Aceste intervale trebuie verificate

- Toate functiile care au un index trebuie sa fie testate pentru interval, deoarece acel index are un domeniu stabilit

- De obicei, este necesar să verificați :

  - Valorile inițiale și finale pentru index au aceeași valoare;
  - Primul element este mai mare sau mai mic decât ultimul element;
  - Ce se întâmplă dacă indicele este negativ;
  - Ce se întâmplă dacă indicele este mai mare decât limita superioară;
  - Numărul de articole nu este același cu cel pe care îl doriți - dimensiunea;
  - etc.

- Exemplul 1: Extragerea unui element dupa index

```java
public class OperatiiPeListe {
    public int elementLaPozitie(int[] lista, int index) {
        if (lista == null || index < 0 || index >= lista.length) {
            throw new IndexOutOfBoundsException("Index invalid");
        }
        return lista[index];
    }
}
```

```java
@Test
public void testIndexValid() {
    OperatiiPeListe op = new OperatiiPeListe();
    int[] lista = {10, 20, 30};
    int rezultat = op.elementLaPozitie(lista, 1);
    assertEquals(20, rezultat);
}

@Test(expected = IndexOutOfBoundsException.class)
public void testIndexNegativ() {
    OperatiiPeListe op = new OperatiiPeListe();
    int[] lista = {10, 20, 30};
    op.elementLaPozitie(lista, -1);
}

@Test(expected = IndexOutOfBoundsException.class)
public void testIndexEgalCuDimensiunea() {
    OperatiiPeListe op = new OperatiiPeListe();
    int[] lista = {10, 20, 30};
    op.elementLaPozitie(lista, 3); // lista.length = 3
}

@Test
public void testIndexZero() {
    OperatiiPeListe op = new OperatiiPeListe();
    int[] lista = {10, 20, 30};
    int rezultat = op.elementLaPozitie(lista, 0);
    assertEquals(10, rezultat);
}

@Test
public void testIndexUltimaPozitie() {
    OperatiiPeListe op = new OperatiiPeListe();
    int[] lista = {10, 20, 30};
    int rezultat = op.elementLaPozitie(lista, 2);
    assertEquals(30, rezultat);
}
```

### Testarea Range – legătura cu RIGHT-BICEP

Testarea de tip **Range** este un cadru extins de verificare a valorilor care pot fi trimise ca input către o metodă. Ea include:

- **Valori valide** din interiorul intervalului

  - echivalent cu testele **Right** din RIGHT-BICEP

- **Valori la limitele intervalului** (minime și maxime)

  - echivalent cu testele **Boundary** din RIGHT-BICEP

- **Valori în afara intervalului**
  - echivalent cu testele **Error** din RIGHT-BICEP

Astfel, testarea **Range** combină cele mai importante trei litere din RIGHT-BICEP într-un singur principiu logic și aplicabil:

- `R` (Right)
- `B` (Boundary)
- `E` (Error)

Testele Range sunt esențiale pentru:

- metode care lucrează cu indici,
- funcții care presupun limite de validitate numerică,
- verificarea robustă a inputului.

## R = Referene

- Anumite metode depind de lucruri externe sau de obiecte externe acestor metode. Aceste elemente trebuie verificare si controlate

- Exemple:

  - O aplicație web necesită conectarea utilizatorului;
  - O extragere din stivă funcționează dacă există elemente în stivă;

- Aceste elemente sunt numite **preconditii** sau **conditii preliminare**

- Aceste teste sunt efectuate folosind dubluri de test (stub, fake, dummy, mock)

### Reference - Exemplu Stiva

- Avem o metoda care extrage un element dintr-o stiva. Functionarea metodei depinde de starea interna a stivei (conditie preliminara). Daca stiva este goala, metoda arunca o exceptie

- Clasa Stiva, de testat:

```java
public class Stiva {
    private final Deque<Integer> stiva = new ArrayDeque<>();

    public void push(int val) {
        stiva.push(val);
    }

    public int pop() {
        if (stiva.isEmpty()) {
            throw new IllegalStateException("Stiva este goală");
        }
        return stiva.pop();
    }

    public boolean esteGoala() {
        return stiva.isEmpty();
    }
}
```

- Testele pentru Reference

```java
// Testam pop() dupa ce am setat explicit conditia interna (stiva are elemente)
@Test
public void testPopCuValoriInStiva() {
    Stiva s = new Stiva();
    s.push(10);
    s.push(20);

    int rezultat = s.pop();
    assertEquals(20, rezultat);
}

@Test(expected = IllegalStateException.class)
public void testPopPeStivaGoala() {
    Stiva s = new Stiva(); // stiva e goală
    s.pop();               // aruncă excepție
}
```

## E = Existence

> does some given thing exist?

- Trebuie sa ne intrabam ce se intampla cu metoda daca un parametru nu exista, daca este null sau daca este 0

- De asemenea, pentru sistemele software care functioneaza cu fisiere sau cu conexiune la internet, este necesar sa se verifice existenta acestor fisiere / conexiuni. In caz contrar, aplicatia NU trebuie sa dea eroare, ci trebuie sa se comporte normal cu avertizarea utilizatorului de problema intampinata

> Make sure your method can stand up to nothing

- Este asemanator cu conditia de Eroare din Right-BICEP

- Exemplul 1: Citirea fisierelor de pe disc

```java
public class CititorFisier {
    public String citesteContinut(String path) {
        if (path == null) {
            return "Eroare: Calea este null";
        }

        File f = new File(path);
        if (!f.exists()) {
            return "Eroare: Fișier inexistent";
        }

        try {
            return new String(Files.readAllBytes(f.toPath()));
        } catch (IOException e) {
            return "Eroare la citire";
        }
    }
}
```

```java
@Test
public void testPathNull() {
    CititorFisier c = new CititorFisier();
    String rezultat = c.citesteContinut(null);
    assertEquals("Eroare: Calea este null", rezultat);
}

@Test
public void testFisierInexistent() {
    CititorFisier c = new CititorFisier();
    String rezultat = c.citesteContinut("fisierCareNuExista.txt");
    assertEquals("Eroare: Fișier inexistent", rezultat);
}
```

## C = Cardinality

> 0-1-n Rule

- Este similar cu testele de Existence si testele Range

- Trebuie sa verificam daca metoda/lista/colectia are 0 elemente, 1 element sau n elemente

- Foloseste principiul inductiei matematice:

> Se aplică principiul inducției:
>
> - Dacă metoda funcționează corect pentru `0` și `1`,
> - și presupunem că funcționează pentru `n-1`,
> - atunci putem valida că funcționează și pentru `n`.

- Daca functioneaza pentru 2,3 sau 4 elemente se considera ca va functiona pentru mai multe elemente, insa NU trebuie sa uitam de testul Boundary superior

### Exemplu: `mediaAritmetica(int[] valori)`

```java
public int mediaAritmetica(int[] valori) {
    if (valori == null || valori.length == 0) {
        throw new IllegalArgumentException("Lista nu poate fi null sau goală");
    }

    int suma = 0;
    for (int v : valori) {
        suma += v;
    }

    return suma / valori.length;
}
```

```java
// 0 elemente
@Test(expected = IllegalArgumentException.class)
public void testMediaCardinalitateZero() {
    Calculator c = new Calculator();
    c.mediaAritmetica(new int[] {});
}

// 1 element
@Test
public void testMediaCardinalitateUnu() {
    Calculator c = new Calculator();
    int rezultat = c.mediaAritmetica(new int[] {5});
    assertEquals(5, rezultat);
}

// n elemente
@Test
public void testMediaCardinalitateMaiMulte() {
    Calculator c = new Calculator();
    int rezultat = c.mediaAritmetica(new int[] {4, 6, 8});
    assertEquals(6, rezultat); // (4+6+8)/3
}
```

## T = Time

- Similar cu testul de performanta din Right-BICEP

- De asemenea, poate fi testat daca sablonul de apeluri este respectat (similar cu designul Template)

- De exemplu, pentru a apela metoda logout(), trebuie mai întâi să apelăm metoda de conectare().

### Exemplu 1 – test de timp (execuție rapidă)

```java
@Test(timeout = 100)
public void testCalculRapid() {
    Calculator c = new Calculator();
    int[] valori = new int[1_000_000];
    Arrays.fill(valori, 1);
    c.mediaAritmetica(valori); // trebuie să ruleze sub 100ms
}
```

### Exemplu 2 – test secvențial (ordine de apeluri)

```java
public class SesiuneUtilizator {
    private boolean esteConectat = false;

    public void conectare() {
        esteConectat = true;
    }

    public void logout() {
        if (!esteConectat) {
            throw new IllegalStateException("Trebuie să fii conectat înainte de logout");
        }
        esteConectat = false;
    }
}
```

```java
@Test(expected = IllegalStateException.class)
public void testLogoutFaraConectare() {
    SesiuneUtilizator s = new SesiuneUtilizator();
    s.logout(); // fără apelul anterior la conectare()
}
```

---

[Back](0_IntroInUnitTesting.md)
