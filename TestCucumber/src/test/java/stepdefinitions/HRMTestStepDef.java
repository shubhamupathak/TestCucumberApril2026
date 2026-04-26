package stepdefinitions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class HRMTestStepDef
{

	WebDriver driver = new ChromeDriver();
	@Given("^User is on HRM login page$")
	public void User_is_on_HRM_login_page()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\MyFiles\\Cucumber\\Driver\\chromedriver-win64\\chromedriver.exe");
			Thread.sleep(3000);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			System.out.println("Window maximize successfully.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@When("^User enters username$")
	public void User_enters_username()
	{
		try
		{
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@And("^User enters password$")
	public void User_enters_password()
	{
		try
		{
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("^Check username is present in username textbox$")
	public void Check_username_is_present_in_username_textbox()
	{
		try
		{
			String UserNameActual = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
			System.out.println("Actual user name is : " +UserNameActual);
			Assert.assertEquals("Admin", UserNameActual);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("^Check password is present in password textbox$")
	public void Check_password_is_present_in_password_textbox()
	{
		try
		{
			String PasswordActual = driver.findElement(By.xpath("//input[@name='password']")).getAttribute("value");
			System.out.println("Actual password is : " +PasswordActual);
			Assert.assertEquals("admin123", PasswordActual);
			//driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
