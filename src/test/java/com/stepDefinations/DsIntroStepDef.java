package com.stepDefinations;

import java.util.List;

import org.testng.Assert;

import com.pageObjects.Ds_IntroPage;
import com.pageObjects.LoginPage;
import com.pageObjects.StartPage;
import com.utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DsIntroStepDef extends BaseClass {
	@Given("user open browser and launch the url{string}")
	public void user_open_browser_and_launch_the_url(String url) {
		sp = new StartPage(Helper.getDriver());
		loginPage = new LoginPage(Helper.getDriver());
		ds_IntroPage= new Ds_IntroPage(Helper.getDriver());
		Helper.openPage(url);   
		
	    	}
	@When("user click  {string} button")
	public void user_click_button(String getStartedText) throws Exception {
		sp.clickGetStartedBtn();
	}
	@When("click on signin link")
	public void click_on_link ()throws Exception {
	   loginPage.signInClick();
	}
	@When("user enters  {string} {string}")
	public void user_enters(String username, String password) throws InterruptedException {
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
	    
	}
	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
	    loginPage.clickLogInBtn();
	}
	
	@Given("The user is on home page as title {string}")
	public void the_user_is_on_home_page_as_title(String title) {
		  Assert.assertEquals(title, Helper.getDriver().getTitle());
			//ds_IntroPage =new DS_IntroPage(Helper.getDriver());
	   
	}
	@When("user click on Get started button in Data Structure")
	public void user_click_on_get_started_button_in_data_structure() throws InterruptedException {
		ds_IntroPage.clickGetStartedDs();
	    
	}
	@Then("user will successfully navigate to corresponding page with title {string}")
	public void user_will_successfully_navigate_to_corresponding_page_with_title(String title) {
		 Assert.assertEquals(title, Helper.getDriver().getTitle());
	   
	}
	@When("user click on Time Complexity")
	public void user_click_on_time_complexity() throws InterruptedException {
		ds_IntroPage.clickTimeComplexityLink();
	    
	}
	@Then("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String title) {
		 Assert.assertEquals(title, Helper.getDriver().getTitle());
	}
	@When("user click on Try here")
	public void user_click_on_try_here() throws InterruptedException {
		ds_IntroPage.clickTryHereLink();
		
	   
	}
	@When("user enter the python code")
	public void user_enter_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		ds_IntroPage=new Ds_IntroPage(Helper.getDriver());
		 List<List<String>>data=pythonCode.cells();
		   ds_IntroPage.enterCode(data.get(0).get(0));
	   
	}
	
	  
	
	
	
	@When("click on run button")
	public void click_on_run_button() throws InterruptedException {
		ds_IntroPage.clickRunBtn();
	   
	}
	
	@Then("user is navigated to home page {string}")
	public void user_is_navigated_to_home_page(String url) {
	   Helper.getDriver().get(url);
	}

}
