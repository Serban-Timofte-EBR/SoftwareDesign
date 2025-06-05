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
