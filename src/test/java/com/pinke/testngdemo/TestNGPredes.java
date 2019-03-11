package com.pinke.testngdemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNGPredes {
	@BeforeTest(groups={"windows.g1"})
	public void beforeTest(){
		System.out.println("----beforeTest--pre--");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("----afterTest--pre--");
	}

}
