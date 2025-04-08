# Facade

- Usureaza lucrul cu framework-uri complexe

- Realizeaza o fatada pentru acele framework-uri, iar cine doreste sa utilizeze acel framework poate folosi fatada creata, fara a cunoaste toate clasele, metodele si atributele

- Actioneaza similar cu un Gateway

- **Sintagma:** Sa se realizeze un modul care sa simplifice procesul de rezervare pentru operator / Sa simplifice munca / Sa nu mai fie nevoit sa verifice toate lucrurile

- Clasa Facade cuprinde metode care sa utilizeze metodelele din clasele frameworku-ului / subsistemului

```java
public static boolean verificareCamera(int codCamera){
  CamereLibere libere=new CamereLibere();
  if(libere.verificareCameraLibera(codCamera)) {
    Menajera menajera=new Menajera();
    if(menajera.esteCameraCurata(codCamera) && menajera.areProsoapeNoi(codCamera)){
        return true;
    }
    else
    {
        return false;
    }
  }
  else{
    return false;
  }
 }
```

- Fatada noastra  verifica daca avem o camera in care nu este nimeni cazat si apoi verifica daca menajera a curatat camera
