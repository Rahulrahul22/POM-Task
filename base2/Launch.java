package base2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Launch {
	 public WebDriver d;
  @Test
  public void f() {
  }
  @BeforeTest
  public void setUp() throws InterruptedException {
	  
	   d= new ChromeDriver();
	   d.get("https://sauce-demo.myshopify.com/account/register");
		  d.manage().window().maximize();
		
  }

  @AfterTest
  public void teanDown() {
//	  d.quit();
  }

}
