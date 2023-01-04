package com.ds_Algo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructurespage {
	WebDriver ldriver;
	public DataStructurespage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

}
	@FindBy(xpath="//a[@href='data-structures-introduction']")
	WebElement DataStructures;
	
	
	
	public void DataStructures() {
		DataStructures.click();
		
		
	}

	
	
		
	}

