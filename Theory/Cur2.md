# Curs 2

## Clean Code

- Cod usor de citit

- Cod usor de inteles

- Cod usor de modificat

### Principii Clean Code

1. DRY

&emsp;&emsp; - Do not repeat yourself

&emsp;&emsp; - Izolam sectiunea de cod in functii si clase

&emsp;&emsp; - O modificare se face intr-un singur loc, nu in toate locurile unde este chemata functia

2. KISS

&emsp;&emsp; - Keep it simple and stupid (but significant)

&emsp;&emsp; - Codul trebuie pastrat simplu si usor de inteles

3. YAGNI

&emsp;&emsp; - Ypu aren't gonna need it

&emsp;&emsp; - Definesti functii si metode inutile

4. SOLID

&emsp;&emsp; - SRP (Single Repository)

&emsp;&emsp; - OCP (Open-Closed)

&emsp;&emsp; - LSP (Liskov substitution)

&emsp;&emsp; - ISP (Inteface segregation)

&emsp;&emsp; - Dependency inversion

#### Single Repository

- O clasa / metoda trebuie sa faca un singur lucru

- O clasa trebuie sa fie modificabila pentru un singur motiv

- Dintr-o clasa Student cu platesteTaxa, sustineExamen, salvareDB se sparge in 4 clase: Student, Calculator, Examen, Baza de date.

- Pentru usurinta se implementeaza o Fatada (Facade) care initializeaza obiectele si implementeaza logica

- Am o clasel PayCalculator, OrganizeExamene si fac obiecte in clasa fatada din care dau call

#### Open-Close Principle

- Clasele trebuie sa fie deschise pentru extensii, dar inchise pentru modificari

#### Liskov Substitution

- Design by Contract

- Obiectele trebuie sa fie inlocuite oricand in clasele fiu (Clase Abstracte / Interfete)

#### Inteface segregation

- In loc de o clasa Vehicul mai bine fac mai multe interfete de tipul ControlLumini, ControlRadio, ControlNavigatie, etc.

#### Dependency inversion

- Daca este respectat SRP este de preferat sa nu lucram cu clasele concrete

- Metoda de sustinereExamen primeste un argument de tip Student. Dar vine si o alta persoana care vrea sa specializeze, din afara, care nu este student. Metoda sustineExamen nu il poate primi ca argument pe acest om. **Cand implementam metode NU trebuie sa depindem de clasele concrete.** Putem rezolva cazul nostru printr-o clasa Cursant.
