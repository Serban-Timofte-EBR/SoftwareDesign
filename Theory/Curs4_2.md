# Factory Method

- Are un ConcreteCreator care returneaza un obiect

- Avem un Creator abstracta si o clasa concreta CreatorObiect pentru fiecare obiect

- Pentru clasele Cazare, Transport as avea CazareCreator, TransportCreator si o clasa generala Creator

- Tot incalca Open Close, dar este mai usor de generalizat

## Exemplu

- Pachet Turistic cu 2 variante CazareHotel, CazareHotel

- Pacjet Tursitc cu 2 variante TransportAutobuz, TransportMicrobuz

- Toate sunt pachete turistice

- Am 2 fabrici: FabricaCazare, FabricaTransport

- Ambele fabrici sunt din fabrica finala

- O paralela este ca o fabrica are mai multe linii de productie
