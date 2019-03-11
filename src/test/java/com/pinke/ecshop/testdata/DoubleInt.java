package com.pinke.ecshop.testdata;

public class DoubleInt {
	public static Object double2Int(double data){
		if(data-(int)data==0){
			return (int)data;
		}else{
			return data;
		}
	
	}
}
