package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest1 {
  @Test
  public void f() {
	  WebDriver d= new ChromeDriver();
	    d.get("https://www.google.com");
  }
}