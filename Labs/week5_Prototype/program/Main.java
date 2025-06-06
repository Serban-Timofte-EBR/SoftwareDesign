package week5_Prototype.program;

import week5_Prototype.modele.Jucator;
import week5_Prototype.modele.JucatorPrototypeFactory;
import week5_Prototype.modele.TipJucator;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Jucator jucator1 = JucatorPrototypeFactory.getPrototypeJucator(TipJucator.ATACANT);
        Jucator jucator2 = JucatorPrototypeFactory.getPrototypeJucator(TipJucator.MIJLOCAS);
        Jucator jucator3 = JucatorPrototypeFactory.getPrototypeJucator(TipJucator.FUNDAS);
        Jucator jucator4 = JucatorPrototypeFactory.getPrototypeJucator(TipJucator.PORTAR);
        Jucator jucator5 = JucatorPrototypeFactory.getPrototypeJucator(TipJucator.PORTAR);
        jucator5.setName("Victor Valdes");

        jucator5.addMedicamente("Paracetamol");
        jucator5.addAntrenamente("Pase la perete");

        System.out.println(jucator1);
        System.out.println(jucator2);
        System.out.println(jucator3);
        System.out.println(jucator4);
        System.out.println(jucator5);
    }
}
