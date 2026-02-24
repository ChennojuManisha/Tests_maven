package windows;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;




public class window {
	static WebDriver driver;
	public static void main(String[] args)  throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String initialHandle=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/imghp?hl=en&tab=ri&ogbl");
		System.out.println(driver.getWindowHandles().size());
		driver.switchTo().window(initialHandle);
		Thread.sleep(3000);
		driver.close();
		System.out.println(driver.getWindowHandles().size());
		driver.quit();
				
		
		
	}

		


	

}


