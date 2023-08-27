package com.testing.ilCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// 1 уровень сложности
// Минимум 3 теста по ссылке с логином.
// В каждом найти элемент и ассерти
// ссылка

public class Base {
    WebDriver driver = new FirefoxDriver();

    String URL = " https://ilcarro-1578153671498.web.app/login";
    String INCORRECT_EMAIL = "test.com";

    @BeforeMethod
    public void setUp() {
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void clickOnElementByCss(String selector) {
        driver.findElement(By.cssSelector(selector)).click();
    }

    public void fillInputByXpath(String element, String value) {
        clickOnElementByCss(element);
        driver.findElement(By.cssSelector(element)).clear();
        driver.findElement(By.cssSelector(element)).sendKeys(value);
    }

    public boolean isElementExist(By locator) {
        return driver.findElements(locator).size() > 0;
    }

}

