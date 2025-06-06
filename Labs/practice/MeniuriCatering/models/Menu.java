package Creationale.X_Practice.MeniuriCatering.models;

import java.util.List;

public interface Menu {
    List<String> getFeluriPrincipale();
    List<String> getDeserturi();
    List<String> getBauturi();
    int calculeazaTimpTotalPreparare(int nrPersoane);
}
