package StepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import LoginPageObjects.SaleLoginPage;
import Resources.ConstantsSales;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


public class LoginStepDefination {
	
	public WebDriver driver;
	SaleLoginPage obj;
	
	/*@Given("^Initilize The Driver$")
    public void initilize_the_driver() throws Throwable {
      
		
    }   */

    @When("^User Enters URL$")
    public void user_enters_url() throws Throwable {
        
    	driver.get("https://login.salesforce.com/?locale=in");
    }

    @And("^User Enrers Username And Password And Click On Login Button$")
    public void user_enrers_username_and_password_and_click_on_login_button() throws Throwable {
    	
    	obj=new SaleLoginPage(driver);
    	
    	obj.clickusername().sendKeys(ConstantsSales.username);
    	obj.clickpassword().sendKeys(ConstantsSales.password);
    	obj.clicklogin().click();
    }
    
    @Then("^User Should Be Able to Login$")
    public void user_should_be_able_to_login() throws Throwable {
    	
    	System.out.println("user should able to login");
        
    }

    @Given("^enter the url$")
    public void enter_the_url() throws Throwable {
    	
    	driver.get("https://www.google.com/");
    	
    }

    @Before
    public void setup()  {
    	
    	driver=new ChromeDriver();
    }

    @After
    public void close()  {
    	
    	driver.quit();
    }

      }
