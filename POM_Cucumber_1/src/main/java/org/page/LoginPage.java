package org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPage extends BaseClass{
	


	@Given("Enter UserName")
	public LoginPage enterUserName() {
		//userName
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("DemoSalesManager");


		return this;
	}
	
	@Given("Enter Password")
	public LoginPage enterPassword() {
		//password
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("crmsfa");


		return this;
	}

	@Then("click Login")
	public HomePage clickLogin() {
		//Login button
		WebElement btnLogin = driver.findElement(By.className("decorativeSubmit"));
		btnLogin.click();

		return new HomePage();
	}
}
