package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.uimaps.FormularioMap;

public class FormularioPage {
WebDriver driver;
	
	public FormularioPage(WebDriver driver) {
		this.driver= driver;
	}
	
	FormularioMap formularioMap = new FormularioMap(driver);
	
	public void preencherFormulario() {
		formularioMap.inputName.sendKey(driver, "Nome");
		formularioMap.inputAddress.sendKey(driver, "Address");
		formularioMap.inputCity.sendKey(driver, "City");
		formularioMap.inputState.sendKey(driver, "State");
		formularioMap.inputZipCode.sendKey(driver, "ZipCode");
		formularioMap.inputCardType.click(driver);
		formularioMap.inputCreditCardNumber.sendKey(driver, "CreditCardNumber");
		formularioMap.inputMonth.sendKey(driver, "Month");
		formularioMap.inputYear.sendKey(driver, "Year");
		formularioMap.inputNameOnCard.sendKey(driver, "NameOnCard");
		formularioMap.inputRemember.click(driver);
		formularioMap.inputFinalizar.click(driver);
	}
		
	public void validaMensagem() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
					
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//h1[text()='Thank you for your purchase today!']")));
			System.out.println("Sucesso!");
		} catch (Exception e) {
			System.out.println("Falha!");
		}
	}
}
