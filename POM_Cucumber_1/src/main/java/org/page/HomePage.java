package org.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class HomePage extends BaseClass{

	
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.id("label")).click();
		return new MyHomePage();
	}
	@Then("verify HomePage")
	public HomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.id("label")).isDisplayed();
		System.out.println(displayed);
		Assert.assertTrue(displayed);
		return this;
	}
}
