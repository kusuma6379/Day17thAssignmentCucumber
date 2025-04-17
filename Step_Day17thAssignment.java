package Stepdefinition_Day17Assignmet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Day17thAssignment {
	
	WebDriver driver; 
	
	@Given("User enter the URL")
	public void user_enter_the_url() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://v1.training-support.net/selenium/simple-form?");
		driver.manage().window().maximize();
		Thread.sleep(5000);	
	}

	@And("User Validate the URL")
	public void user_validate_the_url() throws InterruptedException {
		driver.get("https://v1.training-support.net/selenium/simple-form?");
		Thread.sleep(5000);
	    
		
	}
	@When("User Enter the FirstName")
	public void user_enter_the_first_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Madavali");	
		Thread.sleep(5000);
	}
	@When("User Enter the LastName")
	public void user_enter_the_last_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Kusuma");
	    Thread.sleep(5000);
		
	}
	@When("User Enter the Email")
	public void user_enter_the_email() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("kusumababu6379@gmail.com");
	    Thread.sleep(5000);
		
	}
	@When("User Enter the Contact Number")
	public void user_enter_the_contact_number() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"number\"]")).sendKeys("7989292662");
	    Thread.sleep(5000);
		
	}
	@And("USer Enter the Message")
	public void u_ser_enter_the_message() throws InterruptedException {
		driver.findElement(By.xpath("//textarea[@rows=\"2\"]")).sendKeys("Hello masai good morning to everyone ");
	    Thread.sleep(5000);
		
	}
	@Then("User Submit the form Successfully")
	public void user_submit_the_form_successfully() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class=\"ui green button\"]")).click();
		System.out.println("Successfully submit the form");
		Thread.sleep(5000);
	    driver.quit();
		
	}	
}