package com.pinke.ecshop.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//table/tbody/tr[1]/td[2]/input[@class='inputBg'] ")
	private WebElement login_username;
	@FindBy(xpath="//table/tbody/tr[2]/td[2]/input[@name='password']")
	private WebElement login_password;
	@FindBy(xpath="//table/tbody/tr[4]/td[2]/input[@name='submit']")
	private WebElement login_submit;
	
	@FindBy(xpath="//div[@class='box_1']/div/div/p")
	private WebElement login_result_text;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void login(String usrname,String psword){
		login_username.sendKeys(usrname);
	     try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		login_password.sendKeys(psword);
		login_submit.click();
		
	}
	public void loginAssert(String expected){
		assertEquals(login_result_text.getText(), expected);
	}
	

}
