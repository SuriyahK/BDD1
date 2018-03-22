package Stepdefination;

import java.sql.Driver;

//public class GUIStepdefination {
	
	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import cucumber.api.java.Before;
	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class GUIStepdefination {
		WebDriver driver;
		
		@Before
		public void initialize() {
			System.out.println("this is before class");

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\anika\\eclipse-workspace\\BDD1\\chromedriver.exe");

			// Webdriver is interface
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		@Given("^I am on Facebook login page$")
		public void fblogin() {
			System.out.println("frist step in cucumber");
		}
		
		
		@Then("^Login should fail$")
		public void logout() {
			System.out.println("logging out second step");
		}
		
		@And("^this test case failed$")
		public void closing() {
			System.out.println("this test case failed");
		}
		
		@Given("^I enter Username as \"([^\"]*)\"$")
		public void entertextto(String b) {
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(b);
		}
		
		@When("^I enter Password as \"([^\"]*)\"$")
		public void enterpass(String b) {
			driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(b);
		}
		
		@Then("^clickon \"([^\"]*)\"$")
		public void clicking(String a) {
			driver.findElement(By.xpath(a)).click();
		}

	}



