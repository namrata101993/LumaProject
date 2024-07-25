package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createaccount {
	WebDriver driver;
	public  Createaccount(WebDriver driver) {
		this.driver=driver;
	}
	
	//repositering(storing locators)
		By firstname=By.id("firstname");
		By lastname=By.id("lastname");		
		By email=By.name("email");
	    By password=By.name("password");
	    By passwordconfirm=By.name("password_confirmation");
	    By createaccount=By.partialLinkText("Create an Account");
		By signupbutton=By.xpath("//button[@title='Create an Account']");
				

	    public void url() throws InterruptedException {
	 	   driver.get("https://magento.softwaretestingboard.com/");
	 	   Thread.sleep(2000);
	    }
	       
	    public void createaccount() {
	 	   driver.findElement(createaccount).click();
	    }
	    
	    public void firstname() {
	 	   driver.findElement(firstname).sendKeys("namrata");
	    }
	    public void lastname() {
	  	   driver.findElement(lastname).sendKeys("jain");
	     }
	    public void email() {
	   	   driver.findElement(email).sendKeys("namrata888@gmail.com");
	      }
	    public void password() {
	    	   driver.findElement(password).sendKeys("namrata@06");
	       }
	    public void passwordconfirm() {
	 	   driver.findElement(passwordconfirm).sendKeys("namrata@06");
	    }
	    public void signupbutton() {
	  	   driver.findElement(signupbutton).click();
	     }
}
