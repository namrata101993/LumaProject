package mytest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Program1 {

	WebDriver driver;
	
    @BeforeClass
	public void setUp()
	{
		 System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver-win64//chromedriver.exe");
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://magento.softwaretestingboard.com");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
    
    @Test(priority=-1)
    
    public void verifyTitle()
    {
    String actualTitle=driver.getTitle();
    String expectedTitle="Home Page";
    
    Assert.assertEquals(actualTitle, expectedTitle);
    System.out.println("Title Verify sucessfully");
    }
    
    
	@AfterClass
	public void tearDown()
	{
	driver.quit();
	}
}
