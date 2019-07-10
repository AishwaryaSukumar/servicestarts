package org.cts.tester.ReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Try1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Dr.Kamaraj\\eclipse-workspace\\ReadWrite\\xel\\Excel.xlsx");
	FileInputStream ff=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(ff);
	Sheet s1 = w.getSheet("Sheet1");
	for(int i=0;i<s1.getPhysicalNumberOfRows();i++) {
		Row r1 = s1.getRow(i);
		for(int j=0;j<r1.getPhysicalNumberOfCells();j++) {
			Cell cc = r1.getCell(j);
			int i1 = cc.getCellType();
			if(i1==1) {
				String ss = cc.getStringCellValue();
				System.out.println(ss);
			}
			if(i1==0) {
				if(DateUtil.isCellDateFormatted(cc)) {
					Date d=cc.getDateCellValue();
					SimpleDateFormat sj=new SimpleDateFormat("dd-MMM-yy");
					String sx = sj.format(d);
					System.out.println(sx);
				}
				else {
					double d=cc.getNumericCellValue();
					long l=(long)d;
					String sc = String.valueOf(l);
					System.out.println(sc);
				}
			}
			
		}
	}
	
	
		}
	}

	

  
