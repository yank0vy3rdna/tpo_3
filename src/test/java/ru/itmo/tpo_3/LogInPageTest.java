package ru.itmo.tpo_3;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LogInPageTest {
    LogInPage logInPage = new LogInPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://beincrypto.com");
    }

    @Test
    public void signInSuccess() {
        logInPage.profileButton.click();
        logInPage.emailInput.setValue(LogInPage.EMAIL);
        logInPage.passwordInput.setValue(LogInPage.PASSWORD);
        logInPage.signInButton.click();
        Assertions.assertEquals("Edit Account", logInPage.editAccount.text());
    }

    @Test
    public void signInError() {
        logInPage.profileButton.click();
        logInPage.emailInput.setValue(LogInPage.EMAIL);
        logInPage.passwordInput.setValue(LogInPage.ERROR_PASSWORD);
        logInPage.signInButton.click();
        Selenide.sleep(3000);
        Assertions.assertEquals("Error: The password you entered for the email address " + LogInPage.EMAIL + " is incorrect. Lost your password?", logInPage.errorText.text());
    }


}
