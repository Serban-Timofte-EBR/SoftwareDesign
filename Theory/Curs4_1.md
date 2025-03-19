# Simple Factory Design Patern

- O fabrica care face mai multe obiecte

- Mai multe clase comuna care implementeaza aceeasi interfata. Fabrica creeaza obiecte din aceeasi familie

- Fabrica are o functie create_type care creeaza efectiv obiectul concret. Tipurile sunt printr-un enum

- Nu respecta Open/Close Principle

- **Sintagma:** Se vor crea obiecte pentru o familie de clase / obiecte din aceeasi familie / clase care implementeaza aceeasi interfata / etc.

- Factory nu se afla in GoF

## Participanti

- Abstract (interfata / clasa abstracta)

- Clasele concrete (Logan/Spring)

- Fabric efectiva (Fabrica Mioveni)

- Fabrica Mioveni produce masini, Logan, Spring. Ambele sunt masini produse de Dacia

## Utilizari

- Crearea de View-uri (findViewById)

- Gestionarea unei familii de obiecte

## Corelatii

- Singleton - fabrica poate sa fie unica