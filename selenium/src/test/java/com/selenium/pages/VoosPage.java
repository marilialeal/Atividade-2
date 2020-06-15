package com.selenium.pages;

import org.openqa.selenium.WebDriver;

import com.selenium.uimaps.InicioMap;
import com.selenium.uimaps.VoosMap;

public class VoosPage {
WebDriver driver;
	
	public VoosPage(WebDriver driver) {
		this.driver= driver;
	}
	
	VoosMap voosMap = new VoosMap(driver);
	
	public void comprarPassagem() {
		voosMap.escolherVoo.click(driver);
}
}

