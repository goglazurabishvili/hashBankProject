package pages;

import org.openqa.selenium.By;

public class FormComponentsPage {
    public static By inputfield = By.id("RNE__Input__text-input");
    public static By getswitchtext = By.xpath("//android.widget.TextView[@content-desc=\"switch-text\"]");
    public static By whatIinputfield = By.xpath("//android.widget.TextView[@content-desc='input-text-result']");
    public static By switchonoff = By.xpath("//android.widget.Switch[@content-desc='switch']");
    public static By appdropdown = By.id("text_input");
    public static By buttonsactive = By.xpath("//android.widget.TextView[@text='Active']");
    public static By buttoninactive = By.xpath("//android.widget.TextView[@text='Inactive']");
    public static By getdropdownedselectedtext = By.xpath("//android.widget.EditText[@resource-id=\"text_input\"]");
    public static By selectitem = By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1']");
    public static By buttonisactivated = By.xpath("//android.widget.TextView[@resource-id=\"android:id/message\"]");

}
