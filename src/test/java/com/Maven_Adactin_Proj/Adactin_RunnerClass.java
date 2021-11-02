package com.Maven_Adactin_Proj;

import org.openqa.selenium.WebDriver;
import com.Adactin_Sdp.Adactin_Page_Obj_Manager;
import com.helper.File_Reader_Manager;

public class Adactin_RunnerClass extends Adactin_BaseClass{
	public static WebDriver driver = Adactin_BaseClass.get_Driver("chrome");
	public static Adactin_Page_Obj_Manager pom = new Adactin_Page_Obj_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		input(pom.getInstanceLp().getUsername(), username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		input(pom.getInstanceLp().getPassword(), password);
		
		click(pom.getInstanceLp().getLoginbtn());
		
		Impliwait(10);
				
		dropdown(pom.getInstanceShp().getLocation(), "byValue", "Paris");
		
		dropdown(pom.getInstanceShp().getHotel(), "byValue", "Hotel Cornice");
		
		dropdown(pom.getInstanceShp().getRoomtype(), "byValue", "Super Deluxe");
	
		dropdown(pom.getInstanceShp().getRoomno(), "byValue", "2");
		
		clear(pom.getInstanceShp().getCheckInDate());
		input(pom.getInstanceShp().getCheckInDate(), "21/11/2021");
		
		clear(pom.getInstanceShp().getCheckOutDate());
		input(pom.getInstanceShp().getCheckOutDate(), "23/11/2021");
		
		dropdown(pom.getInstanceShp().getAdultsperroom(), "byValue", "3");
		
		dropdown(pom.getInstanceShp().getChildrenroom(), "byValue", "1");
		
		click(pom.getInstanceShp().getSubmit());
		
		click(pom.getInstanceSh().getRadiobtn());
		
		click(pom.getInstanceSh().getContinuebtn());
		
		input(pom.getInstanceHbp().getFirstname(), "Gibril");
		
		input(pom.getInstanceHbp().getLastname(), "Fariz");
		
		input(pom.getInstanceHbp().getAddress(), "No.215,9th main Road, newyark");
		
		String cardnumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardnumber();
		input(pom.getInstanceHbp().getCardnumber(), cardnumber);
		
		String cardtype = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardtype();
		dropdown(pom.getInstanceHbp().getCardtype(), "byValue", cardtype);
		Impliwait(10);
		String month = File_Reader_Manager.getInstanceFRM().getInstanceCR().getMonth();
		dropdown(pom.getInstanceHbp().getMonth(), "byValue", month);
		
		String year = File_Reader_Manager.getInstanceFRM().getInstanceCR().getYear();
		dropdown(pom.getInstanceHbp().getYear(), "byValue", year);
		sleep(2000);
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();
		input(pom.getInstanceHbp().getCvv(), cvv);
		
		click(pom.getInstanceHbp().getBookbtn());
		
		Impliwait(10);
			
		scroll(pom.getInstanceBcp().getOrdersnap());
		Impliwait(10);
		screenshot("snap1");
		Impliwait(10);
		click(pom.getInstanceBcp().getOrderdetails());
		
		click(pom.getInstanceBip().getLogout());
	}
}
