package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Maven_Adactin_Proj.Adactin_BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\Adactin.feature", 
				 glue = "com.StepDefnin",
				 monochrome = true,
				 dryRun = false,
				 strict = true,
				 tags = ("~@regressionTest"),
				// tags = ("@smokeTest , @sanityTest"),
		plugin = {"html:Report/HtmlReport",
				"pretty",
				"json:JasonReport/Report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:CucumberExtentReport/CE_Report.html"
				}
		)
public class Test_Runner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {

		driver = Adactin_BaseClass.get_Driver("chrome");
	}
	
	@AfterClass
	public static void tear_Down() {
		driver.close();
	}
}
