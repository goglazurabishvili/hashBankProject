package steps;

import io.qameta.allure.Step;
import pages.FormComponentsPage;

import java.util.NoSuchElementException;

import static utils.SetUpClass.findElement;
import static utils.SetUpClass.findElements;


public class FormComponentSteps extends FormComponentsPage {

    @Step("Fill the input field with value '{input}'")
    public FormComponentSteps fillInputField(String input){
        findElement(inputfield).sendKeys(input);
        return this;
    }

    @Step("Click on the dropdown menu")
    public FormComponentSteps clickOnDropDown(){
        findElement(appdropdown).click();
        return this;
    }

    @Step("Get the text from the input field")
    public String getInputedText(){
        return findElement(whatIinputfield).getText();
    }

    @Step("Select item at index '{i}' from the dropdown list")
    public FormComponentSteps chooseSelectItem(int i){
        findElements(selectitem).get(i).click();
        return this;
    }

    @Step("Get the text from the field after performing the action")
    public FormComponentSteps getTextFromInputedFilds(){
        findElement(getswitchtext).getText();
        return this;
    }

    @Step("Check if the button is activated")
    public boolean buttonIsActivated() {
        try {
            return findElement(buttonisactivated).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @Step("Click on the active button")
    public FormComponentSteps clickOnActiveButton(){
        findElement(buttonsactive).click();
        return this;
    }

    @Step("Get the text of the selected item from the dropdown")
    public String getDropDownedText(){
        return findElement(getdropdownedselectedtext).getText();
    }


}



