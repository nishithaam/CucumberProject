package com.Parabank.Parabankk;

import org.openqa.selenium.support.PageFactory;


public class RegisterPageActions {
	registerpagelocators registerpagelocators;
	String strFirstName, strLastName,strAddress,strCity,strState,strZipCode,strSsn,strPhoneNumber,strUserName,strPassword,strRepeatedPassword,strbutton;   //read it from external file and store it here

	public RegisterPageActions() {  
		this.registerpagelocators = new registerpagelocators();
		
		PageFactory.initElements(HelperClass.getDriver(), registerpagelocators);
	}
	
	
	public void setFirst(String strFirstName) {
		registerpagelocators.firstName.sendKeys(strFirstName);
	}
	public void setLastName(String strLastName) {
		registerpagelocators.lastName.sendKeys(strLastName);
	}
	public void setAddress(String strAddress) {
		registerpagelocators.address.sendKeys(strAddress);
	}
	public void setCity(String strCity) {
		registerpagelocators.city.sendKeys(strCity);
	}
	public void setState(String strState) {
		registerpagelocators.state.sendKeys(strState);
	}
	public void setZipCode(String strZipCode) {
		registerpagelocators.zipcode.sendKeys(strZipCode);
	}
	public void setPhoneNumber(String strPhoneNumber) {
		registerpagelocators.phoneNumber.sendKeys(strPhoneNumber);
	}
	public void setSsn(String strSsn) {
		registerpagelocators.ssn.sendKeys(strSsn);
	}
	public void setUserName(String strUserName) {
		registerpagelocators.userName.sendKeys(strUserName);
	}
	public void setPassword(String strPassword) {
		registerpagelocators.password.sendKeys(strPassword);
	}
	public void setRepeatedPassword(String strRepeatedPassword) {
		registerpagelocators.repeatedpassword.sendKeys(strRepeatedPassword);
	}
	public void getButton() {
		registerpagelocators.Button.click();
	}
	public void name(String strFirstName, String strLastName) {
		setFirst(strFirstName);
		setLastName(strLastName);
	}
	public void city(String strAddress, String strCity) {
		setAddress(strAddress);
		setCity(strCity);
	}
	public void state(String strState, String strZipCode) {
		setState(strState);
		setZipCode(strZipCode);
	}
	public void number(String strPhoneNumber2, String strSsn2) {
		setPhoneNumber(strPhoneNumber);
		setSsn(strSsn);
	}
	public void user(String strUsername, String strPassword, String strRepeatedPassword) {
		setUserName(strUsername);
		setPassword(strPassword);
		setRepeatedPassword(strRepeatedPassword);
	}

	

		
	
	
}
 
	

 
