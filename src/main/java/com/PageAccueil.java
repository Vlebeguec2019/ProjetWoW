package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil {
	
	private String search = "Lardeur";
	
	@FindBy(xpath="//a[contains(@class,'banner_continue--2NyXA')]")
	private WebElement cookie;
	
	@FindBy(xpath="//input[contains(@name,'q')]")
	private WebElement research_field;
	
	@FindBy(xpath="//a[contains(@class,'header-search-button')]")
	private WebElement btn_search;

	public PageFirstResult access(WebDriver driver, String p) throws InterruptedException {
		cookie.click();
		Thread.sleep(4000);
		research_field.clear();
		research_field.sendKeys(search);
		btn_search.click();

		return PageFactory.initElements(driver, PageFirstResult.class);
		
	}
}
