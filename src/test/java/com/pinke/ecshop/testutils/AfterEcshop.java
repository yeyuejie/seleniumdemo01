package com.pinke.ecshop.testutils;

import org.testng.annotations.AfterSuite;

import com.pinke.ecshop.utils.WebDriverUtil;

public class AfterEcshop {
	@AfterSuite
	public void closeservice(){
		WebDriverUtil.stopService();
	}
}