package LoginPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SaleLoginPage {
	
	WebDriver driver;

	public By username = By.xpath("//input[@id='username']");
	public By password = By.xpath("//input[@id='password']");
	public By login = By.xpath("//input[@id='Login']");

	public SaleLoginPage(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement clickusername() {

		return driver.findElement(username);
	}

	public WebElement clickpassword() {

		return driver.findElement(password);
	}

	public WebElement clicklogin() {

		return driver.findElement(login);
	}

	


}
