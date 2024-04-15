package step_definition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	WebDriver driver;
	@Given("I am on the registration page")
	public void i_am_on_the_registration_page() throws InterruptedException {
		driver = new ChromeDriver(); 
		driver.get("https://accounts.vmmaps.com/");
		Thread.sleep(2000);
	    
	}
	@When("I click the sign up button")
	public void i_click_the_sign_up_button() {
	    driver.findElement(By.xpath("//div[@class='Rectangle-8919']")).click();
	}
	@When("I enter the full name")
	public void i_enter_the_full_name() {
		driver.findElement(By.id("signup-username")).sendKeys("barvinrajan");
	   
	}
	@Then("I enter the email adress")
	public void i_enter_the_email_adress() {
		driver.findElement(By.id("signup-email")).sendKeys("barvinraj@123gmail.com");
	    
	}
	@Then("I enter the Mobile number")
	public void i_enter_the_mobile_number() {
		driver.findElement(By.id("signup-mobile")).sendKeys("8012875080");
	    
	}
	@Then("I enter the password")
	public void i_enter_the_password() {
		driver.findElement(By.id("signup-password")).sendKeys("12345678");
	    	}
	@Then("I enter the Confrim password")
	public void i_enter_the_confrim_password() {
		driver.findElement(By.id("signup-confirmPassword")).sendKeys("12345678");
	   	}
	@Then("I click the Agree button")
	public void i_click_the_agree_button() {
		driver.findElement(By.id("terms-vms-policy")).click();
	   
	}
	@Then("I click the I would sign up button")
	public void i_click_the_i_would_sign_up_button() {
		driver.findElement(By.id("newsLetter")).click();
		   
	    
	}
	@Then("I Click the Register button")
	public void i_click_the_register_button() {
		driver.findElement(By.id("signup-submit-text")).click();
		System.out.println("Register successfull");
		System.out.println("And send OTP to that Email id");
	    
	}




}
