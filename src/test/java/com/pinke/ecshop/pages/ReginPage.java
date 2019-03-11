package com.pinke.ecshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pinke.ecshop.tests.RegisterLink;

public class ReginPage {
	@FindBy(id="username")
	private WebElement username_input;
	@FindBy(id="email")
	private WebElement email_input;
	@FindBy(id="password1")
	private WebElement password1_input;
	@FindBy(id="conform_password")
	private WebElement conform_password_input;
	@FindBy(name="extend_field2")
	private WebElement qq_input;
	@FindBy(name="extend_field3")
	private WebElement officetel_input;
	@FindBy(name="extend_field4")
	private WebElement familytel_input;
	@FindBy(name="extend_field5")
	private WebElement tel_input;
	@FindBy(className="us_Submit_reg")
	private WebElement submitbutton;
	
	public ReginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void register(){
		username_input.sendKeys("yyj03");
		email_input.sendKeys("1234561@qq.com");
		password1_input.sendKeys("123456");
		conform_password_input.sendKeys("123456");
		tel_input.sendKeys("14759950001");
		submitbutton.click();
	}
}
