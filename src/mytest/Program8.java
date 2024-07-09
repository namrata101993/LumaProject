package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Program8 {
	static WebDriver driver;
	@Test
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@DataProvider (name="shirt")
	public Object [][] dataSet()
	{
		Object [][] data=new Object[3][2];
		data [0][0]="tops";
		data [0][1]="bottoms";
		data [1][0]="Tees";
		data [1][1]="Jackets";
	
		return data;
	}
	@Test (dataProvider="shirt")
	public void searchshirt(String men,String women) {
		driver.get("https://magento.softwaretestingboard.com");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("tops");
		search.sendKeys(Keys.ENTER);
	}
	
}
