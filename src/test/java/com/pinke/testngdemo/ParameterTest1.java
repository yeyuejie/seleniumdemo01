package com.pinke.testngdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest1 {
	@Parameters(value={"name","age"})
	@Test
	public void parameterCase1(String nm,int ag){
		System.out.println("�ҵ����֣�"+nm+"�ҵ����䣺"+ag);
	}

}
