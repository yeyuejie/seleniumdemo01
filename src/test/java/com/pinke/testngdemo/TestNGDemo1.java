package com.pinke.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	@Test
	public void test11(){
		Assert.assertEquals(10, 10);
	}
	@Test
	public void test12(){
		Assert.assertEquals(10, 11);
	}

}
