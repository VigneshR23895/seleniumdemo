package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lib_Global {

	public static WebDriver driver;

	public static void getDriver() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void getUrl(String value) {
		driver.get(value);
	}
	public static void insertType(WebElement el ,String value) {
		el.sendKeys(value);
	}
	public static void click (WebElement el ) {
		el.click();
	}

}
