package test_case;

import java.io.IOException;

import org.testng.annotations.Test;

import pom.Formfilling;
import test_base.BaseClass;

public class TC006_ extends BaseClass {

	@Test(priority=1)
	public void FormFilling1() throws IOException, InterruptedException {
		Formfilling ff=new Formfilling(driver);
		logger.info("----------------Fill the Form--------------------");

//		ff.scrollform();
		ff.firstname();
	}
		@Test(priority=2)
		public void FormFilling2() throws IOException, InterruptedException {
			
			Formfilling ff=new Formfilling(driver);
		ff.scrolldown();
		ff.lastname();
		ff.email();
		
	}

}
