package com.pinke.testngdemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pinke.demo.Calc;

public class ParameterTest3 {
	private Calc calc;
	@BeforeClass
	public void init(){
		calc=new Calc();
	}

	@DataProvider(name="calcdata")
	public Object[][] getData(){
		Object[][] object=new Object[][]{
			{10,20,30},
			{30,20,10}
		};
		return object;
	}
	@Test(dataProvider="calcdata")
    public void calcTest(int x,int y,int expected){
    	int actual=calc.compute(x, y);
    	assertEquals(actual, expected);
    	
    }
}