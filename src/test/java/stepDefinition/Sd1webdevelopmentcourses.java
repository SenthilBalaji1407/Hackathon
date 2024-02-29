package stepDefinition;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Homepage;
import pom.Webdevelopment;

public class Sd1webdevelopmentcourses {
	Homepage hp;
	Webdevelopment wd;
	@Given("user navigate to home page")
	public void user_navigate_to_home_page() {
		hp=new Homepage(BaseClass.getDriver());
		wd=new Webdevelopment(BaseClass.getDriver());
		
	    	}

	@When("user search for the WebDevelopment Courses")
	public void user_search_for_the_web_development_courses() throws IOException {
	   hp.clicksearch();
	}

	@When("user selects the Language and Levels")
	public void user_selects_the_language_and_levels() {
	    wd.scroll();
	    wd.clickEnglish();
	    wd.scroll1();
	    wd.clickLevel();
	}

	@Then("User selects course one and display the result")
	public void user_selects_course_one_and_display_the_result() throws IOException {
	    wd.clickCourse1();
	    wd.getCourse1();
	}

	@Then("User selects course two and display the result")
	public void user_selects_course_two_and_display_the_result() throws IOException {
		wd.clickCourse2();
	    wd.getCourse2();
	}


}
