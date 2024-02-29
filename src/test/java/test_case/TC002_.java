package test_case;

import org.testng.annotations.Test;

import pom.Webdevelopment;
import test_base.BaseClass;

public class TC002_  extends BaseClass{
	@Test(priority=1,groups= {"smoke"})
	public void clickEnglish() {
		logger.info("----------------Click the Language English--------------------");
	Webdevelopment wd=new Webdevelopment(driver);
	wd.scroll();
	wd.clickEnglish();
	}
	
	@Test(priority=2,groups= {"smoke","Regression"})
	public void clickLevel() {
		logger.info("----------------Click the Level--------------------");

	Webdevelopment wd=new Webdevelopment(driver);
	wd.scroll1();
	wd.clickLevel();
	}
	
	
	
}
