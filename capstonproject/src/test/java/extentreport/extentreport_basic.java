package extentreport;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


	public class extentreport_basic {
		private static final  Theme Theme = null;
		static ExtentReports extent;
		static ExtentSparkReporter spark;
		public static ExtentReports getInstance() {
			if(extent==null) {
				ExtentSparkReporter sparkReporter=new ExtentSparkReporter("target/spark.html");
				sparkReporter.config().setReportName("Amazon shop test report");
				sparkReporter.config().setDocumentTitle("Automation results");
				extent=new ExtentReports();
				extent.attachReporter(sparkReporter);
				
				
				
			}
			return  extent;
		}
			
		}
		