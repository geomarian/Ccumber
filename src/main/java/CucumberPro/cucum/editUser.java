package CucumberPro.cucum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class editUser {
	
	@When("^On user list and select user to edit$")
	public void on_user_list_and_select_user_to_edit() throws Throwable {
		
		System.out.println(" On EDIT USER");
		Thread.sleep(3000);
		main.getDriver().findElement(By.xpath("//div[contains(text(),'Users')]")).click();
		System.out.println(" E USER");
		List<WebElement> checkbox = main.getDriver().findElements(By.xpath("//input[@id='user_6']"));
		System.out.println(checkbox.size());
		for (WebElement e : checkbox) {
			System.out.println(e.isSelected());
			System.out.println(e.getAttribute("value"));

			if (e.getAttribute("value").equals("6")) {
				e.click();

			}

		}
	}
		
		
		


	@When("^Click on edit user$")
	public void click_on_edit_user() throws Throwable {
		Actions actions = new Actions(main.getDriver());
		System.out.println("MOUSE HOVER");
		WebElement target = main.getDriver().findElement(By.xpath("//tbody/tr[@id='user-6']/td[1]"));
		actions.moveToElement(target).perform();
		
		//build()- used to compile all the actions into a single step 
		//actions.click().build().perform();
		
		
		main.getDriver().findElement(By.xpath("//tbody/tr[@id='user-6']/td[1]/div[1]/span[1]/a[1]")).click();
		System.out.println("clicked on Edit");
		Thread.sleep(3000);
		main.getDriver().findElement(By.xpath("//button[@id='generate-reset-link']")).click();
		Thread.sleep(2000);
	}

	@Then("^User edited and updated successfully$")
	public void user_edited_and_updated_successfully() throws Throwable {
		main.getDriver().findElement(By.xpath("//input[@id='submit']")).click();
		System.out.println("User Edited & Updated Successfully " + main.getDriver().getTitle());
	}



}
