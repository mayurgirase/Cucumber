package stepsDefination;

import static org.testng.AssertJUnit.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginstepsDefintion {
	WebDriver dr;
	@Given("^I open a browser$")
	public void i_open_a_browser() throws Throwable {
	    dr=new FirefoxDriver();
	      
	}

	@When("^I open  a site$")
	public void i_open_a_site() throws Throwable {
	    dr.get("http://projects.javabykiran.com/Accountmanager");
	}

	@Then("^FMS tags open$")
	public void fms_tags_open() {
		 String title=dr.getTitle();
		   System.out.println(title);
		   Assert.assertEquals("FrontAccounting 2.4.2 - Login",title);
		
	
	}
	@Then("^enter \"(.*)\" and \"(.*)\"$")
	public void enter_and(String username, String password) {
		dr.findElement(By.name("user_name_entry_field")).sendKeys(username);
	    dr.findElement(By.name("password")).sendKeys(password);
	    dr.findElement(By.name("SubmitUser")).click();
	    //dr.close();
	}
	
	/*@Then("^close browser$")
	public void close_browser()  {
		 dr.close();
	}*/



}
