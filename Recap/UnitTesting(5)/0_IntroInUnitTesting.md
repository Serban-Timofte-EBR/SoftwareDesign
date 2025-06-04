# Unit Testing

- Folosita pentru a semnala prezenta defectelor, dar nu garanteaza absenta acestora

- Unit Testing = o cale de testare a codului de catre programatori inca din etapa de dezvoltarea a software-ului

- Unit Test = secventa de cod folosita pentru testarea unei unitati bine definite din codul aplicatiei

## Test Driven Development (TDD)

- Dezvoltarea pe baza testelor

## Testarea BlackBox

- Metoda utilizata pentru a testa aplicatia software de catre persoanele care nu cunosc arhitectura interna a aplicatiei

- Testerul cunoaste doar datele de intrare si datele de iesire

### Avantaje

- Testele sunt realizate din punct de vedere al utilizatorului

- Testerul nu trebuie sa stie programare, limbajul folosit pentru dezvoltarea sau structura codului

- Testele sunt efectuate independent de dezvoltatori si au o perspectiva obiectiva

## Testarea WhiteBox

- Este o metoda de testare folosita de catre dezvoltatori sau de testerii care cunosc structura interna a apicatiei

### Avantajele

- Testarea poate fi facuta intr-o etapa anterioriara punerii in functiune

- Testarea este mai profunda, cu posibilitatea acoperirii mai multor scenarii

## JUnit

- Framework ce permite realizarea si rularea de teste pentru diferite metode din cadrul proiectelor dezvoltate

- Cel mai folosit pentru testarea codului Java

- Adaptare de la xUnit

### Desing Patterns

- Functioneaza pe modelul Composite si Command

- TestCase = obiect Command

- TestSuite = compusa din mai multe instante TestCase si TestSuite

### Concepte JUnit

- **Fixture** = set de obiecte utilizate in testare

- **Test Case** = clasa ce defineste setul de obiecte (fixture) pentru a rula mai multe teste

- **Setup** = o metoda de definire a setului de obiecte utilizare (fixture) inainte de testare

- **Teardown** = o metoda de distrugere a obiectelor (fixture) dupa terminarea testelor

- **Test Suite** = colectie de cazuri de testare (test cases)

- **Test Runner** = instrument de rulare a testelor (test cases) si de afisare a rezultatelor

### JUnit Skeleotn

- Stuctura de apel

```text
setUpBeforeClass()

    setUp()
            Test
    tearDown()

    setUp()
            Test
    tearDown()

    setUp()
            Test
    tearDown()

tearDownAfterClass()
```

### Adnotari

| Adnotare     | Utilizare                   |
| ------------ | --------------------------- |
| @BeforeClass | metoda setUpBeforeClass()   |
| @AfterClass  | metoda tearDownAfterClass() |
| @Before      | metoda seUp()               |
| @After       | metoda tearDown()           |
