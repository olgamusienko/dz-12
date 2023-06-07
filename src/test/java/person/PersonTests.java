package person;

import com.rd.person.Man;

import com.rd.person.Woman;
import dataproviders.TestDataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PersonTests {

    @Test(dataProvider = "personsData", dataProviderClass = TestDataProvider.class)
    public void testIsRetired(Man man, Woman woman){
        String maidenName = woman.getLastName();

        SoftAssert softAssert = new SoftAssert();
        woman.registerPartnership(man);
        softAssert.assertEquals(woman.getPartner(), man, "The partner is incorrect");
        softAssert.assertEquals(man.getPartner(), woman, "The partner is incorrect");
        softAssert.assertEquals(woman.getLastName(), man.getLastName(), "The last name is incorrect");
        man.deregisterPartnership(true);
        softAssert.assertEquals(woman.getPartner(), null, "The partner exists but should not");
        softAssert.assertEquals(man.getPartner(), null, "The partner exists but should not");
        softAssert.assertEquals(woman.getLastName(), maidenName, "The maiden name is incorrect" );
        softAssert.assertAll();


    }

}
