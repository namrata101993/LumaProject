package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import runtask.Run;

public class Homepage extends Run {
	WebDriver driver;
	 
    By searchBox = By.id("search");
    By searchButton = By.cssSelector("button[title='Search']");
    By signInLink = By.linkText("Sign In");
    By cartLink = By.cssSelector("a.action.showcart");
    By accountMenu = By.cssSelector(".account > .dropdown-toggle"); // Replace with actual locator
    By logoutButton = By.linkText("Logout"); // Replace with actual locator

    public Homepage(WebDriver driver) {
    	  this.driver = driver;
    	  
    }

    public void searchForProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public void clickSignIn() {
        driver.findElement(signInLink).click();
    }
    public void clickCart() {
    	 driver.findElement(cartLink).click();
    }

	public void clickAccountMenu() {
		driver.findElement(accountMenu).click();
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

}
