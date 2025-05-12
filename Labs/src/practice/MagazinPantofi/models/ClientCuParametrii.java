package practice.MagazinPantofi.models;

import java.util.List;
import java.util.Scanner;

public class ClientCuParametrii implements IClient{
    @Override
    public List<Pantof> cautare(List<Pantof> pantofi) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Activezi filtrul de pret? (Y/N): ");
        boolean preet = scanner.nextBoolean();

        System.out.print("Activezi filtrul de marime? (Y/N): ");
        boolean marime = scanner.nextBoolean();

        System.out.print("Doresti aceasta ordine? Y - Da, aplicam in aceata ordine. N - Inversam ordinea: ");
        boolean reverseOrder = scanner.nextBoolean();

        return Magazin.filtrare(preet, marime, reverseOrder);
    }
}
