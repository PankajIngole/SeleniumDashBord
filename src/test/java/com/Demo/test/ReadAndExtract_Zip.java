package com.Demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;


public class ReadAndExtract_Zip {
	
	
	@Test
	public void extractZip() throws IOException, ZipException {
		
	    String	ZipFilePath= "C:\\Users\\z004krnn\\Downloads\\AMN_ID(17606)_All_Downloads_19_Sep_2024.zip";
	    String	Zip_Extract_Location= "C:\\Users\\z004krnn\\Downloads\\ExtractFile";
	    
		ZipFile	zip=new ZipFile(ZipFilePath);
		
		if (zip.isEncrypted()) {
			zip.setPassword("Demo");
			
		}
		zip.extractAll(Zip_Extract_Location);
		
		File FileName= new File(Zip_Extract_Location);
		String[] fileCount=FileName.list();
		System.out.println(fileCount.length);
		for(int i=0;i<fileCount.length;i++) {
			
			System.out.println(fileCount[i]);
			
		}
		
	}

}
