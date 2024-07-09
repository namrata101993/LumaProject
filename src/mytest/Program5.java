package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Program5 extends Program4 {

	@Test(priority = 8)
	public void proceedtopayment() throws InterruptedException {

		// Enter shipping information
		driver.findElement(By.name("company")).sendKeys("Excelr");
		driver.findElement(By.name("street[0]")).sendKeys("123 Test St");
		driver.findElement(By.name("city")).sendKeys("pune");
		driver.findElement(By.name("postcode")).sendKeys("4122007");
		driver.findElement(By.name("telephone")).sendKeys("99999");
		
		// Select country (assuming it's pre-selected to "United States")
		WebElement countryDropdown = driver.findElement(By.name("country_id"));
		countryDropdown.click();
		countryDropdown.findElement(By.cssSelector("option[value='IN']")).click();

		// Select state
		WebElement stateDropdown = driver.findElement(By.name("region_id"));
		stateDropdown.click();
		stateDropdown.findElement(By.cssSelector("option[value='553']")).click();
		Thread.sleep(2000);
        //  Scrolldown
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		// Click "Next" to proceed to payment
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div")).click();
		Thread.sleep(5000);
		// Verify payment information page
		WebElement payment = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[1]"));
		assert payment.getText().contains("Payment Method");
		System.out.println("Verify proceed to payment");
	}

	@Test(priority = 9)
	public void placeorder() throws InterruptedException {
		// Click "Place Order"
		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div"))
				.click();
		Thread.sleep(3000);
		// Verify place order
		String actualTitle = driver.getTitle();
		String expectedTitle = "Success Page";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("successfully Verify place order page");
	}

}

