package test2;

import org.testng.annotations.Test;

import base2.Launch;

import pages2.LoginP;

public class Run extends Launch {
	
  @Test
  public void run1() throws InterruptedException {
	  LoginP lp =new LoginP(d);
	  lp.enterUserName("Rahul");
	  lp.enterUserlast("rah");
	  lp.enterUserEmail("rahul.s@gamil.com");
	  lp.enterUserPwd("Rahul123");
	  lp.createClick();
  }
}
