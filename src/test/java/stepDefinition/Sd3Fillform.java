package stepDefinition;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Formfilling;
import pom.Scrollpage;

public class Sd3Fillform {
 Scrollpage sp;
 Formfilling ff;
@Given("user navigate to Enterprises")
public void user_navigate_to_enterprises() {
   sp=new Scrollpage(BaseClass.getDriver());
   ff=new Formfilling(BaseClass.getDriver());
}
@When("user scroll and select the Enterprises")
public void user_scroll_and_select_the_enterprises() {
    sp.scrollcourse();
    sp.clickenterprises();
}

@Then("user scroll and select  offer")
public void user_scroll_and_select_offer() {
	sp.scrollwatch();
	sp.clickoffer();
}

@Then("user scroll and select the courses")
public void user_scroll_and_select_the_courses() {

    sp.scrollcourse1();
    sp.clickcourse();
}


@Then("user scroll and fill the form")
public void user_scroll_and_fill_the_form() throws IOException, InterruptedException {
//  ff.scrollform();
  ff.firstname();
  ff.scrolldown();
  ff.lastname();
  ff.email();
  ff.phone();
  ff.institutiontype();
  ff.company();
  ff.student();
  ff.title();
  ff.department();
  ff.website();
  ff.country();
  ff.state();
  
}
@Then("user scroll and capture Error msg")
public void user_scroll_and_capture_error_msg() throws IOException, InterruptedException {
   ff.scrollsubmit();
//  ff.scrollup();
//  ff.error();

}
}
