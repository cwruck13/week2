package tests;
//Cassandra Wruck

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestStudentLogic.class, TestStudentLogic2.class })
public class AllTests {

}
