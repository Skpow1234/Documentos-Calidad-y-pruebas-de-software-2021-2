package runner;

/*1. Donde ira a buscar los escenarios de prefab
  2. Donde estaran las implementaciones de cada uno de los pasos de nuestros escenarios*/
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/features/test.feature",
        glue = ("seleniumgluecode")
)

public class Testrunner {


}
