package com.pinke.testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo3 {
//	@BeforeTest
//	public void beforeTest(){
//		System.out.println("----beforeTest--3--");
//	}
//	@AfterTest
//	public void afterTest(){
//		System.out.println("----afterTest--3--");
//	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("----BeforeClass----");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("----afterClass----");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("----BeforeMethod----");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("----AfterMethod----");
	}
	@Test
	public void  testCase1(){
		System.out.println("----testCase1----");
	}
	@Test
	public void testCase2(){
		System.out.println("----testCase2----");
	}
    
}
