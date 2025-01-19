package org.metachain.data;

import org.openqa.selenium.By;

public class DataAndLocators {
    // bases
    public static final String BROWSER_TYPE = "chrome";
    public static final String WEBSITE_URL = "https://appleslice.vercel.app";

    // login
    public static final By GET_STARTED_BUTTON = By.xpath("//*[@id=\"screen\"]/div[4]/button");
    public static final By EMAIL_INPUT = By.xpath("//*[@id=\"screen\"]/main/div[1]/input");
    public static final By PASSWORD_INPUT = By.xpath("//*[@id=\"screen\"]/main/div[2]/input");
    public static final By REMEMBER_ME_CHECKBOX = By.xpath("//*[@id=\"screen\"]/main/div[3]/button");
    public static final By SIGN_IN_BUTTON = By.xpath("//*[@id=\"screen\"]/main/div[4]/button");
    public static final By SUCCESS_TOAST = By.cssSelector(".styleToast");

    // sign uo
    public static final By SIGN_UP_TEST_BUTTON = By.cssSelector("#screen > main > div:nth-child(6) > p:nth-child(2)");
    public static final By FIRST_NAME_LOCATOR = By.xpath("//*[@id=\"screen\"]/main/div[1]/input");
    public static final By LAST_NAME_LOCATOR = By.xpath("//*[@id=\"screen\"]/main/div[2]/input");
    public static final By REGISTER_EMAIL_LOCATOR = By.xpath("//*[@id=\"screen\"]/main/div[3]/input");
    public static final By PHONE_NUMBER_LOCATOR = By.name("phone");
    public static final By NEW_PASSWORD_LOCATOR = By.xpath("//*[@id=\"screen\"]/main/div[5]/input");
    public static final By CONFIRM_NEW_PASSWORD_LOCATOR = By.xpath("//*[@id=\"screen\"]/main/div[6]/input");
    public static final By SIGN_UP_LOCATOR = By.xpath("//*[@id=\"screen\"]/main/div[7]/button");
    public static final By VERIFY_OTP_LOCATOR = By.xpath("//*[@id=\"screen\"]/main/div[3]/button");

    // user menu & logout locators
    public static final By USER_MENU_BUTTON = By.xpath("//*[@id=\"app\"]/div[2]/header/div[3]/div/p");
    public static final By LOGOUT_BUTTON = By.xpath("//*[@id=\"screen\"]/main/div[3]/button");
    public static final By WELCOME_MESSAGE = By.xpath("//*[@id=\"screen\"]/main/h1");

    // Test data
    public static final String USER_EMAIL = "khaled.mofed2@gmail.com";
    public static final String PASSWORD = "qweQWE";
    public static final String LOGIN_SUCCESS_MESSAGE = "success";
    public static final String WELCOME_BACK_MESSAGE = "Welcome Back!";
    public static final String SIGNIN_PAGE_URL = "https://appleslice.vercel.app/SignIn";

    public static final String FIRST_NAME = "sayed";
    public static final String LAST_NAME = "sayed";
    public static final String REGISTER_EMAIL = "sayed1@gmail.com";
    public static final String NEW_PASSWORD = "123456789";
    public static final String USER_NUMBER = "01111111118";
    public static final String OTP_CODE = "123456";
    public static final String SIGN_UP_SUCCESS_MESSAGE = "User registered successfully";
}