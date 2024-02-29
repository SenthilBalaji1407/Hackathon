package test_case;

import java.io.IOException;

import org.testng.annotations.Test;

import pom.Homepage;
import pom.Webdevelopment;
import test_base.BaseClass;

public class TC001_ extends BaseClass {
	@Test(priority=1,groups= {"smoke","Regression"})
	public void searching() throws IOException {
		logger.info("----------------Searching WebDevelopment--------------------");

		Homepage h=new Homepage(driver);
		h.clicksearch();
	}
		
	}

//}
