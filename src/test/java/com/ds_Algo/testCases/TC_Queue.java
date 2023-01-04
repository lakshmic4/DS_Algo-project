package com.ds_Algo.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ds_Algo.pageobjects.DataStructurespage;
import com.ds_Algo.pageobjects.GetstartedPage;
import com.ds_Algo.pageobjects.Queuepage;
import com.ds_Algo.pageobjects.SigninPage;

public class TC_Queue extends BaseClass{
	@Test
	public void queue() throws InterruptedException {
		driver.get(baseurl);
		logger.info("URL is opened");
		GetstartedPage gs=new GetstartedPage(driver);
		gs.getstart();
		Thread.sleep(2000);
		SigninPage sp=new SigninPage(driver);
		sp.signin();
		Thread.sleep(2000);
		sp.setusername(username);
		logger.info("Username is entered");
		 Thread.sleep(3000);
		 sp.setpassword(password);
		 logger.info("password is entered");
		 sp.submit();
		 Thread.sleep(3000);
		
		 
		 Queuepage qp=new  Queuepage(driver);
		 qp.Queue();
		 qp.implementationofQueue();
		 qp.Tryhere();
			qp.writetext(code);
			qp.run();
			qp.OutPutMsg();
			Thread.sleep(2000);
			driver.navigate().back();
		
		 qp.implementationcollectionsdeque();
		 qp.Tryhere1();
		 qp.writetext1(code);
		 qp.run1();
		 qp.OutPutMsg1();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 
		 qp.Implementationusingarray();
		 qp.Tryhere2();
		 qp.writetext2(code);
		 qp.run2();
		 qp.OutPutMsg2();
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}