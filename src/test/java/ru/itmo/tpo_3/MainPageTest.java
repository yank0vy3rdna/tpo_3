package ru.itmo.tpo_3;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {
    MainPage mainPage = new MainPage();

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
    public void changeLanguage() {
        mainPage.hamburger.click();
        mainPage.currentLang.click();
        mainPage.ruButton.click();
        Assertions.assertEquals("Новости", mainPage.newsTag.text());
        mainPage.hamburger.click();
        mainPage.currentLang.click();
        mainPage.enButton.click();
        Assertions.assertEquals("Learn", mainPage.learnTag.text());

    }
}
