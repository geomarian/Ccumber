package CucumberPro.cucum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginCred {


	@Given("^Enter URL \"([^\"]*)\"$")
	public void enter_URL(String url) throws Throwable {
		main.getDriver().get(url);

		System.out.println("Website is open");
	}

	@When("^Enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_username_and_password(String username, String password) throws Throwable {
		
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathExpression)));
//		
		main.getDriver().findElement(By.id("user_login")).sendKeys(username);
		main.getDriver().findElement(By.id("user_pass")).sendKeys(password);
	    
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		 WebElement loginButton = main.getDriver().findElement(By.id("wp-submit"));
		 loginButton.click();
	}

	@Then("^User must successfully login to the application$")
	public void user_must_successfully_login_to_the_application() throws Throwable {
	   System.out.println("User successfullty logged in at " + main.getDriver().getTitle());
	}
	
	
	//ADD USER
	

}
