package com.stepdefiniation;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pom.com.LoginpagePom;

public class Stepdefiniation extends Baseclass{
	public LoginpagePom Pom;

	@Given("User should be in Adactin homepage")
	public void tc01() {
		browserLaunch("http://adactinhotelapp.com/");
	    
	}
	@When("User should enters vaild {string} and {string}")
	public void tc02(String txtuser ,String txtpass) {
		LoginpagePom Pom = new LoginpagePom();
	    Pom.loginmethod(txtuser, txtpass);
		
	}
	@When("User should click the Sucessful login button")
	public void tc03() {
		LoginpagePom Pom = new LoginpagePom();
		Pom.clickbutton();
	}
	
	@When("User should verify the login sucessful message")
	public void tc04() {
	   Assert.assertTrue(true);
	   System.out.println("login message sucessfully verified");
	}
	@When("User should verify searchhotelpage {string},{string},{string},{string},{string},{string},{string},{string}")
	public void tc05(String locat, String hote, String room, String Noofroom, String checkin, String checkout, String Adults, String childern) {
		LoginpagePom Pom = new LoginpagePom();
		Pom.Searchhotel(locat, hote, room, Noofroom, checkin, checkout, Adults, childern);
	}

	@When("User should verified searchbutton sucessful")
	public void tc06() {
		LoginpagePom Pom = new LoginpagePom();
	   Pom.submit();
	}
	@When("User should selecthotel from the button sucessfully")
	public void tc07() {
		LoginpagePom Pom = new LoginpagePom();
		Pom.radio();
	}
	@When("User should click the continuepage")
	public void tc08() {
		LoginpagePom Pom = new LoginpagePom();
		Pom.contbutton();
	}
	@When("User should be in the Book a Hotel with entervaild {string}")
	public void tc09(String firstname) {
		LoginpagePom Pom = new LoginpagePom();
		Pom.firname(firstname);
	}
	@When("User should Enter the Lastname {string}")
	public void tc10(String lastname) {
		LoginpagePom Pom = new LoginpagePom();
		Pom.lasname(lastname);
	}
	@When("User should vaildate the {string},{string}")
	public void tc11(String BA, String ccn) {
		LoginpagePom Pom = new LoginpagePom();
	  Pom.Addresscreno(BA, ccn);
	}
	@When("User should Enter the {string},{string},{string}")
	public void tc12(String ccct, String eey, String eem) {
		LoginpagePom Pom = new LoginpagePom();
		Pom.bookahotel(ccct, eey, eem);
	}
	@When("Userb should in the cvv {string}")
	public void tc13(String ccvv) {
		LoginpagePom Pom = new LoginpagePom();
		Pom.cvv(ccvv);
	}
	@When("User should click the booknow {string}")
	public void tc14(String string) {
		LoginpagePom Pom = new LoginpagePom();
		Pom.bookNow();
	}







}
