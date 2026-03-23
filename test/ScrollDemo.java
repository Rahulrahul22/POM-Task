package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDemo {
  @Test
  public void f() throws InterruptedException {
	  WebDriver d= new ChromeDriver();
	  d.get("https://practice.expandtesting.com/scrollbars");
//	  JavascriptExecutor j=(JavascriptExecutor) d;
//	  j.executeScript("window.scrollBy(0,500)");
//	  Thread.sleep(3000);
//	  j.executeScript("window.scrollBy(0,-500)");
//	  
	  
	  
	  JavascriptExecutor j=(JavascriptExecutor) d;
	  WebElement link= d.findElement(By.xpath("//a[@class='my-link']"));
	  j.executeScript("arguments[0].scrollIntoView();",link);
	  Thread.sleep(3000);
	  link.click();
 
  }
	}
