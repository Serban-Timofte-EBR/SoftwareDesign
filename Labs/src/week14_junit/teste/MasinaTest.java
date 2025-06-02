package week14_junit.teste;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import week14_junit.categorii.TestException;
import week14_junit.categorii.TestRight;
import week14_junit.clase.Masina;
import week14_junit.exceptii.ExceptiePret;

import static org.junit.Assert.*;

public class MasinaTest {
    private Masina masina;

    // A doua apelata pentru ca este prima parte din clasa
    public MasinaTest() {
        System.out.println("Constructor MasinaTest");
    }

    // Se apeleaza prima data inainte de orice altceva din clasa si dupa se ia clasa step by step
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("SetUpBeforeClass");
    }

    // Ultimul apel din clasa
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("SetUpAfterClass");
    }

    // SetUp function si se apeleaza inainte de orice test
    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("SetUp");
        masina = new Masina();  // Pentru fiecare tet o sa am noua masina (instanta)
    }

    // TearDown se apeleaza dupa fiecare test
    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("TearDown");
    }

    // Pentru a rula testele trebuie sa fie adaugata macar o metoda de test
    @Test
    public void testRight() throws ExceptiePret { // testarea RIGHT valideaza valoarea setata
        // Nu este corect sa initializez in test pentru ca as incerca sa initializez in test
        // Masina masina = new Masina();
        masina.setPret(5000);
        assertEquals("Nu a setat pretul pentru valoare normala", 5000, masina.getPret(), 0.001);    // delta spune care este diferenta acceptabila
    }

    // Test care este trecut daca set arunca exceptie
    @Category(TestRight.class)
    @Test(expected = ExceptiePret.class)
    public void test2() throws ExceptiePret {
        masina.setPret(500);
    }

    @Category(TestException.class)
    @Test
    public void testSetPretInErrorCondition() {
        double pretInitial = masina.getPret();
        try {
            masina.setPret(900);
            fail("Nu s-a aruncat exceptie atunci cand pretul era invalid!");
        } catch (ExceptiePret e) {
            System.out.println("Pretul setat arunca exceptie ExceptieAn");
            assertEquals("S-a modificat pretul in set cand arunca exceptie ", pretInitial, masina.getPret(), 0.001);
        }
    }
}