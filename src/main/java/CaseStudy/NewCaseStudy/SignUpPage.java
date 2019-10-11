package CaseStudy.NewCaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SignUpPage {
	 WebDriver driver;
	    Select sel;
		@Given("^Launch Browser$")
		public void launch_Browser() throws Throwable {
			driver=CaseStudyUtility.openBrowser("Chrome");
			//driver=TestUtilityClass.openBrowser("Ie");
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			
		}

		@When("^Enter the username \"([^\"]*)\"$")
		public void enter_the_username(String arg1) throws Throwable {
		    driver.findElement(By.linkText("SignUp")).click();
		    Assert.assertEquals("Sign Up", driver.getTitle());
			driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(arg1);
		}

		@When("^Enter the firstname \"([^\"]*)\"$")
		public void enter_the_firstname(String arg1) throws Throwable {
		   driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(arg1);
		}

		@When("^Enter the lastname \"([^\"]*)\"$")
		public void enter_the_lastname(String arg1) throws Throwable {
			 driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(arg1);
		}

		@When("^Enter password \"([^\"]*)\"$")
		public void enter_password(String arg1) throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(arg1);
			}

		@When("^Enter Confirm Password \"([^\"]*)\"$")
		public void enter_Confirm_Password(String arg1) throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(arg1);
		}

		@When("^user selects Gender$")
		public void user_selects_Gender() throws Throwable {
		   driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
		}
		@When("^Enter Email \"([^\"]*)\"$")
		public void enter_Email(String arg1) throws Throwable {
		   driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(arg1);
		}
		
		

		@When("^Enter mobile number \"([^\"]*)\"$")
		public void enter_mobile_number(String arg1) throws Throwable {
		   driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(arg1);
		}

		@When("^Enter DOB \"([^\"]*)\"$")
		public void enter_DOB(String arg1) throws Throwable {
		    driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(arg1);
		}

		@When("^Enter address \"([^\"]*)\"$")
		public void enter_address(String arg1) throws Throwable {
		    driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(arg1);
		}

		@When("^select seciurity question$")
		public void select_seciurity_question() throws Throwable {
			sel= new Select(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")));
		      sel.selectByIndex(2);
		    
		}
		@When("^Enter ANSWER \"([^\"]*)\"$")
		public void enter_ANSWER(String arg1) throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(arg1);
		}

		@When("^submit$")
		public void submit() throws Throwable {
		    driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		}	

		@Then("^Test if user registerd successfully$")
		public void test_if_user_registerd_successfully() throws Throwable {
			Assert.assertEquals("Login", driver.getTitle());
			driver.close();
		}


}
