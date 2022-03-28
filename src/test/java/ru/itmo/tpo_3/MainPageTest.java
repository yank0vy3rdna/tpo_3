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

    @Test
    public void checkLearnTag() {
        mainPage.learnTag.click();
        Assertions.assertEquals("Trading", mainPage.tradingTag.text());
    }

    @Test
    public void checkLatestNewsTag() {
        mainPage.latestNewsTag.click();
        Assertions.assertEquals("NEWS", mainPage.checkLatestNewTag.text());
    }

    @Test
    public void checkOpinionTag() {
        mainPage.opinionTag.click();
        Assertions.assertEquals("OPINION", mainPage.checkOpinionTag.text());
    }

    @Test
    public void checkBitcoinTag() {
        mainPage.bitcoinTag.click();
        Assertions.assertEquals("BITCOIN NEWS", mainPage.checkBitcoinTag.text());
    }

    @Test
    public void checkAltcoinTag() {
        mainPage.altcoinTag.click();
        Assertions.assertEquals("ALTCOIN NEWS", mainPage.checkAltcoinTag.text());
    }

    @Test
    public void checkPricesTag() {
        mainPage.pricesTag.click();
        Assertions.assertEquals("Top Cryptocurrency Prices", mainPage.checkPricesTag.text());
    }

    @Test
    public void checkExchangesTag() {
        mainPage.exchangesTag.click();
        Assertions.assertEquals("Best Cryptocurrency Exchanges To Trade Bitcoin in 2021", mainPage.checkExchangesTag.text());
    }

    @Test
    public void checkPressReleasesTag() {
        mainPage.pressReleasesTag.click();
        Assertions.assertEquals("PRESS RELEASES", mainPage.checkPressReleasesTag.text());
    }

    @Test
    public void checkChangeName() {
        logInPage.logIn();
        String name = logInPage.firstName.text();
        mainPage.hamburger.click();
        Assertions.assertEquals(name, mainPage.checkFirstName.text());
    }

}
