package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Program9 extends Program1 {

	@Test(priority=1)
	public void forgotpassword() throws InterruptedException {
		//click on signin link
	    driver.findElement(By.xpath("//a[contains(@href, 'customer/account/login')] ")).click();
	    System.out.println("sucessfully click on signin ");
	  //click forgot password link
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/div[2]/a")).click();
		Thread.sleep(2000);
		//enter mail
		driver.findElement(By.name("email")).sendKeys("namratajain51@gmail.com");
		//click on reset my password button
		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
     //verify forgot password page
		WebElement message = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div"));
	    assert message.getText().contains("If there is an account associated with namratajain51@gmail.com you will receive an email with a link to reset your password.");
	    System.out.println("Successfully Verified forgotpassword page");
}
}