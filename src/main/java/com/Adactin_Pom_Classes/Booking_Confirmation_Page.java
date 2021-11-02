package com.Adactin_Pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation_Page {
	public WebDriver driver;
@FindBy(xpath = "//input[@name='my_itinerary']")
private WebElement orderdetails;

@FindBy(xpath = "//td[normalize-space()='Booking Confirmation']")
private WebElement ordersnap;

public Booking_Confirmation_Page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

public WebElement getOrderdetails() {
	return orderdetails;
}
public WebElement getOrdersnap() {
	return ordersnap;
}

}
