
package com.ds_Algo.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeComplexityPage {
	WebDriver ldriver;
	public TimeComplexityPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

}
	@FindBy(xpath="//a[@href='time-complexity']")
	WebElement TimeComplexity;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement Tryhere;
	
	
	@FindBy( xpath="//button[@onclick='runit()']")
	WebElement run;
	
	
	public void TimeComplexity() {
		 TimeComplexity.click();
		 
	}

	public void  Tryhere() {
		Tryhere.click();
	}

	public void run() {
		run.click();
	}
	
	
	}
