package com.pinke.testngdemo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pinke.demo.Calc;

public class ParameterTest2 {
	private Calc calc;
	@BeforeClass
	public void init(){
		calc=new Calc();
	}
	@Test
	public void testComputer1(){
		int x=10;
		int y=20;
		int expected=30;
		int actual=calc.compute(x, y);
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testComputer2(){
		int x=30;
		int y=20;
		int expected=10;
		int actual=calc.compute(x, y);
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void testComputer3(){
		int x=20;
		int y=20;
		int expected=40;
		int actual=calc.compute(x, y);
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}
}
