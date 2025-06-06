package practice.MagazinPantofi.program;

import practice.MagazinPantofi.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Magazin.filtrare(true, true, true);
        ClientCuParametrii clientCuParametrii = new ClientCuParametrii();
        clientCuParametrii.cautare(Magazin.stocPantofi);
    }
}
