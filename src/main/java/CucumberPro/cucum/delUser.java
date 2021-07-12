package CucumberPro.cucum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class delUser {

	@When("^On user list and select user$")
	public void on_user_list_and_select_user() throws Throwable {
		System.out.println(" On DELETE USER");
		Thread.sleep(3000);
		main.getDriver().findElement(By.xpath("//div[contains(text(),'Users')]")).click();
		System.out.println("  USER");
		List<WebElement> checkbox = main.getDriver().findElements(By.xpath("//input[@id='user_5']"));
		System.out.println(checkbox.size());
		for (WebElement e : checkbox) {
			System.out.println(e.isSelected());
			System.out.println(e.getAttribute("value"));

			if (e.getAttribute("value").equals("5")) {
				e.click();

			}

		}
	}

	@When("^Click on delete user$")
	public void click_on_delete_user() throws Throwable {
		Actions actions = new Actions(main.getDriver());
		System.out.println("MOUSE HOVER");
		WebElement target = main.getDriver().findElement(By.xpath("//tbody/tr[@id='user-5']/td[1]"));
		actions.moveToElement(target).perform();
		
		main.getDriver().findElement(By.xpath("//tbody/tr[@id='user-5']/td[1]/div[1]/span[2]/a[1]")).click();
		System.out.println("clicking on Delete");
		Thread.sleep(3000);
		main.getDriver().findElement(By.xpath("//input[@id='submit']")).click();
		
	}

	@Then("^User delete successfully$")
	public void user_delete_successfully() throws Throwable {
		System.out.println("User deleted Successfully " + main.getDriver().getTitle());
	}

}
