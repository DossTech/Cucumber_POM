package testcases;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\main\\java\\features\\Login.feature",
glue="org.page",
monochrome=false,
publish=true)
public class Runner extends BaseClass{

}
