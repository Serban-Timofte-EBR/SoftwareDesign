package week3_SOLID.clase;

public class CalculatorSalariu {
    // Respectam S si L din SOLID
    public static float calculareSalariu(ISalariedEmployee employee) {
        if (employee instanceof Angajat angajat) {
            return angajat.getSalariulDeBaza() + angajat.getOreLucrate() * angajat.getOreLucrate();
        } else {
            return employee.getOreLucrate() * employee.getTarifPeOra();
        }
    }
}
