package com.testing.ilCarro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends Base {
    @Test
    public void isCorrectPageTest() {
        WebElement h1 = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("Log in", h1.getText());
    }

    @Test
    public void isCorrectAmountsInputTest() {
        List <WebElement> inputs = driver.findElements(By.tagName("input"));
        Assert.assertEquals(inputs.size(), 2);
    }

    @Test
    public void isValidationEmailTest() {
        fillInputByXpath("#email", INCORRECT_EMAIL);
        isElementExist(By.xpath("/html/body/app-root/app-navigator/app-login-registration/div/div/div/app-login/form/div[1]/div/div"));
    }
}
