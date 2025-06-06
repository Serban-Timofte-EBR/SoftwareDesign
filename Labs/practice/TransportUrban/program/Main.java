package Creationale.X_Practice.TransportUrban.program;

import Creationale.X_Practice.TransportUrban.models.*;

public class Main {
    public static void main(String[] args) {
        VehiculFactory factory = new VehiculFactory("CMD-1d-43-g4");

        Camion vehiculTransport1 = (Camion) factory.creeazaVehicul(5000);
        vehiculTransport1.afiseazaDetalii();
        VehiculRegistry.adaugaVehicul(vehiculTransport1);

        Furgoneta vehiculTransport2 = (Furgoneta) factory.creeazaVehicul(2500);
        vehiculTransport2.afiseazaDetalii();
        VehiculRegistry.adaugaVehicul(vehiculTransport2);

        VehiculFactory factory2 = new VehiculFactory("CMD-2d-43-g4");
        MotocicletaCargo motocicletaCargo = (MotocicletaCargo) factory2.creeazaVehicul(20);
        motocicletaCargo.afiseazaDetalii();
        VehiculRegistry.adaugaVehicul(motocicletaCargo);

        Vehicul get1 = VehiculRegistry.getVehicul("CMD-1d-43-g4");
        System.out.println(get1);
    }
}
