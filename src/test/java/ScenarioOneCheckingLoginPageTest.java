import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClass;

import static data.Constants.*;

@Feature("Login Page Authorization")
public class ScenarioOneCheckingLoginPageTest extends BaseClass {

    @Test(priority = 1)
    public void loginWithValidInfo(){
        navigationSteps.clickOnLoginField();
        logSteps.clickOnSingUpForm()
                .fillEmail(VALID_EMAIL)
                .fillPassword(VALID_PASSWORD)
                .fillConfirmPassword(VALID_PASSWORD)
                .clickOnSingUpBtn();
               Assert.assertTrue(logSteps.isSignUpSuccessful(),"Sign-up was not successful. The success message was not displayed.");
        logSteps.closeSucsessPopUp();
    }

    @Test(priority = 2)
    public void loginWithIncorectMail(){
        logSteps.fillEmail(INVALID_EMAIL)
                .fillPassword(VALID_PASSWORD)
                .fillConfirmPassword(VALID_PASSWORD)
                .clickOnSingUpBtn();
            Assert.assertTrue(logSteps.invalidEmailAddressPopUp());
    }

    @Test(priority = 3)
    public void LoginWithIncorectShortPass(){
        logSteps.fillEmail(VALID_EMAIL)
                .fillPassword(SHORT_PASSWORD)
                .fillConfirmPassword(SHORT_PASSWORD)
                .clickOnSingUpBtn();
        Assert.assertTrue(logSteps.invalidShortPass());
    }

    @Test(priority = 4)
    public void LoginWithoutPass(){
        logSteps.fillEmail(VALID_EMAIL)
                .fillPassword(EMPTY_FIELD)
                .fillConfirmPassword(EMPTY_FIELD)
                .clickOnSingUpBtn();
        Assert.assertTrue(logSteps.invalidShortPass());
    }

    @Test(priority = 5)
    public void LoginWithoutMail(){
        logSteps.fillEmail(EMPTY_FIELD)
                .fillPassword(VALID_EMAIL)
                .fillConfirmPassword(VALID_EMAIL)
                .clickOnSingUpBtn();
        Assert.assertTrue(logSteps.invalidEmailAddressPopUp());
    }

    @Test(priority = 6)
    public void LoginWithoutAnyInfo(){
        logSteps.fillEmail(EMPTY_FIELD)
                .fillPassword(EMPTY_FIELD)
                .fillConfirmPassword(EMPTY_FIELD)
                .clickOnSingUpBtn();
        Assert.assertTrue(logSteps.invalidEmailAddressPopUp());
        Assert.assertTrue(logSteps.invalidShortPass());
    }

}
