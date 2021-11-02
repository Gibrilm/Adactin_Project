package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\USER\\eclipse-workspace\\Maven_Adactin_Proj\\src\\main\\java\\com\\config\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getUsername() throws Throwable {

		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getCardnumber() {
		String cardnumber = p.getProperty("cardnumber");
		return cardnumber;
	}

	public String getCardtype() {
		String cardtype = p.getProperty("cardtype");
		return cardtype;
	}

	public String getCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}

	public String getMonth() {
		String month = p.getProperty("month");
		return month;
	}

	public String getYear() {
		String year = p.getProperty("year");
		return year;
	}
	
}
