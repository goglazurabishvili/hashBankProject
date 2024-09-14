package data;

public class Constants {
    // Those information must be hidden in resources folder - config.properties
    // config.properties - ignored by gitignore and I should read values from there locally
    // In CI pipeline - it should be provided in CI variables - for now I am leaving as it is.
    public static final String VALID_EMAIL = "testuser@example.com";
    public static final String INVALID_EMAIL = "testuser@.com";
    public static final String SHORT_PASSWORD = "123";
    public static final String VALID_PASSWORD = "password123";
    public static final String EMPTY_FIELD = "";
    public static final String FORM_NAME = "testname";
    public static final String WEB_DRIVER = "webdriver.io is awesome";
}
