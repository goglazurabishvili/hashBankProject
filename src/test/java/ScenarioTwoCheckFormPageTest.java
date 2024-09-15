import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.FormComponentSteps;
import utils.BaseClass;

import static data.Constants.FORM_NAME;
import static data.Constants.WEB_DRIVER;

@Feature("Forms Page Checking Activate")
public class ScenarioTwoCheckFormPageTest extends BaseClass {

    FormComponentSteps formSteps = new FormComponentSteps();


    @Test
    public void formsTest(){
        navigationSteps.clickOnFormField();
        formSteps.fillInputField(FORM_NAME);
            Assert.assertEquals(formSteps.getInputedText(),FORM_NAME);
        formSteps.clickOnDropDown()
                .chooseSelectItem(1);
            Assert.assertEquals(formSteps.getDropDownedText(),WEB_DRIVER);
        formSteps.clickOnActiveButton();
            Assert.assertTrue(formSteps.buttonIsActivated());
    }

}
