# Prototype

- Functioneaza bine cu factory model
- Context: Dureaza foarte mult preluarea din baza de date diferite informatii (exemplu: clauze contractuale persoane fizice / juridice)
- Exemplu: Fac un map in care am un contract pentru persoane fizice si unul pentru persoane juridice. Cand am nevoie il iau de acolo si clonez

## Context

- O lista de jucatori cu un set de antrenamente predefinite si o lista de medicamente interzise
- Un jucator nou consuma resurse => facem prototype
- Daca este identificat un medicament interzis nou, toti jucatorii trebuie sa afle (shallow copy)
- Lista de antrenamente este personala si fiecare jucator poate sa isi actualizeze propria lista de antrenamente (deep copy)