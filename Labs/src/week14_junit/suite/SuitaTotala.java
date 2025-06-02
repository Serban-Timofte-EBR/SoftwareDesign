package week14_junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import week14_junit.teste.ConstructorMasinaTest;
import week14_junit.teste.MasinaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ConstructorMasinaTest.class, MasinaTest.class})    // Suita mea cu clasele care contin teste
public class SuitaTotala {

}