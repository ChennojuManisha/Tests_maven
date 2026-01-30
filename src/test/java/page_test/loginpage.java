package page_test;
import org.openqa.selenium.WebDriver; 

import org.openqa.selenium.By;

public class loginpage {
	private WebDriver driver;
	private final String url="https://www.saucedemo.com/";
	private By usernameField=By.id("user-name");
	private By passwordField=By.id("password");
	private By loginButton=By.id("login-button");
	public loginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void navigateTo() {
		if(!driver.getCurrentUrl().equals(url)) {
			driver.get(url);
		}
	}
			public void  login(String username,String password ) {
				driver.findElement(usernameField).sendKeys(username);
			driver.findElement(passwordField).sendKeys(password);
			driver.findElement(loginButton).click();
				
				
				
			
		}
			
				
			}
			
				
			
	

	


