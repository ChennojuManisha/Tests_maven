package cases_test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import page_test.loginpage;

public class factory_mood {
 
public static void main(String[] args) {
	WebDriver driver;
	loginpage PageFactory;
	driver=new ChromeDriver();
	PageFactory=new loginpage(driver);
	PageFactory.navigateTo();
	PageFactory.login("standard_user","secret_sauce");
	//loginPage.navigateTo();
	//loginPage.login("invalidusername","wrongpassword");
	
}

}


