package step_definition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Verify_Forget_pass {
	WebDriver driver;
	@Given("I am on Login page")
	public void i_am_on_login_page() {
		driver= new ChromeDriver();
		driver.get("https://accounts.vmmaps.com/");
	   
	}
	@When("I enter the email")
	public void i_enter_the_email() {
		driver.findElement(By.id("login-email")).sendKeys("barvinraj@gmail.com");


	}
	@Then("I click  on the forget password")
	public void i_click_on_the_forget_password() {
		driver.findElement(By.id("Forgot-Password")).click();
		
		System.out.println("successfully click the forget pass");
	    
	}



}
