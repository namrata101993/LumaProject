package mytest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Program6 extends Program1 {

@Test (priority=1)
public void totallinksinhomepage() {
	//check total number of link and print in conso
	List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	int size= allLinks.size();
	System.out.println(size);
	for(int i=0;i<size;i++) {
		//System.out.println(allLinks.get(i).getText());
		System.out.println(allLinks.get(i).getAttribute("href"));
	}
	
}
}
