package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Program4 extends Program3 {
@Test (priority=6)
public void addtocart() throws InterruptedException {
	//  select image
    driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));
    Thread.sleep(2000);
   
    //  Select Size 
    driver.findElement(By.id("option-label-size-143-item-169")).click();
    
    //  Select Color
    driver.findElement(By.id("option-label-color-93-item-57")).click();
    
    //  enter cart quantity
    WebElement quantity = driver.findElement(By.id("qty"));
    quantity.clear();
    quantity.sendKeys("2");
    //click on add to cart button
    driver.findElement(By.id("product-addtocart-button")).click();
    //  Verify cart page
    WebElement cartmessage = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div"));
    assert cartmessage.getText().contains("You added Radiant Tee to your shopping cart.");
    System.out.println("Successfully Verified cart page");
  
}
@Test(priority = 7)
public void proceedtocheckout() throws InterruptedException {

	// click on my cart icon
	WebElement carticon = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"));
	carticon.click();
	Thread.sleep(2000);
	// click on proceed to checkout button
	driver.findElement(By.id("top-cart-btn-checkout")).click();
	// Verify checkout page
	String actualTitle = driver.getTitle();
	String expectedTitle = "Checkout";
	Assert.assertEquals(actualTitle, expectedTitle);
	System.out.println("checkoutpage Verify sucessfully");
	Thread.sleep(2000);
}
}