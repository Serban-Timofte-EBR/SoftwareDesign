package Creationale.X_Practice.SmartHome.program;

import Creationale.X_Practice.SmartHome.models.*;

public class Main {
    public static void main(String[] args) {
        DispozitivBuilder termostatBuilder = new DispozitivBuilder(TipuriDispozitiv.TERMOSTAT, "WiFi");

        Dispozitiv termostat = termostatBuilder
                .addSenzor("temperatura")
                .addSenzor("umiditate")
                .build();
        System.out.println(termostat);

        Dispozitiv termostat2 = termostatBuilder
                .addSenzor("temperatura")
                .build();
        System.out.println(termostat2);

        DispozitivBuilder camereBuilder = new DispozitivBuilder(TipuriDispozitiv.CAMERE_DE_SUPRAVEGHERE, "Zigbee");

        Dispozitiv cameraDeSupraveghere = camereBuilder
                .addSenzor("miscare")
                .build();
        System.out.println(cameraDeSupraveghere);

        DispozitivBuilder asistentBuilder = new DispozitivBuilder(TipuriDispozitiv.ASISTENT_VOCAL, "Bluetooth");

        Dispozitiv asistent = asistentBuilder
                .addSenzor("control vocal")
                .build();
        System.out.println(asistent);

        DispozitivPrototypeFactory prototypeFactory = new DispozitivPrototypeFactory();
        DispozitivBuilder prototypeBuilder = prototypeFactory.getCustomBuilder(TipPachete.PACHET_PREMIUM);

        Dispozitiv dispozitiv1PachetPremium = prototypeBuilder
                .addSenzor("miscare")
                .build();
        System.out.println(dispozitiv1PachetPremium);

        Dispozitiv dispozitiv2PachetPremium = prototypeBuilder
                .addSenzor("miscare")
                .removeSenzor("face recognition")
                .build();
        System.out.println(dispozitiv2PachetPremium);
    }
}
