# Principii de testare unitara

## Right - BICEP

- Avem niste KPIs la fiecare metoda

- To be recaped

## CORRECT

- Anumite teste sunt deja realizate de Right - BICEP

### Conformance

- Conformitatea formatului

  - Exemplu format data
  - Format email, telefon
  - Sa fie 13 cifre in CNP

- Ofera rezultate si pentru cazul pozitiv si pentru cel negativ

### Ordering

- De regula pe liste/colectii

- Verifica daca elementele sunt intr-o anumita ordine

- Arbore echilibrat cu elementele primite deja crescator si arborele trebuia echilibrat

- Verificam daca elementele sunt intr-o ordine ceruta

- Util pentru Chain DP

### Range

- Stabilim un interval pentru parametrii si pentru rezultate. Facem teste cu acele valori din interiorul intervalului (din BICEP - RIGHT Tests, NU Limit tests care sunt cu valorile extreme).

- Cu RANGE testam din exteriorul intervalului.

### Reference

- Unele metode poate avea referinte externe (o metoda care citeste din DB sau apeleaza o alta functie si utilizeaza informatia). Acestea sunt referinte externe

- Cand avem astfel de situatii trebuie sa izolam referinta externa sau sa o controlam

- Aceste referinte externe sunt preconditii / conditii preliminare

### Existance

- Verifica cum se comporta metoda daca un parametru nu exista

- Asemenator cu Error Check

### Cardinality

- Regula 0-1-n

- Daca merge metoda pentru 0 (prima valoare - Boundary Test inferior) si pentru 1 (teste de RIGHT - corectitudine) si undeva in interior atunci merge pentru toate

### Time

- Similar cu testul de performanta din Right-BICEP

- Verificam daca metoda rezolva problema intr-un timp optim

- In plus, se aplica ideea daca metoda este apelata inainte sau dupa o alta metoda (ca la Template). Adica se gandeste si daca functia este apelata la timpul potrivit la runtime

## Others

- Clasa care contine testele se numeste TestCase unde am obiectul care o sa fie folosit in cadrul testului (Fixture). Acestea se initializeaza in setup (se apeleaza inainte de test si initializeaza obiectele de test)
