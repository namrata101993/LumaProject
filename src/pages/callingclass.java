package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class callingclass {
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		Createaccount p=new Createaccount(driver);
		
		
		p.url();
		p.createaccount();
		p.firstname("namrata");
		p.lastname("jain");
		p.email("namrata06@gmail.com");
		p.password("namrata@06");
		p.passwordconfirm("namrata@06");
		p.signupbutton();
		
	}
}
