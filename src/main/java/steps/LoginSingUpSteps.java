package steps;

import io.qameta.allure.Step;
import pages.LoginSingUpPage;

import java.util.NoSuchElementException;

import static utils.SetUpClass.findElement;

public class LoginSingUpSteps extends LoginSingUpPage {

    @Step("Click on the sign-up form")
    public LoginSingUpSteps clickOnSingUpForm() {
        findElement(singupform).click();
        return this;
    }

    @Step("Fill in the email address '{email}'")
    public LoginSingUpSteps fillEmail(String email) {
        findElement(emailfield).sendKeys(email);
        return this;
    }

    @Step("Fill in the password")
    public LoginSingUpSteps fillPassword(String pass) {
        findElement(inputpasswordfield).sendKeys(pass);
        return this;
    }

    @Step("Fill in the confirm password")
    public LoginSingUpSteps fillConfirmPassword(String repass) {
        findElement(confirmpasswordfield).sendKeys(repass);
        return this;
    }

    @Step("Click on the sign-up button")
    public LoginSingUpSteps clickOnSingUpBtn() {
        findElement(singupbuttonfield).click();
        return this;
    }

    @Step("Close the success pop-up")
    public LoginSingUpSteps closeSucsessPopUp() {
        findElement(closePopUp).click();
        return this;
    }

    @Step("Check if short password error message is displayed")
    public boolean invalidShortPass() {
        try {
            return findElement(invalidshortpass).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @Step("Check if invalid email address pop-up is displayed")
    public boolean invalidEmailAddressPopUp() {
        try {
            return findElement(invalidemailadresspopup).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @Step("Check if sign-up was successful")
    public boolean isSignUpSuccessful() {
        try {
            return findElement(popUpMesageOfSacsesSingUp).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
