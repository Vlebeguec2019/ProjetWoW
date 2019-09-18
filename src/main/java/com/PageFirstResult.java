package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFirstResult {
	
	@FindBy(xpath="//div[contains(@id,'search-results')]/descendant::a[contains(@href,'#npcs')]")
	private WebElement PNJ;
	
	@FindBy(xpath="//td[contains(@class,'icon-boss-padded')]")
	private WebElement Lardeur;
	
	@Test

	public PageLardeur access(WebDriver driver, String p) {
		
		PNJ.click();
		Lardeur.click();
		
		return PageFactory.initElements(driver, PageLardeur.class);
		
	}

}
