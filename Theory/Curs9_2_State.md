# State

- Un obiect poate performa diferite actiuni in functie de starea in care se afla.

- Un bancomat se afla in starea in care nu are card unde nu poate oferi retrageri de numerar sau interogare sold. Dupa ce am introdus cardul in bancomat, starea s-a schimbat in am card introdus, dar fara pin. Dar acum nu mai pot introduce alt card si tot asa.

- Vs Strategy: Schimbarea starii NU se face din afara (la strategy am setter public, la state am protected sau privat)

- **Sintaxa:** Adaugam un modul de rezervari care se poate afla in urma dintre urmatoarele stari: neplatita, platita, efectuata. Diferenta se face in functie de un eveniment exterior. Nu poate trece din neplatita in platita pur si simplu. Fiecare metoda verifica daca starea initiala este una care permite actiunea. De exemplu, poti plati doar daca esti in starea neplatita

- Implementarea in Rezervare se face cand tranzitia dintr-o stare in alta are mai multe optiuni. O pot face in clasa stare cand am o ordine cronologica simpla

- Implementarea se face neaparat cu clasele concrete de stare
