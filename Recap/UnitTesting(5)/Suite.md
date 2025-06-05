# Suite de testare

## Utilizarea fisierelor pentru datele de test

- Se va un singur TestCase cu metoda de assert apelata intr-un loop

- Pentru fiecare set de date de test din fisier se apeleaza metoda assert

- Fisierul (sau fuluxul) este considerat un fixture si de aceea trenuie deschis in setUp si inchis in tearDown

## Custom TestSuite

- Pentru crearea unuei suite custom sunt incluse toate categoriile dorite

- In cazul de fata, se include o singura categorie de teste. Testele din aceasta categorie se regasesc in doua TestCase-uri CompanyTest si PersonTest

```java
@RunWith(Categorie.class)
@IncludeCategory(CustomSuite.class)
@SuiteClasses({CompanyTest.class, PersonTest.class})
public class NewSuiteTests{

}
```

## Suita de test

### Categoriile de teste

- O clasa de baza pentru toate testele Right-BICEP

```java
package week14_junit.categorii;

public class TestRBICEP {
}
```

- O clasa de baza pentru toate testele de existance

```java
package week14_junit.categorii;

public class TestExistance {
}
```

- Clasele custom pentru anumite principii

```java
package week14_junit.categorii;

public class TestException extends TestRBICEP {
}
```

```java
package week14_junit.categorii;

public class TestRight extends TestRBICEP {
}
```

### Clasa de teste unitare

```java
public class ConstructorMasinaTest {

    @Category(TestRight.class)
    @Test
    public  void testRight() throws Exception {
        Masina masina = new Masina("Opel", 5000, 2010);
        // Nu este recomandat sa facem mai multe teste la acest mod. In acest mod nu facem testare Right pentru ca avem mai multe valori verificate
        assertEquals("verif model", "Opel", masina.getModel());
        assertEquals("verif pret", 5000, masina.getPret(), 0.001);
        assertEquals("verif an", 2010, masina.getAnFabricatie());
    }

    @Test
    public  void testBoundry() throws Exception {
        Masina masina = new Masina("Opel", 100000, 2010);
        // Nu este recomandat sa facem mai multe teste la acest mod. In acest mod nu facem testare Right pentru ca avem mai multe valori verificate
        assertEquals("verif model", "Opel", masina.getModel());
        assertEquals("verif pret", 100000, masina.getPret(), 0.001);
        assertEquals("verif an", 2010, masina.getAnFabricatie());
    }

    // Existance testing
    @Category(TestExistance.class)
    @Test(expected = ExceptieModelNull.class)
    public void testExistance() throws Exception {
        Masina masina = new Masina(null, 5000, 2010);
    }
}
```

### Suita de teste custom

```java
@RunWith(Categories.class)  // IMPORTANT: Aici merge doar cu Categories. Daca folosim SUITE ruleaza clasele de test
@Categories.IncludeCategory({TestRBICEP.class}) // Se uita si la clasele care deriveaza clasa de aici
@Suite.SuiteClasses({ConstructorMasinaTest.class, MasinaTest.class})
public class SuitaPartialaIncludeRight {

}
```

1. `RunWith` spune daca vrem sa executam toata suita de teste sau doar anumite categorii

   - **IMPORTANT:** Daca marcam cu `Categories.class` executam urmatorele linii. Daca marcam cu `Suite.class` atunci NU mai conteaza ce configuram in urmatorii pasi

2. `Categories.IncludeCategory` spune tipul de teste pe care vrem sa le executam

   - **IMPORTANT:** Trebuie sa fie marcat functia `@Test` cu adnotarea `@Category()`

3. `Suite.SuiteClasses` ne spune care sunt clasele cu teste pe care vrem sa le executam

## JUnit 5

- Vine si adauga adnotarea @Tag

```java
@Test
@Tag("Performance")
@Tag("Fast")

@Test
@Tag("Error")
@Tag("Slow")
```
