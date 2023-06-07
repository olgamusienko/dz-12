package dataproviders;

import com.rd.person.Woman;
import org.testng.annotations.DataProvider;

public class TestDataProviderWoman {
    @DataProvider(name = "womanData")
    public static Object[][] women() {

        return new Object[][]{
                {
                    new Woman("Mary", "Johnson", 61),
                },

                {
                    new Woman("Ciara", "Stone", 45)
                }
        };

    }
}
