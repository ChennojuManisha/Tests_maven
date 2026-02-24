package page_test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.By;

public class factory{
	private WebDriver driver;
	private final String url="https://www.saucedemo.com/";
	@FindBy(id="user-name")
	private WebElement usernameField;
	@FindBy(id="password")
	private WebElement passwordField;
	@FindBy(id="login-button")
	private WebElement loginButton;
	@FindBy(css="h3[data-test='error']")
	private WebElement errorMessages;
	

	

	

	//constructor
	public  factory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void navigateTo() {
		if(!driver.getCurrentUrl().equals(url)) {
			driver.get(url);
		}
	}
}
