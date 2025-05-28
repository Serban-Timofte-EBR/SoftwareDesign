# Mocks - Dubluri de testare

- Cand testam in CORRECT partea de REFERENCE folosim dubluri (mocks) pentru referintele externe

- Avem clasa Persoana cu getVarsta()

- Avem clasa Companie unde am metoda de angajeaza() si o lista de angajati. Compania are un Director General. Compania are metoda verificaLegalitatea()

- verificaLegalitate verifica varsta directorulu general sa fie major. Foloseste getVarsta din Persoana.

- Noi facem o dublura de test la Persoana pentru ca folosim metoda getVarsta din mocks. O sa avem mai multe tipuri de dubluri de test

## Dummy Object

- Nu face nimic in cod

- angajeaza adauga intr-o lista, dar nu apelez nimic din Persoana

- Adica nu ma intereaseaza functionalitatile din Angajat, ci trebuie doar sa existe

## Stub

- Imi intoarce o valoare hardcodata

- In cazul nostru de trebuie Stub si pentru minor si pentr major

## Spy

- Stub dar care numara de cate ori a fost apelata

## Fake

- O varianta simplificata a obiectului a obiectului original

- Noi calculam varsta dupa CNP, dar putem face un PersonFake unde nu avem CNP, folosim varsta. getVarsta nu extrage din CNP ci compara cu 18. Atributul se numeste valoareReturnataDeGetVarsta.

- Atributul nu este hardcodat, are setter si il folosesc mereu inainte de test pentru diferite cazuri

## Mock
