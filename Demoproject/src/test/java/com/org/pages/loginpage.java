package com.org.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static  com.rg.main.Testbase.driver;;



public class loginpage{
	public  WebElement email;
	public WebElement Password;
	public WebElement Loginbutton;
    public WebDriverWait waitmodule;

	public loginpage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public WebElement getEmail() {
		return driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		
	}
	public WebElement getPassword() {
		return driver.findElement(By.xpath("//input[@id='password']"));
	}
	public WebElement getLoginbutton() {
		return driver.findElement(By.xpath("//button[@class='btn w-100']"));
		
	}

}
