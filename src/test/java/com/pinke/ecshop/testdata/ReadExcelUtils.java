package com.pinke.ecshop.testdata;

import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelUtils {
	public static void main(String[] args) {
		Object[][] o=getExcelData("hello.xlsx");
		for(int i=0;i<o.length;i++){
			for(int j=0;j<o[i].length;j++){
				System.out.print(o[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static Object[][] getExcelData(String filename){
		Object[][] obj=null;
		InputStream is=ReadExcelUtils.class.getClassLoader().getResourceAsStream(filename);
		try {
			Workbook wb=new XSSFWorkbook(is);
			Sheet sheet=wb.getSheet("helloworld");
			int lastrownum=sheet.getLastRowNum();    //获取行数
			Row titlerow=sheet.getRow(0);
			int lastcellnum=titlerow.getLastCellNum();
			obj=new Object[lastrownum][lastcellnum];
			for(int i=0;i<obj.length;i++){
				Row row=sheet.getRow(i+1);
				for(int j=0;j<obj[i].length;j++){
					Cell cell=row.getCell(j);
					obj[i][j]=parseData(cell);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
		
	}
    public static Object parseData(Cell cell){
    	Object data=null;
    	switch(cell.getCellTypeEnum()){
		case BOOLEAN:
			data=cell.getBooleanCellValue();
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)){
				data=cell.getDateCellValue();
			}else{
				data=DoubleInt.double2Int(cell.getNumericCellValue());
			}
			break;
		case STRING:
			data=cell.getStringCellValue();
			break;
		default:
			return null;
		}
		return data;
	
    }
}
