package pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginP {
	WebDriver d;
	private By uid=By.xpath("//input[@id='first_name']");
	private By last = By.xpath("//input[@id='last_name']");
	private By email = By.xpath("//input[@id='email']");
	private By pwd =   By.xpath("//input[@id='password']");
	private By create = By.xpath("//input[@value='Create']");
	
	public LoginP(WebDriver d) {
		this.d=d;
		
	}
	
	public void enterUserName(String username) {
		
		d.findElement(uid).sendKeys(username);
		
	}
	
public void enterUserlast(String lastn) {
		
		d.findElement(last).sendKeys(lastn);

}


public void enterUserEmail(String emailn) {
	
	d.findElement(email).sendKeys(emailn);

}
public void enterUserPwd(String password) {
	
	d.findElement(pwd).sendKeys(password);
}
public  void createClick (){
	
	d.findElement(create).click();;

}
}