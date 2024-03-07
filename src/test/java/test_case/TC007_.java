package test_case;

import java.io.IOException;

import org.testng.annotations.Test;

import pom.Formfilling;
import test_base.BaseClass;

public class TC007_ extends BaseClass {
	@Test(priority=1)
	public void FormFilling3() throws IOException {
		Formfilling ff=new Formfilling(driver);
	ff.phone();
	ff.institutiontype();
	ff.company();
	}
	@Test(priority=2)
	public void FormFilling4() throws IOException {
		Formfilling ff=new Formfilling(driver);
	ff.student();
	ff.title();
	ff.department();
	ff.website();
	
	}
	@Test(priority=3)
	public void FormFilling5() throws IOException {
		Formfilling ff=new Formfilling(driver);
	ff.country();
	ff.state();
	ff.scrollsubmit();
	
	
	}
	@Test(priority=4)

	public void submit() throws IOException, InterruptedException{
		Formfilling ff=new Formfilling(driver);
		logger.info("----------------ScreenShot of Error Message--------------------");
		ff.submit();
	}
		@Test(priority=5)

		public void screenshot() throws IOException, InterruptedException{
			Formfilling ff=new Formfilling(driver);
		ff.scrollup();
		ff.error();
	}
}
