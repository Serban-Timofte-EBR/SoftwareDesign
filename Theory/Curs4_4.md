# Prototype

- Ajuta la crearea de clone pentru obiectele a caror construire dureaza foarte mult / consuma foarte multe resurse

- Eu creez un obiect ca model. Spre exemplu un IPhone facut in California este folosit ca model pentru fabrica din China

- Prototipul nostru este Iphone, iar obiectele concrete sunt Iphone 10, 11, 12, etc. Prototype se refera practic la un catalog

- Prin acest design pattern se creeaza un obiect ca prototip. **Clonele sunt deep-copy**

- Adica o clasa care are Clone supra-scris (implement Clonable)

- **Sintagma:** Generat / Costisitor pentru a fi generat / Consuma foarte multe resurse

## Participanti

- Intefata de copiere (practic intefata Clonable refacuta)

- Clasa concreta

## Utilizari

- Cand folosim Clone, avem prototype

## Corelatii

- Factory -> o serie de obiecte care se refac (fabrica din China de Iphone-uri)
