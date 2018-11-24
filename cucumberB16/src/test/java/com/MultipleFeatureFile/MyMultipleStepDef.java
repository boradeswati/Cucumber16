package com.MultipleFeatureFile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyMultipleStepDef {
	
	WebDriver driver; 

	@Given("^Open Facebook page$")
	public  void OpenFacebookpage(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\yshub\\Desktop\\Swati\\64\\New folder\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^I enter login page$")
	public void i_enter_login_page() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("swati@gmail.com");
		//Actions myAction=new Actions(driver);
		
		//Actions obj=myAction.moveToElement(emailTxtBox).click().keyDown(Keys.SHIFT).sendKeys("selenium");
		//obj.build().perform();
	    
	    throw new PendingException();
	}

	@Then("^I verify textbox value$")
	public void i_verify_textbox_value() throws Throwable {
	   
	    throw new PendingException();
	}

}
