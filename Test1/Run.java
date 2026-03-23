package Test1;

import org.testng.annotations.Test;

import base.NewTest;
import pages.LoginPage;

public class Run extends NewTest {
  @Test
  public void run1() {
	  LoginPage lp =new LoginPage(d);
	  lp.enterUserName("abcd");
	  lp.enterUserPwd("ewewq");
  }
}
