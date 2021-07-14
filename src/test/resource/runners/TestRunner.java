package cucumberoptions;
import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= {"classpath:/PurchaseCart/src/test/java/cucumberoptions/PlaceOrder.feature,/PurchaseCart/src/test/java/cucumberoptions/UpdateInfo.feature "},
glue= {"cucumberoptions"},
monochrome=true,
plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
// tags = {"@regression"}, //to execute only regression
// tags = {"~@regression"} // to execute test cases other than regression
//tags = {"@regression,@smoke"} //or condition 
// tags =   {"@functional","@smoke"} // and condition

// dryRun = true,
// snippets = SnippetType.CAMELCASE
)

public class TestRunner extends AbstractTestNGCucumberTests  {

	}

