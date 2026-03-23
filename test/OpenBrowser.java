package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
	    d.get("https://practicetestautomation.com/practice-test-login/");
	   WebElement w= d.findElement(By.id("username"));
	  
//	    d.findElement(By.id("password")).sendKeys("Password123");
//	    
//	    d.findElement(By.id("submit")).click();
	   Actions act= new Actions(d);
//	   act.moveToElement(w).contextClick().build().perform();
	  // act.contextClick(w).build().perform();
	    
	   w.sendKeys("abcd");
	   act.doubleClick(w).build().perform();// double click
	}

}
