package week14_junit.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import week14_junit.categorii.TestExistance;
import week14_junit.categorii.TestRight;
import week14_junit.clase.Masina;
import week14_junit.exceptii.ExceptieModelNull;

import static org.junit.Assert.*;

public class ConstructorMasinaTest {

    @Category(TestRight.class)
    @Test
    public  void testRight() throws Exception {
        Masina masina = new Masina("Opel", 5000, 2010);
        // Nu este recomandat sa facem mai multe teste la acest mod. In acest mod nu facem testare Right pentru ca avem mai multe valori verificate
        assertEquals("verif model", "Opel", masina.getModel());
        assertEquals("verif pret", 5000, masina.getPret(), 0.001);
        assertEquals("verif an", 2010, masina.getAnFabricatie());
    }

    @Test
    public  void testBoundry() throws Exception {
        Masina masina = new Masina("Opel", 100000, 2010);
        // Nu este recomandat sa facem mai multe teste la acest mod. In acest mod nu facem testare Right pentru ca avem mai multe valori verificate
        assertEquals("verif model", "Opel", masina.getModel());
        assertEquals("verif pret", 100000, masina.getPret(), 0.001);
        assertEquals("verif an", 2010, masina.getAnFabricatie());
    }

    // Existance testing
    @Category(TestExistance.class)
    @Test(expected = ExceptieModelNull.class)
    public void testExistance() throws Exception {
        Masina masina = new Masina(null, 5000, 2010);
    }
}