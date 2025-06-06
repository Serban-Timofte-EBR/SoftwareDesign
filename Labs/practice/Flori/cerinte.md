# Comenzi online de flori

## Context general:
În cadrul unei aplicații de gestiune a comenzilor online pentru flori, se dorește implementarea unui modul pentru administrarea comenzilor de buchete.

## Cerinta 1:

Crearea unui buchet este un proces consumator de timp întrucât sunt necesare informații despre:

- tipurile de flori disponibile,

- culorile acceptate,

- stilurile de aranjare preluate dintr-o bază de date externă.

Din cauza timpului mare de inițializare, atunci când se creează un nou buchet de un anumit tip, sistemul trebuie să utilizeze o soluție de optimizare, fără a reface procesul lung de fiecare dată.

## Exercițiul 1:

- Implementați un design pattern care permite reutilizarea specificațiilor pentru un buchet deja creat, dar care să permită personalizarea anumitor detalii (ex: mesaj pe cartonaș, ambalaj diferit) pentru fiecare client.

- Țineți cont că fiecare buchet trebuie să fie independent odată creat (modificările pe unul nu trebuie să afecteze pe altele).

- Test: În Main, creați minim 3 comenzi de buchete pentru clienți diferiți, plecând de la aceleași specificații de bază, și demonstrați că personalizările sunt independente.