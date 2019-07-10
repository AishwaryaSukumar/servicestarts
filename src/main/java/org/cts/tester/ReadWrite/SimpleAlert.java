package org.cts.tester.ReadWrite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dr.Kamaraj\\eclipse-workspace\\ReadWrite\\div\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			WebElement w1 = driver.findElement(By.name("proceed"));
			w1.click();
			Alert al=driver.switchTo().alert();
			al.accept();
			
			
		}

	}


