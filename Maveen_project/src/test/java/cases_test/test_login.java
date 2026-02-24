package cases_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page_test.loginpage;

public class test_login {
public static void main(String[] args) {
	WebDriver driver;
	loginpage loginPage;
	driver=new ChromeDriver();
	loginPage=new loginpage(driver);
	loginPage.navigateTo();
	loginPage.login("standard_user","secret_sauce");
	//loginPage.navigatorTO();
	//loginPage.login("invalidusername","wrongpassword");
	
}

}
