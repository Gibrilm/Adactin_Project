package com.Adactin_Pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Booking_Page {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='first_name']")
private WebElement firstname;

@FindBy(xpath = "//input[@name='last_name']")
private WebElement lastname;

@FindBy(xpath = "//textarea[@name='address']")
private WebElement address;

public Hotel_Booking_Page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCardnumber() {
	return cardnumber;
}

public WebElement getCardtype() {
	return cardtype;
}

public WebElement getMonth() {
	return month;
}

public WebElement getYear() {
	return year;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBookbtn() {
	return bookbtn;
}

@FindBy(xpath = "//input[@name='cc_num']")
private WebElement cardnumber;

@FindBy(xpath = "//select[@name='cc_type']")
private WebElement cardtype;

@FindBy(xpath = "//select[@name='cc_exp_month']")
private WebElement month;

@FindBy(xpath = "//select[@name='cc_exp_year']")
private WebElement year;

@FindBy(xpath = "//input[@name='cc_cvv']")
private WebElement cvv;

@FindBy(xpath = "//input[@name='book_now']")
private WebElement bookbtn;

}
