package utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import steps.LoginSingUpSteps;
import steps.NavigationSteps;

public class BaseClass extends SetUpClass {
    protected LoginSingUpSteps logSteps = new LoginSingUpSteps();
    protected NavigationSteps navigationSteps = new NavigationSteps();

    @BeforeTest
    public void goToMainPage() {
        androidDriverSetUp();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
