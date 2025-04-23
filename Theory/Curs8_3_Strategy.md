# Strategy

- Implementeaza o logica (strategie) la runtime

- Avem mai multi algoritmi si la momentul executiei depind de ce algoritm voi folosi

- Evita utilizarea de if-else cases

- Contextul contine Strategy (clasa abstracta) si in functie de tipul clasei concrete utilizeaza un usecase

- **Sintagma:** Decidem in momentul executiei / In momentul platii / Trebuie sa stabilim la un anumite moment. Agentia doreste implementarea modulului de plata al pachetelor turistice rezervate. Modul de plata il decide clientul

- Un client are o metoda plateste si un atribut modPlata de tipul clasei abstracte. La chemarea functiei plateste in functie de valoarea atributului modPlata vedem care este varianta setata. Avem clasa Client, clasa abstracta ModPlata si clasele concrete PayPal, Cash, Card

- Asemanator cu un factory

- Pentru exemplul dat vine si cu setter pe modPlata.

- Modelul paseaza responsabilitatea catre clasa concreta

- Utilizari: Furnizarea metodei de comparare la runtime, utilizarea validatoarelor pentru anumite controale

- **La Strategy setam noi strategia folosita**
