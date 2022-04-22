package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(
//features = "Features",
     //   glue = {"stepDefinitions"},
//     tags = "@SimpleAlert",
                //     plugin = {"pretty"},
//     monochrome = true
//  )

//@RunWith(Cucumber.class)
//@CucumberOptions(
//features = "Features",
//   glue = {"stepDefinitions"},
//     tags = "@SimpleAlert",
//     plugin = {"html: test-reports"},
//     monochrome = true
//  )

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"stepDefinitions"},
        tags = "@activity1",
        plugin = {"json: test-report/json-report.json"},
        monochrome = true
)

public class Activities6Runner {
    //empty
}

