package week11_Strategy.models;

import week11_Chain.models.Candidat;

import java.util.List;

public class GDPRStrategy implements IStrategy{
    @Override
    public void afisareCandidati(List<Candidat> listaCandidati) {
        System.out.println("======= Strategie de GDPR ========");
        // afisam nota
    }
}
