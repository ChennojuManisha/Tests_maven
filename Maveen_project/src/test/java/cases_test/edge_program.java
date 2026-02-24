package cases_test;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class edge_program {
	static WebDriver driver;
	public static void main(String[] args) {
		googelsearch();
		//driver.quit();
		
	}
	public static void  googelsearch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		edge_program .textbox_search(driver).sendKeys("India");
		edge_program.textbox_search(driver).sendKeys(Keys.ENTER);
	}
	}

	

	


