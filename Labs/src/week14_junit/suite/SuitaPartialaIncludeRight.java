package week14_junit.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import week14_junit.categorii.TestException;
import week14_junit.categorii.TestRBICEP;
import week14_junit.categorii.TestRight;
import week14_junit.teste.ConstructorMasinaTest;
import week14_junit.teste.MasinaTest;

@RunWith(Categories.class)  // IMPORTANT: Aici merge doar cu Categories. Daca folosim SUITE ruleaza clasele de test
@Categories.IncludeCategory({TestRBICEP.class}) // Se uita si la clasele care deriveaza clasa de aici
@Suite.SuiteClasses({ConstructorMasinaTest.class, MasinaTest.class})
public class SuitaPartialaIncludeRight {

}