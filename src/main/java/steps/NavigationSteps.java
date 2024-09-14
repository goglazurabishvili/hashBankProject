package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.NavigationPage;

import java.util.NoSuchElementException;

import static utils.SetUpClass.findElement;

public class NavigationSteps extends NavigationPage {

    @Step("Click on the login field")
    public NavigationSteps clickOnLoginField() {
        findElement(login).click();
        return this;
    }

    @Step("Click on the form field")
    public NavigationSteps clickOnFormField() {
        findElement(forms).click();
        return this;
    }

    @Step("Click on the swipe field")
    public NavigationSteps clickOnSwipeField() {
        findElement(swipe).click();
        return this;
    }

    @Step("Check if 'You found me' element is displayed")
    public boolean youFoundMe() {
        try {
            return findElement(youfoundme).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
