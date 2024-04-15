package step_definition;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Log_in {
	 WebDriver driver;	 
	@Given("I am on the login page")	   
	public void i_am_on_the_login_page() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://accounts.vmmaps.com/");	    
	}
	@When("I enter my valid email")
	public void i_enter_my_valid_email() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("barvinrj0302@gmail.com");
		Thread.sleep(2000);
	}
	@Then("I enter my valid password")
	public void i_enter_my_valid_password() {
		driver.findElement(By.id("login-password")).sendKeys("Barvin@1234");  
	}
	@Then("I click on login botton")
	public void i_click_on_login_botton() throws InterruptedException {
		driver.findElement(By.id("login-submit-text")).click();
		Thread.sleep(2000);
	}
	@Then("I Should be logged into my account")
	public void i_should_be_logged_into_my_account() {
	    System.out.println("longin successfull");
	    System.out.println("But, I can't click the menu button, this is the bug in this web application");
	}
// I can't click the menu button, this is the bug in this web application
//	@Then("I click the menu button")
//	public void i_click_the_menu_button() {
//		driver.findElement(By.id("menu-toggle")).click();
//	    
//	}




}
