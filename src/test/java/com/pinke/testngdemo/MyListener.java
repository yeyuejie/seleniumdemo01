package com.pinke.testngdemo;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class MyListener extends TestListenerAdapter {
	@Override
	public void onTestFailure(ITestResult tr) {
		String name=tr.getMethod().getMethodName();
		Reporter.log("���Է�����"+name+"ִ��ʧ����");
		System.err.print("--->"+name);
	

}
}
