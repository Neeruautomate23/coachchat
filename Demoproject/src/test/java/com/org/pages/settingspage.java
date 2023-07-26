package com.org.pages;

import static com.rg.main.Testbase.driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class settingspage {
WebElement Billing;
WebElement Changeyourpassword;
WebElement overview;
WebElement learnbycoach;
WebElement NeilPatel;
WebElement NeilPatelchat;
WebElement Prompt;
WebElement Send;
WebElement Sendone;
WebElement promptone;



public settingspage() {
}


public WebElement getBilling() throws InterruptedException {
	Thread.sleep(3000);
	return driver.findElement(By.xpath("//a[@class='setting_btn']//*[name()='svg']"));
	
}
public WebElement getChangeyourpassword() throws InterruptedException{
	Thread.sleep(3000);

	return driver.findElement(By.xpath("//ul[@class='select_ul']//a[contains(text(),'Billing & Invoice')]"));
}

public WebElement getOverview()throws InterruptedException {
	Thread.sleep(3000);

	return driver.findElement(By.xpath("//a[contains(text(),'Overview')]"));
}
 
public WebElement getLearnbycoach() throws InterruptedException {
	Thread.sleep(3000);

	return driver.findElement(By.xpath("//h4[normalize-space()='Learn from Coach']"));
}

public WebElement getNeilPatel() throws InterruptedException {
	Thread.sleep(5000);

	return driver.findElement(By.xpath("//h6[contains(text(),'Neil Patel')]"));
}

public WebElement getNeilPatelchat() throws InterruptedException {
	Thread.sleep(3000);

	return driver.findElement(By.id("suggestions"));
}
public WebElement getSend() {
	return driver.findElement(By.xpath("//button[@class='qus_submit text_enable']"));
}

public WebElement getSendone() throws InterruptedException {
	Thread.sleep(8000);

	return driver.findElement(By.id("suggestions"));
}



public WebElement getPromptone() throws InterruptedException {
	Thread.sleep(5000);

	return driver.findElement(By.xpath("//button[@class='qus_submit text_enable']"));
}


}
