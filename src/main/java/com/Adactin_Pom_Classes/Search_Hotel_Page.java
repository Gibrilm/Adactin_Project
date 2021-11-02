package com.Adactin_Pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	public WebDriver driver;
@FindBy(xpath = "//select[@name='location']")
private WebElement location;

@FindBy(xpath ="//select[@name='hotels']")
private WebElement hotel;

@FindBy(xpath = "//select[@name='room_type']")
private WebElement roomtype;

@FindBy(xpath = "//select[@name='room_nos']")
private WebElement roomno;

@FindBy(xpath = "(//input[@class='date_pick'])[1]")
private WebElement checkInDate;

@FindBy(xpath = "(//input[@class='date_pick'])[2]")
private WebElement checkOutDate;

@FindBy(xpath = "(//select[@class='search_combobox'])[5]")
private WebElement adultsperroom;

@FindBy(xpath = "(//select[@class='search_combobox'])[6]")
private WebElement childrenroom;

@FindBy(xpath = "//input[@name='Submit']")
private WebElement submit;

public Search_Hotel_Page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}


public WebElement getLocation() {
	return location;
}

public WebElement getHotel() {
	return hotel;
}

public WebElement getRoomtype() {
	return roomtype;
}

public WebElement getRoomno() {
	return roomno;
}

public WebElement getCheckInDate() {
	return checkInDate;
}

public WebElement getCheckOutDate() {
	return checkOutDate;
}

public WebElement getAdultsperroom() {
	return adultsperroom;
}

public WebElement getChildrenroom() {
	return childrenroom;
}

public WebElement getSubmit() {
	return submit;
}

}
