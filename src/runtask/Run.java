package runtask;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Run {
	 WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver-win64//chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://magento.softwaretestingboard.com");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    }

	  //  @AfterMethod
	    public void teardown() {
	        driver.quit();
}
}
