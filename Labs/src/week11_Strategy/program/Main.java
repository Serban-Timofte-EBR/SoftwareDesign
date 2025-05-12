package week11_Strategy.program;

import week11_Strategy.models.Admitere;
import week11_Strategy.models.GDPRStrategy;

public class Main {
    public static void main(String[] args) {
        Admitere admitere = new Admitere();
        admitere.setStrategy(new GDPRStrategy());

        admitere.admitere();
    }
}
