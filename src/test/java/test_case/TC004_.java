package test_case;

import java.io.IOException;

import org.testng.annotations.Test;

import pom.Languagelearning;
import test_base.BaseClass;

public class TC004_ extends BaseClass{

	@Test(priority=1,groups= {"smoke","Regression"})
	public void learning() throws InterruptedException, IOException {
		Languagelearning ll=new Languagelearning(driver);
		logger.info("----------------Search Language Learning--------------------");
	ll.clicksearch();
	ll.scrolllan();
	}
	@Test(priority=2,groups= {"smoke","Regression"})
	public void clicklanguage() throws InterruptedException, IOException {
		Languagelearning ll=new Languagelearning(driver);
		ll.clickshow();
		ll.language();
	}
	@Test(priority=3,groups= {"smoke","Regression"})
	public void clicklevel() throws InterruptedException, IOException {
	Languagelearning ll=new Languagelearning(driver);
	ll.close();
	ll.printlevel();
	}
}
