package com.ds_Algo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignoutPage {
	WebDriver ldriver;
	public SignoutPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

}
	@FindBy(xpath="//a[text()='Sign out'] ")
	WebElement signout;
	
	public void signout() {
		signout.click();
	}
}