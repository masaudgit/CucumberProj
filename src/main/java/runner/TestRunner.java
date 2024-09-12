package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\sel\\workspace\\CucumberProj\\src\\main\\java\\features",
		glue={"stepDefinitions"},
		//Now, I want to generate Report in Cucumber as well.
		plugin= {"pretty", "json:target/myReports/report.json",
							"junit:target/myReports/report.xml"
		}
		
		)

//Plugin is attribute, pretty is default font type, file type id json, and xml.
//I want to generate a Report inside the target folder inside the CucumberProj project, then inside the target
//folder, I want to create one more folder called "myReports", but this is optional.
//junit is the keyword used for XML file and same json is the keyword used for json file and file extensions as well.
//Only,json and xml file types are used in the market. XML is more popular because it is user friendly.
//Now,Refresh CucumberProj project by R.click on it and click Refresh in order to load new folder "myReports"
//and all files inside the new folder in the target folder.


public class TestRunner extends AbstractTestNGCucumberTests {

}
