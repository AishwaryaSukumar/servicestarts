package org.cts.tester.ReadWrite;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dr.Kamaraj\\eclipse-workspace\\ReadWrite\\div\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public static void Url(String Url) 
	{
		driver.get(Url);
	}
	public static void type(WebElement e, String name) {
		e.sendKeys(name);
		
	}
public static void btn(WebElement w) {
w.click();
}

public static void selectByValue(WebElement e, String n) {
new Select(e).selectByValue(n);
}
public static void selectByIndex(WebElement e,int j) {
	
	new Select(e).selectByIndex(j);
}
 
public static void selectByVisibleText(WebElement e,String n)
{
	new Select(e).selectByVisibleText(n);
}
public static void doubleClick(WebElement e) {
	new Actions(driver).doubleClick(e).perform();
}
public static void rightClick(WebElement w) {
	new Actions(driver).contextClick(w).perform();
}


public static void order(int rowNo, int cellNo, String orderNo) throws IOException {
	File ff=new File("C:\\Users\\Dr.Kamaraj\\eclipse-workspace\\ReadWrite\\xel\\POMExcel.xlsx");
	FileInputStream fsi=new FileInputStream(ff);
	Workbook wb=new XSSFWorkbook(fsi);
	Sheet she=wb.getSheet("Sheeta");
	Row rr = she.getRow(rowNo);
	Cell cc = rr.createCell(cellNo);
	cc.setCellValue(orderNo);
	FileOutputStream fos=new FileOutputStream(ff);
	wb.write(fos);
	
}
	public static String getData(int rowNo, int cellNo) throws IOException{
	File f=new File("C:\\Users\\Dr.Kamaraj\\eclipse-workspace\\ReadWrite\\xel\\POMExcel.xlsx");
	FileInputStream s=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(s);
	Sheet ss=w.getSheet("Sheeta");
	Row r=ss.getRow(rowNo);
	Cell c=r.getCell(cellNo);
	int type =c.getCellType();
	String name=null;
	if(type==1) {
		 name = c.getStringCellValue();
		System.out.println(name);
	}
if(type==0) {
	if(DateUtil.isCellDateFormatted(c)) {
		java.util.Date date = c.getDateCellValue();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yy");
		sdf.format(date);
	}else {
		
	
	double d=c.getNumericCellValue();
	long l=(long)d;
			name = String.valueOf(l);
	}
}
return name;

	}


}