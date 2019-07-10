package org.cts.tester.ReadWrite;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Aishu extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=getDriver();
		Url("https://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement w1 = driver.findElement(By.id("username"));
type(w1,getData(1,0));
WebElement w2 = driver.findElement(By.id("password"));
type(w2,getData(1,1));
WebElement w3 = driver.findElement(By.id("login"));
w3.click();
Thread.sleep(2000);
WebElement w4 = driver.findElement(By.id("location"));
selectByVisibleText(w4,getData(1,3));
WebElement w5 = driver.findElement(By.id("hotels"));
selectByVisibleText(w5,getData(1,4));
WebElement w6 = driver.findElement(By.id("room_type"));
selectByVisibleText(w6,getData(1,5));
WebElement w7 = driver.findElement(By.id("room_nos"));
selectByVisibleText(w7,getData(1,6));
WebElement w8 = driver.findElement(By.id("adult_room"));	
selectByVisibleText(w8,getData(1,9));
WebElement w10 = driver.findElement(By.id("child_room"));
selectByVisibleText(w10,getData(1,10));
WebElement w11 = driver.findElement(By.name("Submit"));
w11.click();
Thread.sleep(2000);
WebElement w12 = driver.findElement(By.id("radiobutton_0"));
w12.click();
WebElement w13 = driver.findElement(By.id("continue"));
w13.click();
WebElement w14 = driver.findElement(By.id("first_name"));
type(w14,getData(1,12));
WebElement w15 = driver.findElement(By.name("last_name"));
type(w15,getData(1,13));
WebElement w16 = driver.findElement(By.id("address"));
type(w16,getData(1,14));
WebElement w17 = driver.findElement(By.id("cc_num"));
type(w17,getData(1,15));
WebElement w18 = driver.findElement(By.id("cc_type"));
selectByVisibleText(w18,getData(1,16));
WebElement w19=driver.findElement(By.id("cc_exp_month"));
selectByVisibleText(w19,getData(1,17));
WebElement w20 = driver.findElement(By.id("cc_exp_year"));
selectByVisibleText(w20,getData(1,18));
WebElement w21 = driver.findElement(By.id("cc_cvv"));
type(w21,getData(1,19));
WebElement w22 = driver.findElement(By.id("book_now"));
w22.click();
Thread.sleep(7000);
WebElement w23 = driver.findElement(By.id("order_no"));
order(1,20,w23.getAttribute("value"));
String sas = w23.getText();
System.out.println(sas);
}
}