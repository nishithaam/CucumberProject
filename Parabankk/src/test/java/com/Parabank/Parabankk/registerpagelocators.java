package com.Parabank.Parabankk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerpagelocators {  
	
	

	@FindBy(xpath="//a[@href='register.htm']")
	WebElement clickRegister;
	
	@FindBy(id = "customer.firstName")
	WebElement firstName;
	
	@FindBy(id="customer.lastName")
	WebElement lastName;
	
	@FindBy(id="customer.address.street")
	WebElement address;
	
	@FindBy(id="customer.address.city")
	WebElement city;
	
	@FindBy(id="customer.address.state")
	WebElement state;
	
	@FindBy(id="customer.address.zipCode")
	WebElement zipcode;
	
	@FindBy(id="customer.phoneNumber")
	WebElement phoneNumber;
	
	@FindBy(id="customer.ssn")
	WebElement ssn;
	
	@FindBy(id="customer.username")
	WebElement userName;
	
	@FindBy(id="customer.password")
	WebElement password;
	
	@FindBy(id="repeatedPassword")
	WebElement repeatedpassword;
	
	@FindBy(xpath ="(//input[@class='button'])[2]")
	WebElement Button;
	
	
	

}
