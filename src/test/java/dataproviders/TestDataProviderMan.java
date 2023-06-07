package dataproviders;

import com.rd.person.Man;
import org.testng.annotations.DataProvider;

public class TestDataProviderMan {
    @DataProvider(name = "manData")
    public static Object[][] men() {

        return new Object[][]{
                {
                        new Man("Harry", "Potter", 75),
                },

                {
                        new Man("Will", "Smith", 55)
                }
        };

    }
}
