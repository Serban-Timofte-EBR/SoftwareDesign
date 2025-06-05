# First

- **F** = Fast

- **I** = Isolated / Independent

- **R** = Repeatable

- **S** = Self - Validating

- **T** = Timely

## Fast

- Testul dezvoltat trebuie sa fie rapid, deoarece daca avem prea multe teste, nu trebuie sa asteptam prea mult timp cand le executam

## Isolated

> Single Responsability (SOLID)

- Each unit test should have a single reason to fail

- Atunci cand un test esueaza, dezvoltatorul NU trebuie sa faca debug pentru a identifica ce este gresit si unde este problema

- Testul ar trebui sa fie izolat si sa spuna exact unde este problema

## Repeatable

- Rezultatele obtinute ar trebui sa fie identice indiferent de numarul de rulari ale acestor teste

- Testele ar trebui sa se desfasoarea in mod repetat, fara alte interventii

- NU folosim random() in teste

## Self - Validating

- Increderea in testele implementate

- In cazul in care trec, dezvoltatorul ar trebui sa aiba mare incredere ca codul este corect si fara erori

- Daca un test nu reuseste sa treaca, dezvoltatorul trebuie sa aiba incredere in faptul ca metoda trebuie imbunatatita ci nu sa considere ca testul este gresit

## Timely

- Cand trebuie sa punem in aplicare testele pentru metoda noastra?

- Cand consideram ca am facut toate testele?

## Tst Coverage

- Procentul de cod care este acoperit de teste
