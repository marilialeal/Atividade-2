package com.selenium.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium.core.Driver;
import com.selenium.pages.FormularioPage;
import com.selenium.pages.InicioPage;
import com.selenium.pages.VoosPage;

public class CT02 {
	WebDriver driver;
	InicioPage inicioPage;
	VoosPage voosPage;
	FormularioPage formularioPage;
	
	//Acessar o site: https://blazedemo.com/
	//Em select “Choose your departure city:” selecionar “San Diego”.
	//Em select “Choose your destination city:” selecionar “New York”.
	//Clicar em “Find Flights”.
	//Escolher a primeira viagem, ou seja clicar no primeiro botão “Choose This Flight”
	//Preencher todos os campos do formulário
	//Enviar (Purchase Flight) o formulário
	//Validar mensagem de sucesso
	
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		voosPage= new VoosPage(driver);
		formularioPage= new FormularioPage(driver);
	}
	
	@Test
	public void test() {
		inicioPage.selecionarVoo();
		voosPage.comprarPassagem();
		formularioPage.preencherFormulario();
		formularioPage.validaMensagem();
	
	}
	@After
	public void after() {
		Driver.close(driver);
		}
}
