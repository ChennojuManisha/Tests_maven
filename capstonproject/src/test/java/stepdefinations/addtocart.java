package stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addtocart {
	WebDriver driver;


@Given("the user is on the amazon home page")
public void the_user_is_on_the_amazon_home_page() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
    // Write code here that turns the phrase above into concrete actions
    
}

@Given("the user search for the laptop")
public void the_user_search_for_the_laptop() throws InterruptedException {
	WebElement searchBox=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
	searchBox.sendKeys("laptop" +Keys.ENTER);
	  Thread.sleep(3000);
    // Write code here that turns the phrase above into concrete actions
    
}

@When("the user adds the first two laptops to the cart one by one")
public void the_user_adds_the_first_two_laptops_to_the_cart_one_by_one() throws InterruptedException {
List<WebElement> products=driver.findElements(By.xpath("//*[@id=\"a-autoid-4-announce\"]")); 
products.get(0).click();
Thread.sleep(4000);
List<WebElement>products1 =driver.findElements(By.xpath("/html/body"));
products.get(1).click();


    // Write code here that turns the phrase above into concrete actions
    
}

@Then("the cart badge should display two")
public void the_cart_badge_should_display_two() {
	
    // Write code here that turns the phrase above into concrete actions
    
}



}
