package runtask;

import org.testng.annotations.Test;

import pages.Changepassword;
import pages.Createaccount;
import pages.Homepage;
import pages.Loginpage;
import pages.Shipping_address;

public class Run_login extends Run {
	@Test(priority=1)
	public void AccountDetails() {
		Createaccount signup=new Createaccount(driver);
		signup.createaccount();
		signup.firstname();
		signup.lastname();
		signup.email();
		signup.password();
		signup.passwordconfirm();
		signup.signupbutton();
	}
	 @Test(priority=2)
	    public void Manageaddress() {
		 Shipping_address address = new Shipping_address(driver);
		 address.Manageaddress();
}
	 @Test(priority=3)
	    public void Companyname() {
		 Shipping_address address = new Shipping_address(driver);
		 address.Companyname();
}
	 @Test(priority=4)
	    public void Street() {
		 Shipping_address address = new Shipping_address(driver);
		 address.Street();
}
	 @Test(priority=5)
	    public void scroll1() {
		 Shipping_address address = new Shipping_address(driver);
		 address.scroll1();
}
	 @Test(priority=6)
	    public void Country() {
		 Shipping_address address = new Shipping_address(driver);
		 address.Country();
}
	 @Test(priority=7)
	    public void countryDropdown() {
		 Shipping_address address = new Shipping_address(driver);
		 address.countryDropdown();
}
	 @Test(priority=8)
	    public void State() {
		 Shipping_address address = new Shipping_address(driver);
		 address.State();
}
	 @Test(priority=9)
	    public void stateDropdown() {
		 Shipping_address address = new Shipping_address(driver);
		 address.stateDropdown();
}
	 @Test(priority=10)
	    public void Cityname() {
		 Shipping_address address = new Shipping_address(driver);
		 address.Cityname();
}
	 @Test(priority=11)
	    public void Postcode() {
		 Shipping_address address = new Shipping_address(driver);
		 address.Postcode();
}
	 @Test(priority=12)
	    public void Telephonenum() {
		 Shipping_address address = new Shipping_address(driver);
		 address.Telephonenum();
}
	 @Test(priority=13)
	    public void Saveaddress() {
		 Shipping_address address = new Shipping_address(driver);
		 address.Saveaddress();
} 
	 @Test(priority=14)
	    public void Clickonprofiledropdown() {
		 Shipping_address address = new Shipping_address(driver);
		 address.Clickonprofiledropdown();
} 
	 @Test(priority=15)
	    public void Signout() {
		 Shipping_address address = new Shipping_address(driver);
		 address.Signout();
} 
	
	@Test(priority=16)
    public void testLogin() {
        
		Homepage homePage = new Homepage(driver);
        homePage.clickSignIn();
        
        Loginpage loginPage = new Loginpage(driver);
        loginPage.login("namrata06@gmail.com", "namrata@06");
        
}
	 @Test(priority=17)
	    public void searchButton() {
	        Homepage homePage = new Homepage(driver);
	        homePage.searchForProduct("shirt");
}
	 

	 @Test(priority=18)
	 public void clickproduct() {
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.clickproduct();
}
	 @Test(priority=19)
	 public void Selectimage() {
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.Selectimage();
}
	 
	 @Test(priority=20)
	 public void Selectsize() {
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.Selectsize();
}
	 @Test(priority=21)
	 public void Selectcolor() {
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.Selectcolor();
	 }
	      
	 @Test(priority=22)
	 public void Cartquantity() {
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.Cartquantity("2");
	 }
	 @Test(priority=23)
	 public void Addtocart() {
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.Addtocart();

	 }
	 @Test(priority=24)
	 public void Mycarticon() {
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.Mycarticon();

	 }
	 @Test(priority=25)
	 public void Checkoutbutton() throws InterruptedException {
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.Checkoutbutton();

	 }
	 @Test(priority=26)
	 public void scroll() {
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.scroll();
	 }

	 @Test(priority=27)
	 public void Next() throws InterruptedException{
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.Next();
	       

}
	 @Test(priority=28)
	 public void Placeorder() {
		 Loginpage loginPage = new Loginpage(driver);
	        loginPage.Placeorder();
	        
	 }
	 @Test(priority=29)
	 public void Clickprofiledropdown() {
		 Changepassword changepass = new Changepassword(driver);
		 changepass.Clickprofiledropdown();
	        
	 }
	 @Test(priority=30)
	 public void Clickonmyaccount() {
		 Changepassword changepass = new Changepassword(driver);
		 changepass.Clickonmyaccount();
	        
	 }
	 @Test(priority=31)
	 public void Clickonchangepassword() {
		 Changepassword changepass = new Changepassword(driver);
		 changepass.Clickonchangepassword();
	        
	 }
	 
	 @Test(priority=32)
	 public void ClickonCurrentPassword() {
		 Changepassword changepass = new Changepassword(driver);
		 changepass.ClickonCurrentPassword();
	        
	 }
	 @Test(priority=33)
	 public void ClickonNewPassword() {
		 Changepassword changepass = new Changepassword(driver);
		 changepass.ClickonNewPassword();
	        
	 }
	 @Test(priority=34)
	 public void ClickonNewConfirmPassword() {
		 Changepassword changepass = new Changepassword(driver);
		 changepass.ClickonNewConfirmPassword();
	        
	 }
	 @Test(priority=35)
	 public void ClickonSave() {
		 Changepassword changepass = new Changepassword(driver);
		 changepass.ClickonSave();
	        
	 }
	 
	 
 }