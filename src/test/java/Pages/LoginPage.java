package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	 WebDriver driver;

	    By userName = By.name("username");
	    By password = By.name("password");
	    By loginBtn = By.xpath("//button[@type='submit']");

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void login(String user, String pass) {
	        driver.findElement(userName).sendKeys(user);
	        driver.findElement(password).sendKeys(pass);
	        driver.findElement(loginBtn).click();
	    }
	
}
