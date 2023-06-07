package person;

import com.rd.person.Man;
import dataproviders.TestDataProviderMan;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ManTests {
    @Test(dataProvider = "manData", dataProviderClass = TestDataProviderMan.class)
    public void testIsRetired(Man man) {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(man.isRetired(), true, "The status is incorrect");
//        softAssert.assertEquals(man.isRetired(), man.getAge() >= 65, "The status is incorrect");
        softAssert.assertAll();
    }
}
