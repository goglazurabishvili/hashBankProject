package pages;

import org.openqa.selenium.By;

public class NavigationPage {
    public static By home = By.xpath("//android.widget.TextView[@text='Home']");
    public static By forms = By.xpath("//android.view.View[@content-desc='Forms']");
    public static By login = By.xpath("//android.widget.TextView[@text='Login']");
    public static By webview = By.xpath("//android.widget.TextView[@text='Webview']");
    public static By swipe = By.xpath("//android.widget.TextView[@text='Swipe']");
    public static By drag = By.xpath("//android.widget.TextView[@text='Drag']");
    public static By youfoundme = By.xpath("//android.widget.TextView[@text=\"You found me!!!\"]");

}
