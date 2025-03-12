# Creational Design Patterns

- Un model / o schita pentru a rezolva o problema intr-un software

## Creationale

- Se ocupa de crearea de obiecte

- Singleton

- Builder

- Factory

- Factory Method

- Prototype

- (Abstract Factory)

## Structurale

- Prezinta relationarea dintre clase

## Comportamentale

- Distribuirea responsabilitatilor pe clase si descrie interactiunbea

## Design Patterns Creationale

- Cine este creat?

- Cand este creat acel obiect?

- Cum este creat?

- Cine creeaza acel obiect?

### Singleton

- O clasa ce poate sa fie instantiata o singura data

- Are constructor privat

- **Problema:** Avem un sistem informatic pentru o anumita entitate, o singura agentie, un singur spital, etc

#### Eager Initialization

- Initializarea instantei chiar daca aceasta nu este folosita

- Nu este eficienta ca putem sa nu folosim instanta

#### Eager Initialization - Static Block

- Definim o conexiune cu DB intr-un bloc static

#### Lazy Initialization

- Instantam cand avem nevoie de acea metoda

- Problema este cand avem multithreading cand metoda poate sa fie folosita pe 2 fire de executie

#### Thrad safe singleton

- Blocam functia getInstance pentru a nu fi folosita pe mai multe fire de executie
