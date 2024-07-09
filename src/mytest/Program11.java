package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Program11 extends Program2 {
	 @Test (priority=3)
	public void addtowishlist() throws InterruptedException {
	//  Search for a product
        driver.findElement(By.id("search")).sendKeys("shirt");
        driver.findElement(By.cssSelector("button[title='Search']")).click();
        Thread.sleep(2000);
       
       
        	JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,200)", "");
            Thread.sleep(2000);
         // click first product 
            driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/strong/a")).click();
            Thread.sleep(2000);
            //click on wish list icon
            driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]")).click();
            //verify item is added to wishlist
            WebElement successmessage=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div"));
            assert successmessage.getText().contains("Radiant Tee has been added to your Wish List. Click here to continue shopping.");
            System.out.println("verify product is added to wish list");
    }

	}

