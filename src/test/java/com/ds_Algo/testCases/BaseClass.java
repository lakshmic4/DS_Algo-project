package com.ds_Algo.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ds_Algo.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseurl=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public String code=readconfig.getCode();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(@Optional("chrome")String br) {
		logger = Logger.getLogger("DS_Algo");
		PropertyConfigurator.configure("log4j-properties");
		// WebDriverManager.chromedriver().setup();
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver=new ChromeDriver(); 	
		}
		else if(br.equals("firefox")) {
		   
		System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
		driver=new FirefoxDriver(); 
		}
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void teatdown() {
		driver.quit();
		
	}
}
