package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class InicioMap {
	WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver= driver;
	}

	public Element lugarSaida= new Element(driver, ByValue.XPATH,"//option[@value='San Diego']");
	public Element lugarDestino= new Element(driver, ByValue.XPATH,"//option[@value='New York']");
	public Element btnProcurar= new Element(driver, ByValue.XPATH,"//input[@value='Find Flights']");
	
	

}
