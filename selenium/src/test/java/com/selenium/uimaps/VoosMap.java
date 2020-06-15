package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class VoosMap {
WebDriver driver;
	
	public VoosMap(WebDriver driver) {
		this.driver= driver;
	}

	public Element escolherVoo= new Element(driver, ByValue.XPATH,"//h3[text()='Flights from San Diego to New York: '] //following :: input[1]");
	
}


