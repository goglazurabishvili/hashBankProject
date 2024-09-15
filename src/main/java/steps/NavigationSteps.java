package steps;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import pages.NavigationPage;

import java.time.Duration;
import java.util.List;

import static utils.SetUpClass.driver;
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
        }
        catch (TimeoutException e){
            return false ;
        }
    }


//    public NavigationSteps scrollToElement(int startX, int startY, int endX, int endY, int actionDuration) {
//        // Add logs for debugging
//        System.out.println("Starting scroll: Start (" + startX + ", " + startY + "), End (" + endX + ", " + endY + ")");
//
//        // Create touch input
//        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence scrollSequence = new Sequence(input, 1);
//
//        // Move to the starting position
//        scrollSequence.addAction(input.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
//
//        // Press down on the screen
//        scrollSequence.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//
//        // Pause before performing the next action (if necessary, increase duration)
//        scrollSequence.addAction(new Pause(input, Duration.ofMillis(200)));
//
//        // Move to the end position (perform the scroll)
//        scrollSequence.addAction(input.createPointerMove(Duration.ofMillis(actionDuration), PointerInput.Origin.viewport(), endX, endY));
//
//        // Release the touch
//        scrollSequence.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//
//        // Perform the action
//        driver.perform(List.of(scrollSequence));
//        return this;
//    }
//
//    public NavigationSteps scrollDown(int actionDuration) {
//        Dimension screenSize = driver.manage().window().getSize();
//        int startX = screenSize.getWidth() / 2;
//        int startY = (int) (screenSize.getHeight() * 0.75);  // Start closer to the bottom
//        int endX = startX;
//        int endY = (int) (screenSize.getHeight() * 0.25);  // Scroll upwards
//
//        System.out.println("Scrolling from (" + startX + ", " + startY + ") to (" + endX + ", " + endY + ")");
//        scrollToElement(startX, startY, endX, endY, actionDuration);
//        return this;
//    }

}
