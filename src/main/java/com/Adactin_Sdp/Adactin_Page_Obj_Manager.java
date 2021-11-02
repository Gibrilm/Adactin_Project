package com.Adactin_Sdp;

import org.openqa.selenium.WebDriver;

import com.Adactin_Pom_Classes.Booked_Itinerary_Page;
import com.Adactin_Pom_Classes.Booking_Confirmation_Page;
import com.Adactin_Pom_Classes.Hotel_Booking_Page;
import com.Adactin_Pom_Classes.Login_Page;
import com.Adactin_Pom_Classes.Search_Hotel_Page;
import com.Adactin_Pom_Classes.Select_Hotel;

public class Adactin_Page_Obj_Manager {
	
	public WebDriver driver;

	private Login_Page lp;
	
	private Search_Hotel_Page shp;
	
	private Select_Hotel sh;
	
	private Hotel_Booking_Page hbp;
	
	private Booking_Confirmation_Page bcp;
	
	private Booked_Itinerary_Page bip;
	
	public Adactin_Page_Obj_Manager(WebDriver driver2) {
		this.driver=driver2;
	}

	public Login_Page getInstanceLp() {
		 lp = new Login_Page(driver);
		 return lp;
	}
	
	public Search_Hotel_Page getInstanceShp()
	{
		shp= new Search_Hotel_Page(driver);
		return shp;
}
	public Select_Hotel getInstanceSh() {
		sh = new Select_Hotel(driver);
		return sh;
	}
	public Hotel_Booking_Page getInstanceHbp() {
		hbp= new Hotel_Booking_Page(driver);
		return hbp;
	}
	public Booking_Confirmation_Page getInstanceBcp() {
		bcp= new Booking_Confirmation_Page(driver);
		return bcp;
	}
	
	public Booked_Itinerary_Page getInstanceBip() {
		bip=new Booked_Itinerary_Page(driver);
		return bip;
}
	
}