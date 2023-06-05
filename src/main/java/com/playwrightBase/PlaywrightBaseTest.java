package com.playwrightBase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class PlaywrightBaseTest {
    public static Playwright playwright;
    public static Browser browser;
    public static Page page;


    @BeforeSuite
    public void initialize(String switchbrowser) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        page.navigate("http://adactinhotelapp.com/");
    }

    @AfterSuite
    public void killSession() {
        browser.close();
    }
}
