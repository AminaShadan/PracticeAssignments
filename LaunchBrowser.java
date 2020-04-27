package com.amina.test1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		String browser  ="chrome";
	    if (browser.equals("chrome"))
	    {
	     	System.setProperty("webdriver.chrome.driver", "D://Selenium//Office-Learn//src//drivers//chromedriver.exe");
			driver = new ChromeDriver(); //launching the browser
			driver.manage().window().maximize();
	    }
	    else if(browser.equals("firefox"))
	    {
		//Firefox 53.0.3 64 bit + geckodriver 0.16.1
			System.setProperty("webdriver.gecko.driver", "D://Selenium//Office-Learn//src//drivers//geckodriver.exe"); 
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
	    }
	    else if(browser.equals("ie"))
	    {
			System.setProperty("webdriver.ie.driver", "D://Selenium//Office-Learn//src//drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
	    }
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.close();

	}

}
