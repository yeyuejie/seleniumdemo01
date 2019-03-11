package com.pinke.ecshop.testdata;

import org.testng.annotations.DataProvider;

public class TestDataFactory {
    @DataProvider(name="login_data")
    public static Object[][] getLoginData(){
    	Object[][] objt=new Object[][]{
    		{"yyj01","123456","登录成功"},
			{"yyj01","1234567","用户名或密码错误"}
    	};
		return objt;
    }
    
    @DataProvider(name="login_csv_data")
    public static Object[][] getCsvLoginData(){
    	Object[][] obj=ReadCsvlUtils.getCsvData("hello.csv");
    	return obj;
    }
    
    @DataProvider(name="login_excel_data")
    public static Object[][] getExcelLoginData(){
    	Object[][] obj=ReadExcelUtils.getExcelData("hello.xlsx");
		return obj;
    	
    }
}
