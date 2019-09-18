package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLardeur {
	
	@FindBy(xpath="//*[text()[contains(.,'Chahuteurs de cadavre')]]")
	private WebElement objet1;
	
	@FindBy(xpath="//*[text()[contains(.,'Chausses de Lardeur')]]")
	private WebElement objet2;
	
	@FindBy(xpath="//*[text()[contains(.,'Pioche en fer froid')]]")
	private WebElement objet3;
	
	@FindBy(xpath="//*[text()[contains(.,'Grèves de geôlier volées')]]")
	private WebElement objet4;
	
	@FindBy(xpath="//*[text()[contains(.,'Espauliers de Tourne-Clé')]]")
	private WebElement objet5;
	
	@Test

	public PageObjetRecup access(WebDriver driver, String p) {

		objet1.click();
		objet2.click();
		objet3.click();
		objet4.click();
		objet5.click();
		
		return PageFactory.initElements(driver, PageObjetRecup.class);
		
	}
}
