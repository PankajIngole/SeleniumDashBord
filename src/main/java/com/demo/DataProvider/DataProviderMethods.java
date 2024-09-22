package com.demo.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkConstrant.FrameWorkConstant;


public class DataProviderMethods {
	 static FileInputStream File;
	 static XSSFWorkbook workbook;
	 static XSSFSheet sheet; 	
	 Object[] data=null;
	 String Key;
	 String Value;
		 
	@Test(dataProvider = "readExcelData")
	public void dataProviderTest(Map<String, String> map) {
		System.out.println(map.get("Name"));
		System.out.println(map.get("Passord"));
		
		
	}
	
	@DataProvider(name = "readExcelData")
	public Object[] readExcle() throws FileNotFoundException, IOException {
		

		
		 try {
			    
	   File=new FileInputStream(FrameWorkConstant.getExclePath());	  
	   workbook= new XSSFWorkbook(File);
	   sheet =workbook.getSheet("Sheet1");
	   
	   int LastRowNumb=sheet.getLastRowNum();
	   int LastCellNumber=sheet.getRow(0).getLastCellNum();
	   

	   data=new Object[LastRowNumb];
	   
	   Map<String,String> map;
	   for(int i=1;i<=LastRowNumb;i++) {
		   map=new HashMap<String,String>();
		   
		   for(int a=0;a<LastCellNumber;a++) {
			   
			   
		       Key =sheet.getRow(0).getCell(a).getStringCellValue();  
		       Value =sheet.getRow(i).getCell(a).getStringCellValue();  
 
		       map.put(Key, Value);
		       data[i-1]=map;
		   }
		  
	   } 
	  
		} catch (Exception e) {
			  e.printStackTrace(); 
		}
	   finally {
        if (workbook != null) {
            workbook.close();
        }
        if (File != null) {
        	File.close();
        }
	   }
		return data ;
	}
	}

