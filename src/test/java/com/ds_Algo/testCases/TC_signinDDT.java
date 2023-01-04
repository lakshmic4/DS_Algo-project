package com.ds_Algo.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ds_Algo.pageobjects.GetstartedPage;
import com.ds_Algo.pageobjects.RigisterPage;
import com.ds_Algo.pageobjects.SigninPage;
import com.ds_Algo.utilities.XLUtils;

public class TC_signinDDT extends BaseClass{
	@Test(dataProvider="signinData")
	public void signinDDT(String user,String pwd) throws InterruptedException {
		driver.get(baseurl);
		logger.info("URL is opened");
		
		GetstartedPage gs=new GetstartedPage(driver);
		gs.getstart();
		Thread.sleep(2000);
		/*RigisterPage rs=new RigisterPage(driver);
		rs.rigister();
		Thread.sleep(2000);*/
		SigninPage sp=new SigninPage(driver);
		sp.signin();
		sp.setusername(username);
		logger.info("username is entered");
		sp.setpassword(password);
		logger.info("password is entered");
		sp.submit();
		
		Thread.sleep(3000);
	}

	@DataProvider(name="signinData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/ds_Algo/testDataFiles/Data.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String signindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				signindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return signindata;
	}
	
}

