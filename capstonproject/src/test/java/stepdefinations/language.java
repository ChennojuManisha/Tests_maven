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



public class language {

 WebDriver driver;
@Given("to change the language in the home page")
public void to_change_the_language_in_the_home_page() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in/");
    // Write code here that turns the phrase above into concrete actions
}

@Given("select the language telugu")
public void select_the_language_telugu() throws InterruptedException {
	WebElement languagedropdown=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/div[1]/a/span/span[2]/div"));
          languagedropdown.click();
          WebElement  teluguoption=driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[5]/div/label/span/span"));
	        teluguoption.click();
	        Thread.sleep(3000);
	        WebElement acceptoption=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/span[2]/span/input"));
	        acceptoption.click();
	        Thread.sleep(3000);
          // Write code here that turns the phrase above into concrete actions
}

@When("search for the laptop")
public void search_for_the_laptop() throws InterruptedException {
	WebElement searchBox=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
	searchBox.sendKeys("laptop" +Keys.ENTER);
	  Thread.sleep(3000);
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("select one product and make it on cart")
public void select_one_product_and_make_it_on_cart() throws InterruptedException {
	List<WebElement> products=driver.findElements(By.xpath("//*[@id=\"a-autoid-4-announce\"]")); 
	products.get(0).click();
	Thread.sleep(4000);
	driver.navigate().back();
	WebElement languagedropdown=driver.findElement(By.cssSelector("#icp-nav-flyout > a > span > span.nav-line-2 > div"));
	languagedropdown.click();
	Thread.sleep(3000);
	WebElement englishoption=driver.findElement(By.cssSelector("#icp-language-settings > div:nth-child(4) > div > label > span > span"));
    englishoption.click();
    Thread.sleep(3000);
    WebElement acceptoption=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/span[2]/span/input"));
    acceptoption.click();
    Thread.sleep(3000);
    WebElement addtocart=driver.findElement(By.cssSelector(" #nav-cart-text-container > span.nav-line-2"));
    addtocart.click();
  // driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[2]/div[1]/div/form/ul/div[3]/div[4]/div/div[2]/div[1]/span[4]/span/a"))
  // .click();
   // Thread.sleep(3000);
   // WebElement pintrestlink=driver.findElement(By.xpath("//*[@id=\"ssf-channel-pinterest\"]/i"));
   // pintrestlink.click();
    
    
    
   
    
   
	// Write code here that turns the phrase above into concrete actions
   
}


}
	
	
	
	