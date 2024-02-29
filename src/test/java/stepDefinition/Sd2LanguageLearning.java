package stepDefinition;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pom.Languagelearning;

public class Sd2LanguageLearning {
	Languagelearning ll;
	@Given("user navigate to Language Learning")
	public void user_navigate_to_language_learning() {
		ll=new Languagelearning(BaseClass.getDriver());
		}
@When("user Search Language Learning")
public void user_search_language_learning() throws IOException {
  ll.clicksearch();
  ll.scrolllan();
	
}

@When("user select language and display all the languages")
public void user_select_language_and_display_all_the_languages() throws IOException {
   ll.clickshow();
   ll.language();
   ll.close();
}

@When("user select level and display all the levels")
public void user_select_level_and_display_all_the_levels() throws IOException {
ll.printlevel();
}




}
