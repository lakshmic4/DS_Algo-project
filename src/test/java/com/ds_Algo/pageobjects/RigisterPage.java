package com.ds_Algo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RigisterPage {
	WebDriver ldriver;
	public RigisterPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
//@FindBy(xpath="//button[text()='Get Started']")
//WebElement getstart;

@FindBy(xpath="//a[text()=' Register ']")
WebElement rigister;

@FindBy(id="id_username")
WebElement username;

@FindBy(id="id_password1")
WebElement password1;

@FindBy(id="id_password2")
WebElement password2;

@FindBy(xpath="//input[@type='submit']")
WebElement submit;

//public void getstart() {
	//getstart.click();

public void rigister() {
	rigister.click();
}

public void setusername(String user) {
	username.sendKeys(user);

}
public void setpassword(String pwd1) {
	password1.sendKeys(pwd1);

}
public void verifypassword(String pwd2) {
	password2.sendKeys(pwd2);

}

public void submit() {
submit.click();
}
}