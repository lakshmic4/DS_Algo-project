package com.ds_Algo.testCases;

import org.testng.annotations.Test;

import com.ds_Algo.pageobjects.GetstartedPage;
import com.ds_Algo.pageobjects.RigisterPage;
import com.ds_Algo.pageobjects.SigninPage;

public class TC_signin extends BaseClass{
	@Test
	public void signin() throws InterruptedException {
		driver.get(baseurl);
		logger.info("URL is opened");

		GetstartedPage gs=new GetstartedPage(driver);
		gs.getstart();
		Thread.sleep(2000);
		RigisterPage rs=new RigisterPage(driver);
		rs.rigister();
		Thread.sleep(2000);
		SigninPage sp=new SigninPage(driver);
		sp.signin();
		Thread.sleep(2000);
		sp.setusername(username);
		logger.info("username is entered");

		Thread.sleep(2000);
		sp.setpassword(password);
		logger.info("password is entered");

		Thread.sleep(2000);
		sp.submit();
		
		
	}

}
