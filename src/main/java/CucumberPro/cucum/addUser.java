package CucumberPro.cucum;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addUser {

	@Then("^Here click on User$")
	public void here_click_on_User() throws Throwable {
		System.out.println("ADD USER");
	 main.getDriver().findElement(By.xpath("//div[contains(text(),'Users')]")).click();
	}

	@Then("^navigated on Add user page$")
	public void navigated_on_Add_user_page() throws Throwable {
		main.getDriver().findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[3]/a[1]")).click();
	}

	@When("^Enter username \"([^\"]*)\" , email \"([^\"]*)\" , Firstname \"([^\"]*)\" , Lastname \"([^\"]*)\"$")
	public void enter_username_email_Firstname_Lastname(String username, String email, String Firstname, String Lastname) throws Throwable {
	//	List <List <String>> data=credentials.raw();
		main.getDriver().findElement(By.id("user_login")).sendKeys(username);
		main.getDriver().findElement(By.id("email")).sendKeys(email);
		main.getDriver().findElement(By.id("first_name")).sendKeys(Firstname);
		main.getDriver().findElement(By.id("last_name")).sendKeys(Lastname);
	}

	@When("^Click on Add button$")
	public void click_on_Add_button() throws Throwable {
	    main.getDriver().findElement(By.id("createusersub")).click();
	    Thread.sleep(2000);
	    main.getDriver().findElement(By.id("createusersub")).click();
	}

	@Then("^User must successfully add user to list$")
	public void user_must_successfully_add_user_to_list() throws Throwable {
	    System.out.println("We are into user list " + main.getDriver().getTitle());
	    Thread.sleep(2000);
	}

}
