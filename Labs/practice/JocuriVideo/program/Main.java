package Creationale.X_Practice.JocuriVideo.program;

import Creationale.X_Practice.JocuriVideo.model.Canvas;
import Creationale.X_Practice.JocuriVideo.model.ChangePozitionValidator;
import Creationale.X_Practice.JocuriVideo.model.Personaj;
import Creationale.X_Practice.JocuriVideo.model.Pozitie;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = Canvas.getInstance();

        System.out.println("========== ADAUGARE PERSONAJE ==========");
        canvas.adaugaPersonaj("SuperErou", new ChangePozitionValidator(false, new Pozitie(0, 0)));
        canvas.adaugaPersonaj("Animal", new ChangePozitionValidator(true, new Pozitie(21, 4)));
        canvas.adaugaPersonaj("Vrajitor",  new ChangePozitionValidator(false, new Pozitie(0, 0)));
        canvas.adaugaPersonaj("Vrajitor",  new ChangePozitionValidator(true, new Pozitie(100, 2000)));

        System.out.println("\n========== STARE CANVAS INITIAL ==========");
        System.out.println(canvas);

        System.out.println("\n========== VERIFICARE PROXIMITATE ==========");
        for (Personaj p : canvas.getPersonaje()) {
            boolean prox = p.verificaProximititate();
            System.out.println(p.getClass().getSimpleName() + " proximitate: " + prox);
        }

        System.out.println("\n========== STARE CANVAS DUPA VERIFICARE ==========");
        System.out.println(canvas);
    }
}