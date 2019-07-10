package org.cts.tester.ReadWrite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrrenShot {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dr.Kamaraj\\eclipse-workspace\\ReadWrite\\div\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	TakesScreenshot tk=(TakesScreenshot)driver;
	File s=tk.getScreenshotAs(OutputType.FILE);
	File d=new File("E:\\Ais.png");
FileUtils.copyFile(s, d);
	
	
	}
}
