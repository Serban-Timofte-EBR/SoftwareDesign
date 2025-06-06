package Creationale.X_Practice.JocuriVideo.model;

import java.util.List;

public interface Personaj{
    void spuneCeva();
    boolean verificaProximititate();
    Pozitie getPozitie();
    void setPozitie(Pozitie pozitie);
    Personaj clonePesonaj();
    List<String> getMesajeVocale();
}
