package com.org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static com.rg.main.Testbase.driver;


public class Chatroompage {

	public WebElement Numeric;
	public WebElement layout;
	public WebElement Use;
	
	
	
	public WebElement getNumeric() throws InterruptedException  {
		Thread.sleep(5000);
		Numeric = driver.findElement(By.xpath("//h3[normalize-space()='Numerical Calculator']//i[@class='la unchecked-icons']"));
		return Numeric;
	}
	public WebElement getLayout() {
		layout = driver.findElement(By.xpath(""));
		return layout;
	}
	public WebElement getUse() {
		
		return Use;
	}
	
	
	
}
