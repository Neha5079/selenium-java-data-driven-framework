package Tests;

import org.testng.annotations.Test;

import Base.BaseClass;
import Data.TestData;
import Pages.LoginPage;

public class LoginTest extends BaseClass {

    @Test(dataProvider = "loginData",
          dataProviderClass = TestData.class)

    public void loginTest(String username,
                          String password) {

        LoginPage login = new LoginPage(driver);

        login.login(username, password);
    }

}
