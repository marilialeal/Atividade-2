package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;
import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class FormularioMap {

	WebDriver driver;
	
	public FormularioMap(WebDriver driver) {
		this.driver= driver;
	}

	public Element inputName = new Element (driver, ByValue.ID,"inputName");
	public Element inputAddress = new Element (driver, ByValue.ID,"address");
	public Element inputCity = new Element (driver, ByValue.ID,"city");
	public Element inputState = new Element (driver, ByValue.ID,"state");
	public Element inputZipCode = new Element (driver, ByValue.ID,"zipCode");
	public Element inputCardType = new Element (driver, ByValue.XPATH,"//option[text()='Visa']");
	public Element inputCreditCardNumber  = new Element (driver, ByValue.ID,"creditCardNumber");
	public Element inputMonth = new Element (driver, ByValue.ID,"creditCardMonth");
	public Element inputYear  = new Element (driver, ByValue.ID,"creditCardYear");
	public Element inputNameOnCard = new Element (driver, ByValue.ID,"nameOnCard");
	public Element inputRemember = new Element (driver, ByValue.XPATH,"//input[@id='rememberMe']");
	public Element inputFinalizar = new Element (driver, ByValue.XPATH,"//input[@value='Purchase Flight']");
	
	//validar mensagem final
	public Element msgFinal = new Element (driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']");
}

