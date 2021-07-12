package CucumberPro.cucum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fileUpload {

	@Given("^I visit the file upload page$")
	public void i_visit_the_file_upload_page() throws Throwable {
		System.out.println(" On Profile");
		Thread.sleep(3000);
		main.getDriver().findElement(By.xpath("//div[contains(text(),'Users')]")).click();
		System.out.println("profile page for upload file");
		main.getDriver().findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='adminmenumain']/div[@id='adminmenuwrap']/ul[@id='adminmenu']/li[@id='menu-users']/ul[1]/li[4]/a[1]")).click();
		
	}

	@When("^I upload a file with valid data$")
	public void i_upload_a_file_with_valid_data() throws Throwable {
	   
	}

	@Then("^the file is one$")
	public void the_file_is_one() throws Throwable {
	   
	}

	@Then("^File should be in page$")
	public void file_should_be_in_page() throws Throwable {
	   
	}

	@When("^I upload a malformed file$")
	public void i_upload_a_malformed_file() throws Throwable {
	    
	}

	@Then("^the number of files is one$")
	public void the_number_of_files_is_one() throws Throwable {
	   
	}

	@Then("^I should see the file upload page again error$")
	public void i_should_see_the_file_upload_page_again_error() throws Throwable {
	   
	}


}
