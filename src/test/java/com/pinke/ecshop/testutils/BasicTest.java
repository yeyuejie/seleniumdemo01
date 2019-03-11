package com.pinke.ecshop.testutils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pinke.ecshop.utils.WebDriverUtil;

public class BasicTest {
	public WebDriver driver;
	@BeforeMethod
	public void openBrowers(){
		driver=WebDriverUtil.getDriver();
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}

}
