package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


public class TestWoW {
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void TestSeleniumJUnit() throws InterruptedException{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\Documents\\SquashTA-1.10.0-RELEASE-workspace\\Projet_WoW\\target\\classes\\Drivers\\geckodriver.exe");
	
		//Accès au site
		driver.get("https://fr.wowhead.com/");
		Thread.sleep(5000);
	
	MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
	mainPage.PageAccueil(driver);
	mainPage.PageFirstResult(driver);
	mainPage.PageLardeur(driver);
	mainPage.PageObjetRecup(driver);

}
}