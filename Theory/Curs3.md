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

- Are constructor privat !! By default este public

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

- Sycronized

#### Inner Static Helper Class

- Am o clasa si dau acces la acea clasa cand se cere in Main getInstance

```java
private static class AngentieHelper{
    private static final AgentieInnerClass instanta = AgentieInnerClass();
}

public static AgentieInnerClass getInstance() {
    return AgentieHelper.instanta;
}
```

#### Serializable Singleton

- Serializarea intr-un fisier

- Citesc din fisier

- Suprascriem **readResolve** in care apelam getInstanta

#### Singleton Collection / Registry

- Creeaza mai multe obiecte, dar cate un obiect pentru fiecare categorie

- Registrul Comertului -> Trebuie sa am unicitate pe nume -> Registrul creeaza mai multe firme in general, dar cu unicitate pe nume. Asa functioneaza si Registry Singleton.

- Toate obiectele sunt gestionate intr-un map (sau set) cu cheia unica

### Singleton vs Clasa Statica

- Singleton genereaza un obiect care poate sa fie transmis intr-o functie sau intr-o metoda

- O clasa static, o functie dintr-o clasa statica nu poate

### Exemple

- Conexiune la baza de date

- O singura instanta pentru o aplicatie

- SharePreferences din Android
