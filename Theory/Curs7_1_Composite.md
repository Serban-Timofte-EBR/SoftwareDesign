# Composite

- Crearea unei structuri ierarhice sau o structura arborescenta prin compunerea de obiecte

- Seamna cu structuri ierarhice / arborescente ca logica

- Il folosim cand vrem sa organizam obiecte intr-o ierarhie. Creeaza 2 tipuri de clase (sau mai multe) cu relatii care rezulta structura ierarhica

- **Use Case:** Organigrama unei companii: Angajat, People Manager. Fiecare angajat primeste salariu, ponteaza, etc. People Managerul stabileste bonusuri. Composite face o clasa abstracta cu functionalitatile generale. Ulterior avem o frunza - Angajat - care nu are subordonati. Celalat nod este Manager, Sef Departament, Director, etc care are subordonati (fie Manager, Angajat simplu, etc - de asta folosim clasa abstracta / interfata Angajat cu comportamentul comun). SAU: meniu de restaurant cu categorii (Supe, Carne, Pizza, Bauturi, etc) si item-uri. SAU: Repartizarea studentilor pe serii si grupe

- **Sintagma:** Sa fie organizat intr-o ierarhie  / structura arborescenta / Fiecare categorie poate sa contina subcategorii

- Avataje: Pentru a nu rescrie cod pentru mostenire, pentru a muta elemente (doar delete si add) fara a reface obiectul
