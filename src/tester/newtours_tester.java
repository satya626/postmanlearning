package tester;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "cucfle.feature"
		,glue={"newtours01"}
		//,tags={"@first_name_field_valifation"}
		)

public class newtours_tester {
	
}
