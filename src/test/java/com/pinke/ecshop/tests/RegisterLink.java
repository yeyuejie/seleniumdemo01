package com.pinke.ecshop.tests;

import org.openqa.selenium.WebDriver;

import com.pinke.ecshop.pages.IndexPage;
import com.pinke.ecshop.utils.WebDriverUtil;

public class RegisterLink {

	public static void main(String[] args) {
		WebDriver driver=WebDriverUtil.getDriver();
        driver.get("http://localhost/eshop/");
        driver.manage().window().maximize();
      try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
      IndexPage indexpage=new IndexPage(driver);
      indexpage.goRegister();
      try {
  		Thread.sleep(3000);
  	} catch (InterruptedException e) {
  		e.printStackTrace();
  	}
        WebDriverUtil.stopService();
}
}
