package com.pinke.ecshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ClothesPage {
    
    
    public ClothesPage(WebDriver driver){
    	PageFactory.initElements(driver, this);
    }
    
}
