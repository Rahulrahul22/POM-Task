package base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	 public WebDriver d;
  @Test
  public void f() {
  }
  @BeforeTest
  public void setup() {
	  
	   d= new ChromeDriver();
	   d.get("https://practice.expandtesting.com/login");
		  d.manage().window().maximize();
	   
  }

  @AfterTest
  public void teanDown() {
	  d.quit();
  }

}
