package com.pinke.ecshop.tests;

import org.testng.annotations.Test;

import com.pinke.ecshop.pages.IndexPage;
import com.pinke.ecshop.pages.LoginPage;
import com.pinke.ecshop.testdata.TestDataFactory;
import com.pinke.ecshop.testutils.BasicTest;


public class LoginTest extends BasicTest {
//	@DataProvider(name="login_data")
//	public Object[][] loginData(){
//		return new Object[][] {
//				{"liudao001","123456","登录成功"},
//				{"liudao002","123456","用户名或密码错误"}
//	};
//	}

	@Test(dataProvider="login_csv_data",dataProviderClass=TestDataFactory.class)
	public void loginTest1(String username,String password,String result){
		driver.get("http://localhost/eshop/");
		driver.manage().window().maximize();
		IndexPage indexpage=new IndexPage(driver);
		indexpage.goLogin();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.login(username,password);
		loginpage.loginAssert(result);
	}
	
}


