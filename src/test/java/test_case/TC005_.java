package test_case;

import org.testng.annotations.Test;

import pom.Scrollpage;
import test_base.BaseClass;

public class TC005_  extends BaseClass{

	@Test(priority=1,groups= {"smoke"})
	public void clickEnterprise() {
		logger.info("----------------Scroll the page to Enterprises--------------------");
		Scrollpage sp=new Scrollpage(driver);
	sp.scrollcourse();
	sp.clickenterprises();
	
	}
	@Test(priority=2,groups= {"smoke"})
	public void clickOffer() {
		logger.info("----------------Scroll the page to Offer--------------------");

		Scrollpage sp=new Scrollpage(driver);
	sp.scrollwatch();
	sp.clickoffer();
	}
	@Test(priority=3,groups= {"smoke"})
	public void course() {
		logger.info("----------------Scroll the page to Course--------------------");

		Scrollpage sp=new Scrollpage(driver);
	sp.scrollcourse1();
	sp.clickcourse();
	
	}
}
