package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Program2 extends Program1 {
	 
@Test(priority=2)
public void loginwithvalidcredential() throws InterruptedException {
	//click on signin link
    driver.findElement(By.xpath("//a[contains(@href, 'customer/account/login')] ")).click();
    System.out.println("sucessfully click on signin ");
    //Find email id and enter valid mail
    driver.findElement(By.id("email")).sendKeys("vidhyasagar10@gmail.com");
    //Find password and enter valid password
    driver.findElement(By.id("pass")).sendKeys("vidhyasagar@1008");
    //sigin button click
    driver.findElement(By.xpath("//button[@class='action login primary']")).click();
    Thread.sleep(2000);
   //  Verify successful login by checking account name
    WebElement accountName = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span"));
    assert accountName.getText().contains("Welcome, Vidhya sagar!");
	System.out.println("verified login by checking account name");
    }
@Test(priority=1)
public void loginwithinvalidcredential() throws InterruptedException {
	//click on signin link
    driver.findElement(By.xpath("//a[contains(@href, 'customer/account/login')] ")).click();
    System.out.println("sucessfully click on signin ");
    //Find email id and enter valid mail
    driver.findElement(By.id("email")).sendKeys("namrata10@gmail.com");
    //Find password and enter invalid password
    driver.findElement(By.id("pass")).sendKeys("Namrat");
    //sigin button click
    driver.findElement(By.xpath("//button[@class='action login primary']")).click();
    Thread.sleep(2000);
   
    //  Verify invalid login by checking message
     String message_expected= "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
     String messagr_actual=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div")).getText();
     Assert.assertTrue(messagr_actual.contains(message_expected));
     Thread.sleep(2000);
     
    }
    
	
	    
}
