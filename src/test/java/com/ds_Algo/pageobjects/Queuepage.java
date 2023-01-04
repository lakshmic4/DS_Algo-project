package com.ds_Algo.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Queuepage {
	WebDriver ldriver;
	public Queuepage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
}
	@FindBy(xpath="//a[@href='queue']")
	WebElement Queue;
	
	@FindBy(xpath="//a[@href='implementation-lists']")
	WebElement implementationofQueue;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement Tryhere;
	
	@FindBy(xpath = "//div/div/form[@id='answer_form']/div/div/div/textarea")
	WebElement text;

	
	@FindBy( xpath="//button[@onclick='runit()']")
	WebElement run;
	
	@FindBy(id="output")
	WebElement outMsg;

	
	@FindBy(xpath="//a[text()='Implementation using collections.deque']")
	WebElement implementationcollectionsdeque;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement Tryhere1;
	
	@FindBy(xpath = "//div/div/form[@id='answer_form']/div/div/div/textarea")
	WebElement text1;

	
	@FindBy( xpath="//button[@onclick='runit()']")
	WebElement run1;
	
	@FindBy(id="output")
	WebElement outMsg1;
	
	@FindBy(xpath="//a[text()='Implementation using array']")
	WebElement Implementationusingarray;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement Tryhere2;
	
	@FindBy(xpath = "//div/div/form[@id='answer_form']/div/div/div/textarea")
	WebElement text2;
	
	@FindBy( xpath="//button[@onclick='runit()']")
	WebElement run2;
	
	@FindBy(id="output")
	WebElement outMsg2;
	
	@FindBy(xpath="//a[text()='Queue Operations']")
	WebElement queueOperations;
	
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement Tryhere3;
	
	@FindBy(xpath = "//div/div/form[@id='answer_form']/div/div/div/textarea")
	WebElement text3;
	
	@FindBy( xpath="//button[@onclick='runit()']")
	WebElement run3;
	
	@FindBy(id="output")
	WebElement outMsg3;
	
	public void Queue() {
		Queue.click();
	}	
		public void implementationofQueue() {
			implementationofQueue.click();	
   }
		public void  Tryhere() {
			Tryhere.click();
			
		}
		public void writetext(String code) {
			text.sendKeys(code);
		}

		public void run() {
			run.click();
		}
		public String OutPutMsg() {
			String outmsg= outMsg.getText();
			return outmsg;
			}

		public void implementationcollectionsdeque() {
			implementationcollectionsdeque.click();		
		}
		public void  Tryhere1() {
			Tryhere1.click();
		}
		public void writetext1(String code) {
			text1.sendKeys(code);
		}
		
		public void run1() {
			run1.click();
		}
		public String OutPutMsg1() {
			String outmsg1= outMsg1.getText();
			return outmsg1;
			}
		public void Implementationusingarray() {
			Implementationusingarray.click();
		}
		public void  Tryhere2() {
			Tryhere2.click();
		}
		public void writetext2(String code) {
			text2.sendKeys(code);
		}
		public void run2() {
			run2.click();
		}
		public String OutPutMsg2() {
			String outmsg2= outMsg2.getText();
			return outmsg2;
			}
		public void queueOperations() {
			queueOperations.click();
		}
		public void  Tryhere3() {
			Tryhere3.click();
		}
		public void writetext3(String code) {
			text3.sendKeys(code);
		}
		public void run3() {
			run3.click();
		}
		public String OutPutMsg3() {
			String outmsg3= outMsg3.getText();
			return outmsg3;
			}
		}
