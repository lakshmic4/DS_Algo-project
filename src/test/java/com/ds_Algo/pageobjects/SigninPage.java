package com.ds_Algo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	WebDriver ldriver;
	public SigninPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

}
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement signin;
	
	@FindBy(id="id_username")
	WebElement username;
	
	@FindBy(id="id_password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public void signin() {
		signin.click();
	}

	public void setusername(String user) {
		username.sendKeys(user);

	}
	public void setpassword(String pwd) {
		password.sendKeys(pwd);

	}
	
	public void submit() {
	submit.click();
	}
}

