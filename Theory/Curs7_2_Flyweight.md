# Flyweight

- Utilizant cand avem nevoie de foarte multe obiecte in memorie. Obiectele create au multe elemente comune

- **Use Case:** Un joc de masini cu tribune. Cand trece masina trebuie sa se vada lumea din tribune. Cum stocam persoanele din tribuna ca sa apara doar cand trece masina fara a aloca multa memorie?

- **Use Case:** Stundentii dintr-o facultate sunt sparti dupa varsta: sectiunea 20, 21, 22 si in clasa student tin minte categoria din care face parte

- Ne facem o clasa doar cu atributele comune identice si o clasa cu elementele care nu sunt comune (diferentele dintre persoane). Gestiona, doar legatura intre ele

- **Sintagma:** Un grup care are acelasi hotel, destinatie si mic-dejun. Se pot adauga optional excursii noi, cina, etc. MEMORIA TREBUIE FOLOSITA IN MOD OPTIM. /
Exista o parte comuna si o parte optionala

- Eu am un Singleton registry unde imi tin template-urile dupa ID. Cand vreua sa fac pachetul final am ID-ul de template pentru a-l prelua si atasez clasa de Optionale pentru a forma tot pachetul

- Nu pot sa mut in alte grupuri

- Nu folosim FlyWeight cand avem putine obiecte pentru ca se poate pierde mai multa memorie. Trebuie sa fie foarte multe obiecte

- Corelat cu Factory: Avem o fabrica de pachete (de acele template-uri)
