package Data;

import org.testng.annotations.DataProvider;

public class TestData {

	   @DataProvider(name = "loginData")
	    public Object[][] loginData() {

	        return new Object[][] {

	            {"Admin", "admin123"},
	            {"invalidUser", "admin123"},
	            {"Admin", "wrongPassword"}
	        };
	    }
	
}
