package com.selenium.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.core.Driver;
import com.selenium.pages.FormularioPage;
import com.selenium.pages.InicioPage;

public class CT01 {
	WebDriver driver;
	InicioPage inicioPage;
	
	
	//Criar o caso de teste 1:
	//Acessar o site: https://blazedemo.com/
	//No select “Choose your departure city:” selecionar “San Diego”.
	//No select “Choose your destination city:” selecionar “New York”.
	//Clicar em “Find Flights”.
	//Validar se no cabeçalho da tabela tem as informações: "Departs: San Diego" e "Arrives: New York"
	
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		
	}
	
	@Test
	public void test() {
		inicioPage.selecionarVoo();
		inicioPage.validaTabela();
	
	}
	@After
	public void after() {
		Driver.close(driver);
		}
}
