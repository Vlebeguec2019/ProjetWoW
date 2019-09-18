package com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
	
	public void TestSeleniumJUnit (WebDriver driver) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\Documents\\SquashTA-1.10.0-RELEASE-workspace\\Projet_WoW\\target\\classes\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		//Accès au site
		driver.get("https://fr.wowhead.com/");
		Thread.sleep(5000);
		
		//Fermeture de la page web
//		public void quit() {
//			driver.quit();
//		}

}
	public PageAccueil access(WebDriver driver, String p) {
		
		return PageFactory.initElements(driver, PageAccueil.class);
		
	}
}