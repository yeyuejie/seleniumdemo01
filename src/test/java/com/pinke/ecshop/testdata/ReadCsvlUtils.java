package com.pinke.ecshop.testdata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvlUtils {
	public static void main(String[] args) {
		Object[][] o=getCsvData("hello.csv");
		for(int i=0;i<o.length;i++){
			for(int j=0;j<o[i].length;j++){
				System.out.print(o[i][j]+"\t");
			}
			System.out.println();
		}
	}
    public static Object[][] getCsvData(String filename){
    	Object[][] objs=null;
    	InputStream is=ReadCsvlUtils.class.getClassLoader().getResourceAsStream(filename);
    	BufferedReader br=new BufferedReader(new InputStreamReader(is) );
    	String line=null;
    	try {
    		line=br.readLine();
    		List<Object[]> list=new ArrayList<>();
			while((line=br.readLine())!=null){
				list.add(line.split(","));
			}
			int size=list.size();
			objs=new Object[size][];
			for(int i=0;i<size;i++){
				objs[i]=list.get(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
	            br.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return objs;
    	
    }
    /*
     * 把csv文件中的数据做强转
     */
    public static Object[] parseData(String[] strdata){
    	Object[] obj=new Object[strdata.length];
    	for(int i=0;i<obj.length;i++){
    		try{
    		  Double tmp=Double.parseDouble(strdata[i]);
    		  obj[i]=tmp;
    		}catch(NumberFormatException e){
    		  if(strdata[i].equalsIgnoreCase("true")||strdata[i].equalsIgnoreCase("false")){
    			  Boolean bl=Boolean.parseBoolean(strdata[i]);
    			  obj[i]=bl;
    		  }else{
    			  obj[i]=strdata[i];
    		  }
    		}
    		}
    	
		return obj;
    	
    }
}
