# Right - BICEP

- **RIGHT** -> daca rezultatele furnizate de catre metoda sunt corecte

- **B** = Boundry -> trebuie verificate toate limitele si daca cazul acestor limite rezultate furnizate de metodata testat sunt corecte

- **I** = Inverse -> trebuie verificate relatiile inverse

- **C** = Cross - Check -> trebuie verificata corectitudinea printr-o verificare incrucisata, folosind metode de calcul asemanatoare, testate si validate de catre o comunitate de programatori

- **E** = Errors -> trebuie simulata si fortata obtinerea de erori pentru verificarea comportamentului metodei in cazul anumitor erori

- **P** = Performance -> trebuie verificata pastrarea performantei intre limitele acceptantei pentru produsul software final

- Consideram urmatoarea clasa pentru testare

```java
public class Calculator {
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
}
```

## Unit testing - RIGHT

- De fiecare data cand testam o metoda, primul lucru ar trebui verificat este ca metoda ofera rezultate corecte

- Prima directie este de a verifica corectitudinea rezultatelor

- Aceasta verificare se face in conformitate cu specificatiile proiectului dezvoltat

- Odata ce limitele au fost determinate, se efectueaza teste exact pentru aceste valori

- **IMPORTANT:** Testarea Boundry presupune testarea corectitudinii valorilor din interval, NU din afara intervalului

- Testele se fac si pentru limitele inferioare si pentru cele superioare

- Pentru identificarea limitelor se poate folosi principiul CORECT - next file

- Exemplul 1 - Test RIGHT pentru valori pozitive

```java
@Test
public void testMediaCorectaValoriPozitive() {
    Calculator c = new Calculator();
    int[] valori = {4, 6, 8};
    int rezultat = c.mediaAritmetica(valori);
    assertEquals(6, rezultat);
}
```

- Exemplul 2 - Test RIGHT pentru valori negative:

```java
@Test
public void testMediaCorectaValoriNegative() {
    Calculator c = new Calculator();
    int[] valori = {-2, -4, -6};
    int rezultat = c.mediaAritmetica(valori);
    assertEquals(-4, rezultat);
}
```

## Unit Testing - Boundry

- Problemele aper, de obicei, la "margini". Asadar, trebuie sa fim atenti sa testam metodele pentru limitele intervalelor

- Pentru fiecare metoda, trebuie sa determinam intervalul in care pot fi valorile parametrilor de intrare, precum si intervalul de rezultate furnizat de metoda

- Testele Boundry sunt o subcategorie specializata a testelor RIGHT. Verifica daca rezultatul este corecte in cazurile de limita

- Exemplul 1 - Media unui singur element

```java
@Test
public void testMediaUnSingurElement() {
    Calculator c = new Calculator();
    int[] valori = {10};
    int rezultat = c.mediaAritmetica(valori);
    assertEquals(10, rezultat);
}
```

- Exemplul 2 - Valori maxime acceptate pentru tipul int

```java
@Test
public void testMediaValoriMaxime() {
    Calculator c = new Calculator();
    int[] valori = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    int rezultat = c.mediaAritmetica(valori);
    assertEquals(Integer.MAX_VALUE, rezultat);
}
```

- Exemplul 3 - Intervale de varsta

```java
public class Reduceri {
    public int calculReducere(int varsta) {
        if (varsta < 0 || varsta > 120) {
            throw new IllegalArgumentException("Vârsta este invalidă");
        }

        if (varsta < 12) {
            return 50; // 50% reducere pentru copii
        } else if (varsta >= 65) {
            return 30; // 30% reducere pentru seniori
        } else {
            return 0;  // fără reducere
        }
    }
}
```

```java
@Test
public void testReducereLimitaMinima() {
    Reduceri r = new Reduceri();
    int reducere = r.calculReducere(0);
    assertEquals(50, reducere);
}
```

```java
@Test
public void testReducereLimitaTrecereCopil() {
    Reduceri r = new Reduceri();
    int reducere = r.calculReducere(12);
    assertEquals(0, reducere);
}
```

## Unit Testing - Inverse relationship

- Anumite metode pot fi testate prin aplicarea regulii inverse:

> Pornind de la rezultat, trebuie sa se ajunga la aceeasi intrare de la care a inceput initial

- NU se aplica pentru toate metodele

- De obicei, se aplica doar metodelor matematice

- De asemenea, pentru bazele de date se poate verifica daca a fost efectuata o inserare prin operatia inversa SELECT

- Exemplul 1: Conversia Celsius - Kelvin

  - Clasa pe care o testam

```java
public class ConversieTemperatura {
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
```

```java
@Test
public void testConversieInverse() {
    ConversieTemperatura conv = new ConversieTemperatura();
    double celsius = 25.0;
    double kelvin = conv.celsiusToKelvin(celsius);
    double celsiusRecuperat = conv.kelvinToCelsius(kelvin);

    assertEquals(celsius, celsiusRecuperat, 0.0001);
}
```

- Exemplul 2: Verificarea inserarii in baza de date

```java
@Test
public void testInsertSelectInverse() {
    bazaDate.insert("user123");
    boolean exista = bazaDate.select("user123");
    assertTrue(exista);
}
```

## Unit Testing - Cross-Check

- Pentru fiecare metoda, putem incerca sa o testam utilizand alta metoda

- De obicei, exista mai multe modalitati de a rezolva o problema. Astfel, se poate utiliza o alta metoda pentru a rezolvarea problemei pentru verificarea / testarea metodei nou implementate

- Este posibila atunci cand metoda implementata a fost conceputa pentru a creste productivitatea sau daca metoda veche consuma prea multe resurse

- Testarea metodei noi se face prin metoda veche, chiar daca aceasta consuma mai multe resurse

### Explicatii suplimentare

- Presupunem ca avem 2 metoe diferite care fac acelasi lucru, dar:

  - una este optimizata sau nou creata (mai rapida)
  - alta este mai sigura, dar lenta (de incredere)

- Folosim cross-check cand vrem sa inlocuim o metoda deja existenta cu alta noua, dar testam inainte sa aiba acelasi comportament

- Exemplul 1: Calculul factorial

```java
public class FactorialCalculator {

    // metoda nouă: recursivă
    public long factorialNou(int n) {
        if (n <= 1) return 1;
        return n * factorialNou(n - 1);
    }

    // metoda de referință: iterativă, sigură
    public long factorialReferinta(int n) {
        long rezultat = 1;
        for (int i = 2; i <= n; i++) {
            rezultat *= i;
        }
        return rezultat;
    }
}
```

```java
@Test
public void testFactorialCrossCheck() {
    FactorialCalculator f = new FactorialCalculator();
    for (int n = 0; n <= 15; n++) {
        long recursiv = f.factorialNou(n);         // metoda nouă
        long iterativ = f.factorialReferinta(n);   // metoda veche, sigură
        assertEquals(iterativ, recursiv);
    }
}
```

## Unit Testing - Error conditions

- Testam fiecare metoda unitar si verificam si situatiile in care aplicatia ar putea sa crape

- Dacă am studiat limitele extreme pentru valorile de intrare sau valori rezultate, testarea pentru furnizarea erorilor ar trebui să utilizeze valori în afara acestor intervale.

- Testarea de fortare a erorilor se face pentru toate metodele. Toate metodele au cel putin o situatie in care vor oferi erori. Testarea se face pentru aceste situatii si se verifica daca metoda trateaza acel caz si arunca sau ofera o exceptie

- Exemplul 1: Media aritmetica

```java
@Test(expected = IllegalArgumentException.class)
public void testMediaArrayNull() {
    Calculator c = new Calculator();
    c.mediaAritmetica(null);
}
```

```java
@Test(expected = IllegalArgumentException.class)
public void testMediaArrayGoala() {
    Calculator c = new Calculator();
    c.mediaAritmetica(new int[]{});
}
```

- Exemplul 2: Calcul reducere

```java
@Test(expected = IllegalArgumentException.class)
public void testReducereVarstaNegativa() {
    Reduceri r = new Reduceri();
    r.calculReducere(-5);
}
```

## Unit Testing - Performance

- Pentru diferite metode este posibil sa se testeze cat de bine functioneaza metoda respectiva

- Pe langa testarea corectitudinii rezultatelor, este foarte important sa se verifice performanta procesarii

- Verificarea performantei inseamna: consumul de resurse && durata de timp

- Testarea performantei se face atunci cand input-ul sau rezultatul unei metode este reprezentat de o lista sau de un numar foarte mare de elemente, iar valorile pot creste foarte mult

- Se testeaza prin

```java
@Test(timeout=100)
```

- Exemplul 1: Lista de numere pentru media aritmetica este foarte mare

```java
@Test(timeout = 100)
public void testMediaPerformanta() {
    Calculator c = new Calculator();
    int[] valori = new int[1_000_000];
    Arrays.fill(valori, 1); // toți cu valoarea 1

    c.mediaAritmetica(valori);
}
```

- Exemplul 2: Rulari masive pentru consistenta

```java
@Test(timeout = 100)
public void testReducereExecutiiMasive() {
    Reduceri r = new Reduceri();
    for (int i = 0; i < 1_000_000; i++) {
        r.calculReducere(65); // apel repetat
    }
}
```
