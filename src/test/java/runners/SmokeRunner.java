package runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testy.Test1234;
import testy.TestConvert;
import testy.TestToyota;
import testy.Test123;

    @RunWith(Suite.class)
    @Suite.SuiteClasses(
            {       TestToyota.class,
                    Test123.class,
                    Test1234.class,
                    TestConvert.class

            }
    )

    public class SmokeRunner {

        @BeforeClass

        public static void beforeAll(){

            System.out.println("Before class запускается первым");
        }

        @AfterClass

        public static void afterClass(){

            System.out.println("After Class ");
        }


    }


