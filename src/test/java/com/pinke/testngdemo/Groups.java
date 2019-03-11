package com.pinke.testngdemo;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups {
	@BeforeGroups(groups={"windows.g1"})
	public void beforeGroups(){
		System.out.println("----beforeGroups----");
	}
	@AfterGroups
	public void afterGroups(){
		System.out.println("----afterGroups----");
	}
	@Test(groups={"windows.g1","apple.g1"})
	public void  testCase5(){
		System.out.println("----testCase5----");
	}
	@Test(groups={"windows.g2"})
	public void  testCase6(){
		System.out.println("----testCase6----");
	}
	@Test(groups={"linux.g1","apple.g1"})
	public void  testCase7(){
		System.out.println("----testCase7----");
	}
	@Test(groups={"linux.g2"})
	public void  testCase8(){
		System.out.println("----testCase8----");
	}
	@Test
	public void testCase9(){
		System.out.println("----testCase9----");
	}

}
