package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.uimaps.InicioMap;

public class InicioPage {
	WebDriver driver;
	
	public InicioPage(WebDriver driver) {
		this.driver= driver;
	}
	
	InicioMap inicioMap = new InicioMap(driver);
	
	public void selecionarVoo() {
		inicioMap.lugarSaida.click(driver);
		inicioMap.lugarDestino.click(driver);
		inicioMap.btnProcurar.click(driver);
}
	public void validaTabela() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
					
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//h3[text()='Flights from San Diego to New York: ']")));
			System.out.println("Sucesso!");
		} catch (Exception e) {
			System.out.println("Falha!");
		}
	}
}