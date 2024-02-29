package RunnerClass;
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		   features={".//Feature/1Homepage.feature",".//Feature/2LanguageLearning.feature",".//Feature/3Fillform.feature"},
		   glue="stepDefinition",
		   //feature={"@target/rerun.txt"},
		   plugin= {"pretty","html:reports/myreport.html", 
					  "rerun:target/rerun.txt",
					  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		   )
public class runnerclass {
}
