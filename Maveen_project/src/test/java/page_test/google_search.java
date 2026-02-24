package page_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class google_search {
	private static WebElement element=null;
	public static WebElement textbox_search(WebDriver driver)
	{
		element=driver.findElement(By.name("q"));
		return element;
	}

}
