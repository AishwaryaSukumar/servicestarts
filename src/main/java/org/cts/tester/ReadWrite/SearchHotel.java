package org.cts.tester.ReadWrite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchHotel extends BaseClass {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver=getDriver();

	Url("https://www.adactin.com/HotelApp/SearchHotel.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
}
}
