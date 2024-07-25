package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shipping_address {
	WebDriver driver;
	 
    By Manageaddress=By.linkText("Manage Addresses");
    By Newaddress=By.xpath("//*[@id=\"checkout-step-shipping\"]/div[2]/button"); 
	By Firstname=By.name("firstname"); WebElement FirstName;
	By Lastname=By.name("lastname"); WebElement LastName;
	By Companyname=By.name("company"); WebElement Company;
	By Street=By.name("street[]"); WebElement StreetAddress;
	By Cityname=By.name("city"); WebElement City;
	By Postcode=By.name("postcode");
	By Telephonenum=By.name("telephone"); WebElement Telephone;
	By Uncheck=By.id("shipping-save-in-address-book"); WebElement UncheckSaveAddress;
	By Shipherebutton=By.xpath("//footer[@class='modal-footer']/button[1]"); WebElement ShipHere;
	By Next=By.xpath("//div[@id='shipping-method-buttons-container']/div/button"); WebElement NextButton;
	By Checkbox=By.id("billing-address-same-as-shipping-checkmo"); WebElement CheckboxForPayment;
	By Placeorder=By.xpath("//form[@id='co-payment-form']/descendant::div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div/button"); WebElement SubmitPlaceOrder;
    By Country=By.name("country_id");
    By countryDropdown=By.cssSelector("option[value='IN']");
    By State=By.name("region_id");
    By stateDropdown=By.cssSelector("option[value='553']");
    By Saveaddress=By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");
    By Clickonprofiledropdown=By.xpath("//div[@class='panel header']//button[@type='button']");
    By Signout=By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/logout/']");
    
	public Shipping_address(WebDriver driver) {
        this.driver = driver;
    }
	public void Manageaddress() {
		driver.findElement(Manageaddress).click();
	}
	public void Newaddress() {
		driver.findElement(Newaddress).click();
	}
	
	public void Firstname() {
		driver.findElement(Firstname).sendKeys("Namrata");
	}
	public void Lastname() {
		driver.findElement(Lastname).sendKeys("Jain");
	}
	public void Companyname() {
		driver.findElement(Companyname).sendKeys("Nityoinfotech");
	}
	public void Street() {
		driver.findElement(Street).sendKeys("Wagholi");
	}
	public void Cityname() {
		driver.findElement(Cityname).sendKeys("Pune");
	}
	 public void scroll1() 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,700)", "");
			
		}
	 public void Country() {
			driver.findElement(Country).click();
		}
	 public void countryDropdown() {
			driver.findElement(countryDropdown).click();
		}
	 public void State() {
			driver.findElement(State).click();
		}
	 public void stateDropdown() {
			driver.findElement(stateDropdown).click();
		}
	 public void Postcode() {
			driver.findElement(Postcode).sendKeys("412207");
		}
	 public void Telephonenum() {
			driver.findElement(Telephonenum).sendKeys("987654321");
		}
	 public void Saveaddress() {
			driver.findElement(Saveaddress).click();
		}
	 public void Clickonprofiledropdown() {
	    	driver.findElement(Clickonprofiledropdown).click();
	    }
	 public void Signout() {
	    	driver.findElement(Signout).click();
	    }
}
