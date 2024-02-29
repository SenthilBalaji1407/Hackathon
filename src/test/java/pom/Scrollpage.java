package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scrollpage extends BasePage {

	public Scrollpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	@FindBy(xpath="//a[text()='All AI Courses']")
	WebElement ScrollCourse;
	
	@FindBy(xpath="//a[text()='For Enterprise']")
	WebElement ClickEnterprise;
	
	@FindBy(xpath="//span[text()='Watch now']")
	WebElement ScrollWatch;
	
	@FindBy(xpath="//a[text()='What We Offer']")
	WebElement ClickOffer;
	
	@FindBy(xpath="//h4[text()='* Credit eligibility determined by your institution.']")
	WebElement ScrollCourse1;
	
	@FindBy(xpath="(//div[contains(@class,'MuiGrid-root')]//span[text()='Learn more'])[2]")
	WebElement ClickCourse;
	
//	@FindBy(xpath="")
	
	public void scrollcourse() {
		js.executeScript(("arguments[0].scrollIntoView();"),ScrollCourse);
	}
	
	public void clickenterprises() {
		js.executeScript("arguments[0].click();",ClickEnterprise );
	}
	
	public void scrollwatch() {
		js.executeScript("arguments[0].scrollIntoView();", ScrollWatch);
	}
	
	public void clickoffer() {
		js.executeScript("arguments[0].click();",ClickOffer);
	}
	
	public void scrollcourse1() {
		js.executeScript("arguments[0].scrollIntoView();", ScrollCourse1);
	}
	
	public void clickcourse() {
		js.executeScript("arguments[0].click();", ClickCourse);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
