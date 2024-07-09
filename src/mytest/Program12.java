package mytest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Program12 extends Program1{
    @Test(priority=3)
	public void removeitemfromcart() throws InterruptedException {
    	//click on signin link
        driver.findElement(By.xpath("//a[contains(@href, 'customer/account/login')] ")).click();
        System.out.println("sucessfully click on signin ");
        //Find email id and enter valid mail
        driver.findElement(By.id("email")).sendKeys("vidhyasagar@gmail.com");
        //Find password and enter valid password
        driver.findElement(By.id("pass")).sendKeys("vidhyasagar@1008");
        //sigin button click
        driver.findElement(By.xpath("//button[@class='action login primary']")).click();
        Thread.sleep(2000);
		// click on my cart icon
				WebElement carticon = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));
				carticon.click();
				Thread.sleep(2000);
				//click on delete icon
				driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[2]/a")).click();
				Thread.sleep(2000);
				// click ok button
				driver.findElement(By.xpath("/html/body/div[4]/aside[2]/div[2]/footer/button[2]")).click();
				
				//verify item is removed

				WebElement emptyCartMessage = driver.findElement(By.xpath("//*[@class=\"subtitle empty\"]"));
				assert emptyCartMessage.getText().contains("You have no items in your shopping cart.");
	            System.out.println("item is removed successfully");
           }
}