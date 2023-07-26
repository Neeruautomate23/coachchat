package com.org.tests;

import org.testng.annotations.Test;
import com.org.pages.loginpage;
import com.rg.main.Testbase;

public class Loginpagetest extends Testbase{

	
	@Test (priority =0)
	public void validatelogintest()  {
		loginpage urp = new loginpage();
		urp.getEmail().sendKeys("neeraj@gmail.com");
	}

	@Test (priority =1)
	
	public void validatepassword() {
		loginpage pass = new loginpage();
		pass.getPassword().sendKeys("MN@123456");
}
	
@Test (priority =2)
	
	public void validatebutton() {
		loginpage button = new loginpage();
		button.getLoginbutton().click();
}

}