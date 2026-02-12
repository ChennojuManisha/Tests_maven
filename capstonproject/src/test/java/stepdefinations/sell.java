package stepdefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import logger.log4j;


public class sell {
	private static final Logger logger=LogManager.getLogger(log4j.class);
	
	//ExtentReports extent=  ExtentManager.getInstance();
	//ExtentTest test;
	//@Before public void setup()
	{
	   // test=extent.createTest("Amazon shop test");
	}

 WebDriver driver;

@Given("user clicks the sell logo")
public void user_clicks_the_sell_logo() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in/");
	logger.info("user is on the Amazon homepage");
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("the user clicks the below start selling")
public void the_user_clicks_the_below_start_selling() {
	WebElement selectsell=driver.findElement(By.cssSelector("#nav-xshop > ul > li:nth-child(3) > div > a"));
    selectsell.click();
    logger.info("click the sell on the site and click below link start selling");
    // Write code here that turns the phrase above into concrete actions
   
}

@When("it navigates to the sigin page")
public void it_navigates_to_the_sigin_page() throws InterruptedException {
	driver.findElement(By.cssSelector("#Cross_ATF > div > a")).click();
	Thread.sleep(3000);
	logger.info("now user is on the sign in page");
	
	
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("the user enters the invalid phonenumber or email")
public void the_user_enters_the_invalid_phonenumber_or_email() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("123456789" +Keys.ENTER);
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("chennojumanisha@gmil" +Keys.ENTER);
	Thread.sleep(2000);
	logger.info("enters invalid phone number and email address");
    // Write code here that turns the phrase above into concrete actions
    




}
}
