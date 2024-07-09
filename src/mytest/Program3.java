package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Program3 extends Program2{
    @Test(priority=3)
	public void searchproduct() {
		//  Search for a product
        driver.findElement(By.id("search")).sendKeys("shirt");
        driver.findElement(By.cssSelector("button[title='Search']")).click();

        // Verify search results
        WebElement searchResults = driver.findElement(By.cssSelector(".search.results"));
        assert searchResults.getText().contains("shirt");
        System.out.println("Sucessfully verified search result");
	}

    @Test (priority=4)
    public void scrolldown() throws InterruptedException {
       //  Scrolldown
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,350)", "");
       Thread.sleep(2000);
   }
    @Test (priority=5)
    public void selectproduct() {
        // click first product 
        driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/strong/a")).click();

        //  Verify product name
       WebElement cartCount = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span"));
       assert cartCount.getText().contains("Radiant Tee");
       System.out.println("verify product name");
}
   

}



