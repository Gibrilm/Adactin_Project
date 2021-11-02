package com.StepDefnin;
import org.openqa.selenium.WebDriver;
import com.Adactin_Sdp.Adactin_Page_Obj_Manager;
import com.Maven_Adactin_Proj.Adactin_BaseClass;
import com.Runner.Test_Runner;
import com.helper.File_Reader_Manager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defination extends Adactin_BaseClass{
	
	public static WebDriver driver = Test_Runner.driver;
	
	public static Adactin_Page_Obj_Manager pom = new Adactin_Page_Obj_Manager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);
	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	input(pom.getInstanceLp().getUsername(), username);
	}

	@When("^User Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	input(pom.getInstanceLp().getPassword(), password);
	}
	
	@Then("^user Click On The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	click(pom.getInstanceLp().getLoginbtn());
	}

	@When("^user Select The \"([^\"]*)\" as Location$")
	public void user_Select_The_as_Location(String location) throws Throwable {
		input(pom.getInstanceShp().getLocation(), location);
	}

	@When("^user Select The \"([^\"]*)\" as Hotel$")
	public void user_Select_The_as_Hotel(String hotel) throws Throwable {
		input(pom.getInstanceShp().getHotel(), hotel);
	}
	
	@When("^user Select The \"([^\"]*)\" as Room Type$")
	public void user_Select_The_as_Room_Type(String roomtype) throws Throwable {
	input(pom.getInstanceShp().getRoomtype(), roomtype);
	}

	@When("^user Select The \"([^\"]*)\" as Number Of Rooms$")
	public void user_Select_The_as_Number_Of_Rooms(String numofroom) throws Throwable {
	input(pom.getInstanceShp().getRoomno(), numofroom);
	}

	@When("^user Select The \"([^\"]*)\" as Check In Date$")
	public void user_Select_The_as_Check_In_Date(String checkindate) throws Throwable {
		input(pom.getInstanceShp().getCheckInDate(), checkindate);
	}

	@When("^user Select the \"([^\"]*)\" as Chcek Out Date$")
	public void user_Select_the_as_Chcek_Out_Date(String checkoutdate) throws Throwable {
		input(pom.getInstanceShp().getCheckOutDate(), checkoutdate);
	}

	@When("^user Select \"([^\"]*)\" as Adults Per Room$")
	public void user_Select_as_Adults_Per_Room(String adultsperroom) throws Throwable {
		input(pom.getInstanceShp().getAdultsperroom(), adultsperroom);
	}

	@When("^user Select \"([^\"]*)\" as Children Per Room$")
	public void user_Select_as_Children_Per_Room(String childperroom) throws Throwable {
		input(pom.getInstanceShp().getChildrenroom(), childperroom);
	}

	@Then("^user Click On The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	click(pom.getInstanceShp().getSubmit());
	}

	@When("^user Select The Radio Button To Select The Hotel$")
	public void user_Select_The_Radio_Button_To_Select_The_Hotel() throws Throwable {
		click(pom.getInstanceSh().getRadiobtn());
	}

	@Then("^user Click On The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	click(pom.getInstanceSh().getContinuebtn());
	}

	@When("^user Enter The \"([^\"]*)\" In First Name Field$")
	public void user_Enter_The_In_First_Name_Field(String fname) throws Throwable {
	input(pom.getInstanceHbp().getFirstname(), fname);
	}

	@When("^user Enter The \"([^\"]*)\" In Last Name Field$")
	public void user_Enter_The_In_Last_Name_Field(String lname) throws Throwable {
		input(pom.getInstanceHbp().getLastname(), lname);
	}

	@When("^user Enter The \"([^\"]*)\" In Billing Address Field$")
	public void user_Enter_The_In_Billing_Address_Field(String address) throws Throwable {
		input(pom.getInstanceHbp().getAddress(), address);
	}

	@When("^user Enter The \"([^\"]*)\" In Credit Card Number Field$")
	public void user_Enter_The_In_Credit_Card_Number_Field(String cardnumber) throws Throwable {
	input(pom.getInstanceHbp().getCardnumber(), cardnumber);
	}
	
	@When("^user Select The Credit Card Type In Credit card Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_card_Field() throws Throwable {
		String cardtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardtype();
		dropdown(pom.getInstanceHbp().getCardtype(), "byValue", cardtype);
	}
		
	@When("^user Selcet The Expiry Month In Expiry Month Field$")
	public void user_Selcet_The_Expiry_Month_In_Expiry_Month_Field() throws Throwable {
	String month = File_Reader_Manager.getInstanceFRM().getInstanceCR().getMonth();
	dropdown(pom.getInstanceHbp().getMonth(), "byValue", month);
	}
	
	@When("^user Select The Expiry Year In Expiry Year Field$")
	public void user_Select_The_Expiry_Year_In_Expiry_Year_Field() throws Throwable {
	String year = File_Reader_Manager.getInstanceFRM().getInstanceCR().getYear();
	dropdown(pom.getInstanceHbp().getYear(), "byValue", year);
	}

	@When("^user Enter The CVV Number In CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();
		input(pom.getInstanceHbp().getCvv(), cvv);
	}

	@Then("^user Click On The Book Now Button And It Navigates Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_Booking_Confirmation_Page() throws Throwable {
	click(pom.getInstanceHbp().getBookbtn());
	
	}

	@Then("^user Click On The My Itinerary Button And It Navigates To Booked Itinerary Page$")
	public void user_Click_On_The_My_Itinerary_Button_And_It_Navigates_To_Booked_Itinerary_Page() throws Throwable {
	Impliwait(10);
	click(pom.getInstanceBcp().getOrderdetails());
	}

	@Then("^user Click On The Logout Button And It Navigates To Login Page$")
	public void user_Click_On_The_Logout_Button_And_It_Navigates_To_Login_Page() throws Throwable {
	click(pom.getInstanceBip().getLogout());
	}

	
	
}
