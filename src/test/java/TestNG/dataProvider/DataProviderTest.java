package TestNG.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "getData")
    public void logingTest(String name, String password){
        System.out.println("Name is : " + name + " Password is : " + password);
    }

    @DataProvider
    public Object[][] getData(){
         Object[][] data = {{"acb@gmail.com","abc123"} , {"waradiusername@gmail.com","abc123"},{"waradiusername@gmail.com","waradiPW123"}
         };
         return data;
    }
}
