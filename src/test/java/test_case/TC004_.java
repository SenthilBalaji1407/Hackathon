package test_case;

import java.io.IOException;

import org.testng.annotations.Test;

import pom.Languagelearning;
import test_base.BaseClass;

public class TC004_ extends BaseClass{

	@Test(priority=1)
	public void learning() throws InterruptedException, IOException {
		Languagelearning ll=new Languagelearning(driver);
		logger.info("----------------Search Language Learning--------------------");
	ll.clicksearch();
	ll.scrolllan();
	}
	@Test(priority=2)
	public void clicklanguage() throws InterruptedException, IOException {
		logger.info("----------------print Language--------------------");

		Languagelearning ll=new Languagelearning(driver);
		ll.clickshow();
		ll.language();
	}
	@Test(priority=3)
	public void clicklevel() throws InterruptedException, IOException {
		logger.info("----------------Click and print Levels--------------------");

	Languagelearning ll=new Languagelearning(driver);
	ll.close();
	ll.printlevel();
	}
}
