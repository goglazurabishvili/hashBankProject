import io.qameta.allure.Feature;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseClass;


@Feature("bonus Task scroll")
public class BonusTest extends BaseClass {


    @Test
    public void bonusTask() throws InterruptedException {
        navigationSteps.clickOnSwipeField();
        Thread.sleep(1000);
        Dimension dimension = driver.manage().window().getSize();
        int startX = dimension.width / 2;
        int startY = dimension.height / 2;
        int endY = startY - 1900;
        scrollDownBy50px(startX, startY, endY);
        Assert.assertTrue(navigationSteps.youFoundMe());

    }
}
