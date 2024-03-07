package test_case;

import java.io.IOException;

import org.testng.annotations.Test;

import pom.Webdevelopment;
import test_base.BaseClass;

public class TC003_  extends BaseClass{

	@Test(priority=1)
	public void course1() throws IOException {
		logger.info("----------------Click Course 1--------------------");

		Webdevelopment wd=new Webdevelopment(driver);
		wd.clickCourse1();
	}

	@Test(priority=2)
		public void clickcourse1() throws IOException {
		logger.info("----------------Click and print Course 1--------------------");

		Webdevelopment wd=new Webdevelopment(driver);
		wd.getCourse1();
	}
	
	@Test(priority=3)
	public void course2() throws IOException {
		logger.info("----------------Click Course 2--------------------");
		Webdevelopment wd=new Webdevelopment(driver);
		wd.clickCourse2();	
	}
	@Test(priority=4)
	public void clickcourse2() throws IOException {
		logger.info("----------------Click and print Coursae 2--------------------");

	Webdevelopment wd=new Webdevelopment(driver);
		wd.getCourse2();
	}

}
