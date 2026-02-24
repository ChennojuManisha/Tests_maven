package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class times {
	WebDriver driver;
	@Given("go to homepage")
	public void go_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("go to topheader and select a language")
	public void go_to_topheader_and_select_a_language() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://timesofindia.indiatimes.com/");
		Thread.sleep(300);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	
	}

	@When("select hindi language")
	public void select_hindi_language() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div/div[2]/div/div/div[1]/div[2]/div/div"))
	     .click();
	 
	    Thread.sleep(300);
	}

	@Then("click button")
	public void click_button() {
	    // Write code here that turns the phrase above into concrete actions
		String currentUrl=driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("hindi"));
		driver.quit();
	    
	}



}
