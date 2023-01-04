package com.ds_Algo.testCases;

import org.testng.annotations.Test;

import com.ds_Algo.pageobjects.GetstartedPage;

public class TC_getstarted extends BaseClass{
	
@Test	
public void getstarted() {
	//driver.get(baseurl);
	logger.info("URL is opened");

	GetstartedPage gs=new GetstartedPage(driver);
	gs.getstart();
	
	
}
}
