package com.ds_Algo.testCases;

import org.apache.log4j.Logger;
import org.bouncycastle.crypto.io.SignerOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ds_Algo.pageobjects.DataStructurespage;
import com.ds_Algo.pageobjects.GetstartedPage;
import com.ds_Algo.pageobjects.RigisterPage;
import com.ds_Algo.pageobjects.SigninPage;
import com.ds_Algo.pageobjects.SignoutPage;
import com.ds_Algo.pageobjects.TimeComplexityPage;

public class TC_datastructures extends BaseClass{
	
	@Test
	public void datastructures() throws InterruptedException {
		driver.get(baseurl);
		logger.info("URL is opened");

		GetstartedPage gs=new GetstartedPage(driver);
		gs.getstart();
		Thread.sleep(2000);
		//RigisterPage rs=new RigisterPage(driver);
		//rs.rigister();
		//Thread.sleep(2000);
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
		DataStructurespage ds=new DataStructurespage(driver);
		ds.DataStructures();
		Thread.sleep(2000);
		TimeComplexityPage tc=new TimeComplexityPage(driver);
		tc.TimeComplexity();
		Thread.sleep(2000);
	     tc.Tryhere();
	     Thread.sleep(2000);
		/*SignoutPage so=new SignoutPage(driver);
		//so.signout();
		tc.EditorValue();*/
	     WebElement codeMirror = driver.findElement(By.className("CodeMirror"));
			/* getting the first line of code inside codemirror and clicking it to bring it in focus */
			WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
			codeLine.click();
			/* sending keystokes to textarea once codemirror is in focus */
			WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
			txtbx.sendKeys("print(\"hello world\")");
		tc.run();
		
		logger.info("python code entered");
		Thread.sleep(1000);
		
	}

}
