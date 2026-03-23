package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver d;
	private By uid=By.name("username");
	private By pwd = By.name("password");
	
	public LoginPage(WebDriver d) {
		this.d=d;
		
	}
	
	public void enterUserName(String username) {
		
		d.findElement(uid).sendKeys(username);
		
	}
	
public void enterUserPwd(String password) {
		
		d.findElement(pwd).sendKeys(password);
		
	}

}
