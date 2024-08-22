package Pages;

import org.example.Base;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SurveyPage extends Base {
    LoginPage loginPage=new LoginPage();
    By survey= By.xpath("//a[@id='btnSurvey']");
    By create =By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]");
    By create_survey =By.xpath("//a[@id='btnCreateNormalSurvey']");
    By survey_title =By.xpath("//input[@id='txtSurveyTitle']");
    By confirmation =By.xpath("//button[@id='btnCreateSurvey']");
    By created_survey=By.xpath("//body/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/h4[1]/a[1]");
    public void ChooseSurveyPage()
    {
        loginPage.LoginPageFun();
        loginPage.FillData("Mostafa.org1@itworxedu.com","Windows.2000");
        loginPage.ToHome();
        driver.findElement(survey).click();
    }

    public void ClickOnCreateSurvey()
    {
        driver.findElement(create).click();
    }

    public void ChooseCreateSurvey()
    {
        driver.findElement(create_survey).click();
    }

    public void FillData(String title)
    {
        driver.findElement(survey_title).sendKeys(title);
        driver.findElement(confirmation).click();
    }

    public void SurveyAlreadyAdded()
    {

        Assert.assertTrue( driver.findElement(created_survey).isDisplayed());
//        boolean navigate=driver.findElement(created_survey).isDisplayed();
//        System.out.println(navigate);

    }
}
