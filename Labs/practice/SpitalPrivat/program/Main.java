package Creationale.X_Practice.SpitalPrivat.program;

import Creationale.X_Practice.SpitalPrivat.models.Diagnostice;
import Creationale.X_Practice.SpitalPrivat.models.Pacient;
import Creationale.X_Practice.SpitalPrivat.models.PacientPrototypeFactory;

public class Main {
    public static void main(String[] args) {
        PacientPrototypeFactory factory = new PacientPrototypeFactory();

        Pacient pacient = factory.createNewPatient("Andrei Vasilesc", Diagnostice.DIABET);
        System.out.println("=================== Pacient Initial ===================");
        pacient.addTratament("Renunta la Nutella");
        System.out.println(pacient);

        Pacient pacient2 = factory.createNewPatient("Ionela Vasilesc", Diagnostice.DIABET);
        System.out.println("=================== Pacient 2 ===================");
        System.out.println(pacient2);

        pacient2.notificaMedicamentInterzis("PDL-1");
        System.out.println("=================== Medicament notificat ===================");
        System.out.println(pacient);
        System.out.println(pacient2);

        Pacient pacient3 = factory.createNewPatient("John Baston", Diagnostice.COVID19);
        pacient3.addTratament("Izolare");
        pacient3.notificaMedicamentInterzis("Nurofen");
        System.out.println(pacient3);
    }
}
