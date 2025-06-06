package Creationale.FactoryMethod.models;

public class ESPRESSOFacotory implements BauturaFactory {
    @Override
    public Bautura creareBautura() {
        return new ESPRESSO();
    }
}
