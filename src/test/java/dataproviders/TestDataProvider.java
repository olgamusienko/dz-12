package dataproviders;

import com.rd.person.Man;
import com.rd.person.Woman;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "personsData")
    public static Object[][] persons() {

        return new Object[][]{
                {
                    new Man("Daniel", "Smith", 65), new Woman("Stacy", "Parker", 62)
                },
                {
                    new Man("John", "Brown", 57), new Woman("Ciara", "Melony", 45)
                }
        };

    }

}
