package com.pinke.testngdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestPoi {
	@Test
	public void writeExcel() throws IOException{
	XSSFWorkbook workBook=	new XSSFWorkbook();
	XSSFSheet sheet=workBook.createSheet("helloworld");
	XSSFRow row=sheet.createRow(2);
	XSSFCell cell=row.createCell(2, CellType.STRING);
	cell.setCellValue("helloworld");
	FileOutputStream outputstream=
			new FileOutputStream(new File("D:\\eclipse\\workspace\\seleniumdemo01\\src\\test\\resources\\hello.xlsx"));
	workBook.write(outputstream);
	workBook.close();
	}

}
