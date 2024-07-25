package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	 WebDriver driver;
		
	 
	    By emailField = By.id("email");
	    By passwordField = By.id("pass");
	    By signInButton = By.id("send2");
	    By searchitem = By.cssSelector("button[title='Search']");
	    By clickproduct= By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/strong/a");
	    By Selectimage=By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
	    By Selectsize=By.id("option-label-size-143-item-169");
	    By Selectcolor= By.id("option-label-color-93-item-57");
	    By Cartquantity=By.id("qty"); WebElement EnterQuantity;
     By Addtocart=By.id("product-addtocart-button");	   
     By Mycarticon=By.xpath("/html/body/div[2]/header/div[2]/div[1]/a"); WebElement carticon;
	    By Checkoutbutton=By.id("top-cart-btn-checkout");
	    By Next=By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button");WebElement NextButton;
	    By Placeorder=By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span");
	    
     public Loginpage(WebDriver driver) {
	        this.driver = driver;
	       
     }    

	    public void login(String email, String password) {
	    	driver.findElement(emailField).sendKeys(email);
	    	driver.findElement(passwordField).sendKeys(password);
	    	driver.findElement(signInButton).click();
	    }
	    
	    public void searchButton() {
	    	driver.findElement(searchitem).sendKeys("shirt");
	    }
	    
	   
	    public void clickproduct() {
	    	driver.findElement(clickproduct).click();
	    }
	    
	    public void Selectimage() {
	    	driver.findElement(Selectimage);
	    }
	    public void Selectsize() {
	    	driver.findElement(Selectsize).click();
	    }
	    public void Selectcolor() {
	    	driver.findElement(Selectcolor).click();
	    }
	    public void Cartquantity(String quantity) {
	    	driver.findElement(Cartquantity).clear();
	    	driver.findElement(Cartquantity).sendKeys(quantity);
	    	   
	    }
	    public void Addtocart() {
	    	driver.findElement(Addtocart).click();
	    }
	    public void Mycarticon() {
	    	driver.findElement(Mycarticon).click();
	    }
	    public void Checkoutbutton() throws InterruptedException {
	    	driver.findElement(Checkoutbutton).click();
	    	Thread.sleep(2000);
	    }
	    public void scroll() 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,700)", "");
			
		}
	    public void Next() throws InterruptedException {
	    	driver.findElement(Next).click();
	    	Thread.sleep(5000);
	    	
	    }
	    public void Placeorder() {
	    	driver.findElement(Placeorder).click();
	    	
	    }
}
