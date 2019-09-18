package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	
private String search = "Lardeur";
	
	@FindBy(xpath="//a[contains(@class,'banner_continue--2NyXA')]")
	private WebElement cookie;
	
	@FindBy(xpath="//input[contains(@name,'q')]")
	private WebElement research_field;
	
	@FindBy(xpath="//a[contains(@class,'header-search-button')]")
	private WebElement btn_search;
	
	@FindBy(xpath="//div[contains(@id,'search-results')]/descendant::a[contains(@href,'#npcs')]")
	private WebElement PNJ;
	
	@FindBy(xpath="//td[contains(@class,'icon-boss-padded')]")
	private WebElement Lardeur;
	
	@FindBy(xpath="//*[text()[contains(.,'Chahuteurs de cadavre')]]")
	private WebElement objet1;
	
	@FindBy(xpath="//*[text()[contains(.,'Chausses de Lardeur')]]")
	private WebElement objet2;
	
//	@FindBy(xpath="//*[text()[contains(.,'Pioche en fer froid')]]")
//	private WebElement objet3;
	
	@FindBy(xpath="//*[text()[contains(.,'Grèves de geôlier volées')]]")
	private WebElement objet4;
	
	@FindBy(xpath="//*[text()[contains(.,'Espauliers de Tourne-Clé')]]")
	private WebElement objet5;
	
	public void PageAccueil (WebDriver driver)throws InterruptedException {
		
		cookie.click();
		Thread.sleep(4000);
		research_field.clear();
		research_field.sendKeys(search);
		btn_search.click();
		
	}
	
	public void PageFirstResult (WebDriver driver)throws InterruptedException {
		Thread.sleep(500);
		PNJ.click();
		Lardeur.click();
	}
	
	public void PageLardeur (WebDriver driver)throws InterruptedException {
		Thread.sleep(500);
		objet1.click();
		
		Thread.sleep(500);
		objet2.click();
		
//		Thread.sleep(500);
//		objet3.click();
		
		Thread.sleep(500);
		objet4.click();
		
		Thread.sleep(500);
		objet5.click();
	}
	
	public void PageObjetRecup (WebDriver driver)throws InterruptedException {
		
//		List<WebElement> stat = driver.findElements(By.xpath("//div[contains(@id,'tt2168')]"));
		
//		assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'Niveau d'objet 25')]".isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'Tissu')]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'Armure : 3')]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'+5 Intelligence')]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'+8 Endurance')]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'Augmente votre score de hâte de +4.')]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'+3 Versatilité')]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'16')]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'34')]")).isDisplayed());
	}
}

