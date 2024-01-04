package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
