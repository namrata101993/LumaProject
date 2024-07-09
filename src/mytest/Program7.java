package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Program7 extends Program1 {

	@Test (priority=1)
	public void checklogin_validation() {
		//click on signin link
	    driver.findElement(By.xpath("//a[contains(@href, 'customer/account/login')] ")).click();
	    WebElement emailTextBox=driver.findElement(By.id("email"));
		if(emailTextBox.isDisplayed()==true) {
			System.out.println("pass");
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			
		}
		else {
			System.out.println("fail");
		}
		
		WebElement passwordTextBox=driver.findElement(By.id("pass"));
		if(passwordTextBox.isEnabled()==true) {
			System.out.println("pass");
			driver.findElement(By.id("pass")).sendKeys("abc@gmail.com");
			
		}
		else {
			System.out.println("fail");
		}
}
}