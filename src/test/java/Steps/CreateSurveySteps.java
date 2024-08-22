package Steps;

import Pages.SurveyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Base;


public class CreateSurveySteps extends Base {
    SurveyPage surveyPage= new SurveyPage();
    @Given("user click on survey from dashboard")
    public void user_click_on_survey_from_dashboard() {
        surveyPage.ChooseSurveyPage();
    }


    @When("user click on create button")
    public void userClickOnCreateButton() {
        surveyPage.ClickOnCreateSurvey();
    }

    @And("choose survey from list bix")
    public void chooseSurveyFromListBix() {
        surveyPage.ChooseCreateSurvey();
    }

    @And("fill {string} and click create")
    public void fillAndClickCreate(String title) {
        surveyPage.FillData(title);
    }

    @Then("make sure that the survey is already added")
    public void makeSureThatTheSurveyIsAlreadyAdded() {
        surveyPage.SurveyAlreadyAdded();
    }


}
