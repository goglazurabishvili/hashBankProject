package pages;

import org.openqa.selenium.By;

public class LoginSingUpPage {

    public static By singupform = By.xpath("//android.widget.TextView[@text='Sign up']");
    public static By emailfield = By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]");
    public static By inputpasswordfield = By.xpath("//android.widget.EditText[@content-desc='input-password']");
    public static By confirmpasswordfield = By.xpath("//android.widget.EditText[@content-desc='input-repeat-password']");
    public static By singupbuttonfield = By.xpath("//android.view.ViewGroup[@content-desc='button-SIGN UP']");
    public static By popUpMesageOfSacsesSingUp = By.xpath("//android.widget.TextView[@resource-id='android:id/message']");
    public static By closePopUp = By.id("android:id/button1");
    public static By invalidshortpass = By.xpath("//android.widget.TextView[@text=\"Please enter at least 8 characters\"]");
    public static By invalidemailadresspopup = By.xpath("//android.widget.TextView[@text=\"Please enter a valid email address\"]");
}

