package com.rg.main;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class Testbase {
 
	public static WebDriver driver;
	
	@BeforeClass
	public static void openbrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.coachchat.me/login");
	}
	
	@AfterClass
	public static  void closebrowser() throws InterruptedException {
		driver.quit();
	}
	
	
	}

