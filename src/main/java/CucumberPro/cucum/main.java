package CucumberPro.cucum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class main {

	private static  WebDriver driver;
	
	public static WebDriver getDriver() {
        return driver;
       
	}
	@Before  //This will excuted in every scenario 
	
	public void open_browser() throws Throwable {
	
		
	
		//System.out.println(prop.getProperty("driverPath"));
		System.setProperty("webdriver.chrome.driver", "E:\\GEO\\Selenium Sample\\cucum\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		System.out.println("Starting Chrome");
	}
	
	
	@After //This will execute after each scenario
	public void tearDown(){
		driver.quit();
	    System.out.println("Browser Shutdown");
		System.out.println("Closed browser");
	}
	
	
	
	
}
