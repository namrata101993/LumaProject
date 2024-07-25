package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Changepassword {
	WebDriver driver;
	 
	 By Clickprofiledropdown=By.xpath("//div[@class='panel header']//button[@type='button']");
	 By Clickonmyaccount=By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a");
	 By Clickonchangepassword=By.xpath("//a[normalize-space()='Change Password']");
	 By ClickonCurrentPassword=By.xpath("//input[@id='current-password']");
	 By ClickonNewPassword=By.xpath("//input[@id='password']");
	 By ClickonNewConfirmPassword=By.xpath("//input[@id='password-confirmation']");
	 By ClickonSave=By.xpath("//button[@title='Save']");
	 
	 
	  public Changepassword(WebDriver driver) {
	        this.driver = driver;
	       
     }    
	   
	    public void Clickprofiledropdown() {
	    	driver.findElement(Clickprofiledropdown).click();
	    }
	    
	    public void Clickonmyaccount() {
	    	driver.findElement(Clickonmyaccount).click();
	    }
	    
	    public void Clickonchangepassword() {
	    	driver.findElement(Clickonchangepassword).click();
	    }
	    
	    public void ClickonCurrentPassword() {
	    	driver.findElement(ClickonCurrentPassword).sendKeys("namrata@06");
	    }
	    public void ClickonNewPassword() {
	    	driver.findElement(ClickonNewPassword).sendKeys("namrata@06");
	    }
	    
	    public void ClickonNewConfirmPassword() {
	    	driver.findElement(ClickonNewConfirmPassword).sendKeys("namrata@06");
	    }
	    public void ClickonSave() {
	    	driver.findElement(ClickonSave).click();
	    }
	    
}

