package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class Stepdefinition {
	WebDriver driver;
	@Given("user launches google chrome")
	public void user_launches_google_chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\subhashini\\Desktop\\CucumberProject1\\chrome file\\ChromeDriver.exe");
	    driver=new ChromeDriver();
	}

	@And("user opens facebook application")
	public void user_opens_facebook_application() {
	  driver.get("https://www.facebook.com");
	    }

	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
		driver.findElement(By.id("email")).sendKeys("helloworld");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
    Assert.assertTrue(driver.getTitle().contains("Home"));	    

	}
}