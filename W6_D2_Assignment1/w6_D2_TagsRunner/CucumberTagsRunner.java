package w6_D2_TagsRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="src/test/java/week6/day2/Assignments/learnTags.feature",
glue="w6_d2_Assign_TagsSteps",
monochrome=true,
publish=true,
tags="@Sanity or @Smoke"
	)
public class CucumberTagsRunner extends AbstractTestNGCucumberTests {
	

}
