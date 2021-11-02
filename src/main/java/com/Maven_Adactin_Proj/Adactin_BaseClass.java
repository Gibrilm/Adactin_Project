package com.Maven_Adactin_Proj;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_BaseClass {
	public static WebDriver driver;
	
	public static WebDriver get_Driver(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//driver//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//driver//geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void input(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void Impliwait(int value) {
		driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
	}

	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byIndex")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		} else if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		}
		
	}
	public static void sleep(int values) throws InterruptedException {
		Thread.sleep(values);
	}
	public static void screenshot(String values) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\USER\\eclipse-workspace\\Maven_Adactin_Proj\\screenshot\\" + values + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void close() {
		driver.close();
	}

}
