package com;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageObjetRecup {
	
	List<WebElement> stat = driver.findElements(By.xpath("//a[@class='my_img']"));
	
/*	//Objet1
	assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'Niveau d'objet 25')]".isDisplayed());
	assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'Tissu')]")).isDisplayed());
	assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'Armure : 3')]")).isDisplayed());
	assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'+5 Intelligence')]")).isDisplayed());
	assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'+8 Endurance')]")).isDisplayed());
	assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'Augmente votre score de hâte de +4.')]")).isDisplayed());
	assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'+3 Versatilité')]")).isDisplayed());
	assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'16')]")).isDisplayed());
	assertTrue(driver.findElement(By.xpath("//div[contains(@id,'tt2168')]/descendant::span[contains(.,'34')]")).isDisplayed());

}
*/
