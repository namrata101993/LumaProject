package mytest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Program10 extends Program1{

	@Test(priority=1)
	public void searchbox() {
		 WebElement searchbox=driver.findElement(By.name("q"));
	      searchbox.sendKeys("jacket");
	      searchbox.submit();
	      // verify search functionality
	      String actualTitle=driver.getTitle();
	      String expectedTitle="Search results for: 'jacket'";
	      
	      Assert.assertEquals(actualTitle, expectedTitle);
	      System.out.println("sucessfully Verify searchbox");
	}
	@Test(priority=2)
	public void verifysortdropdown() {
		
		WebElement sort=driver.findElement(By.id("sorter"));
		
		Select select=new Select(sort);
		List<WebElement> list=select.getOptions();
		
		//originallist
		//templist-sort
		List originallist=new ArrayList();
		
		for(WebElement Value:list) {
			originallist.add(Value.getText());
		}
		 System.out.println("original value from site"+originallist);
		 System.out.println("sucessfully verify sortdropdown");
	}
	@Test(priority=3)
	public void verifyreviewform() throws InterruptedException {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,350)", "");
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/adrienne-trek-jacket.html']")).click();
	      Thread.sleep(2000);
	      //  Click on "Add Your Review"
	        WebElement addReviewButton = driver.findElement(By.cssSelector("a[href*='#review-form']"));
	        addReviewButton.click();

	        //  Verify the review form is opened
	        WebElement reviewForm = driver.findElement(By.id("review-form"));
	        assert reviewForm.isDisplayed();
	        System.out.println("Review form is display");
	}
}
