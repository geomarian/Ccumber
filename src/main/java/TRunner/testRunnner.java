package TRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"E:/GEO/Selenium Sample/cucum/Features/statement.feature"},
		//features={"E:/GEO/Selenium Sample/cucum/src/test/java/statement.feature"},
		glue="CucumberPro.cucum",
		
		format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		
		//dryRun=true,
				monochrome=true,
				strict=false,
			//	tags={"@SanityTest,@RegressionTest"}  //OR only execute only sanity test
		//tags={"@AddUser,@EditUser,@DeleteUser,@FileUpload"} //AND only '(difference)
		tags={"@EditUser"}
	//	tags={"~@End2End","~@SanityTest"}  //This will ignore seletec scenario
		)
public class testRunnner {

}
