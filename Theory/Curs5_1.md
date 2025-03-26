# Builder

- Ajuta la crearea de obiecte concrete (complexe - ale unor clase cu foarte multe atribute)

- Construim obiectul prin intermediul setterilor

- Builderul face obiecte finale

- Paralela: Append din StringBuilder

- **Sintagma:** Sunt foarte multe atribute si multe sunt optionale. Este la alegerea clientului / agentiei (Are niste valori implicite)

- In Builder tin ca la Singleton o isntanta (PachetTurist) si prin build o returnez. Setterii din Builder intorc Builder type

- *SAU:* O sa avem efectiv dublate atributelor si in clasa efectiva si in builder si in build apelam constructorul clasei

- Daca se cere ca obiectul sa fie final setterii si constructorii se fac privati
