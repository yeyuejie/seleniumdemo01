package com.pinke.ecshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	@FindBy(linkText="Ãâ·Ñ×¢²á")
	private WebElement register_link;
	
	@FindBy(xpath="//a[@href='user.php'] ")
	private WebElement login_link;

    @FindBy(xpath=".//div[1]/div/div[2]/div[1]/a")
    private WebElement user_center;
    
    @FindBy(xpath=".//*[@id='ECS_CARTINFO']/a")
    private WebElement shopping_car;
    
    @FindBy(linkText="Ê×Ò³")
    private WebElement home_page;
    
    @FindBy(xpath="//div[@class='m_left']/ul/li[2]/a")
    private WebElement clothes_button;
    
    @FindBy(xpath="//div[@class='m_left']/ul/li[3]/a")
    private WebElement portable_power;
    
    @FindBy(xpath="//div[@class='m_left']/ul/li[4]/a")
    private WebElement magic_fashion;
    
    @FindBy(xpath="//div[@class='m_left']/ul/li[5]/a")
    private WebElement appliance;
    
    public IndexPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
    
	public void goRegister(){
		register_link.click();
	}
	public void goLogin(){
		login_link.click();
	}
    public void shoppincar_to_goLogin(){
    	shopping_car.click();
    }
	
	public void goClothes(){
		clothes_button.click();
	}
	
	
	
	
}
