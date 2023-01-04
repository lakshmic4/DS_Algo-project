package com.ds_Algo.testCases;

import org.testng.annotations.Test;

import com.ds_Algo.pageobjects.GetstartedPage;
import com.ds_Algo.pageobjects.RigisterPage;

public class TC_register extends BaseClass {
	@Test
	public void rigister() throws InterruptedException {
	driver.get(baseurl);
	logger.info("URL is opened");

	RigisterPage rs=new RigisterPage(driver);
	GetstartedPage gs=new GetstartedPage(driver);
	gs.getstart();
	rs.rigister();
	Thread.sleep(2000);
	rs.setusername(username);
	logger.info("Username is entered");

	Thread.sleep(2000);
	rs.setpassword(password);
	logger.info("password is entered");

	Thread.sleep(2000);
	rs.verifypassword(password);
	Thread.sleep(2000);
	rs.submit();
	
	}
	

}
