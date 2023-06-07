package person;

import com.rd.person.Woman;
import dataproviders.TestDataProviderWoman;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WomanTests {
    @Test(dataProvider = "womanData", dataProviderClass = TestDataProviderWoman.class)
    public void testIsRetired(Woman woman) {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(woman.isRetired(), true, "The status is incorrect");
//        softAssert.assertEquals(woman.isRetired(), woman.getAge() >= 60, "The status is incorrect");
        softAssert.assertAll();

    }


}
