package ru.itmo.tpo_3;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.back;
import static com.codeborne.selenide.Selenide.open;

public class NewsPageTest {
    MainPage mainPage = new MainPage();
    NewsPage newsPage = new NewsPage();

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
    public void checkBodyNews() {
        mainPage.tagNewsMainPage.click();
        Assertions.assertNotNull(newsPage.bodyNews.text());
    }

    @Test
    public void checkAuthorNews() {
        mainPage.tagNewsMainPage.click();
        Assertions.assertNotNull(newsPage.authorNews.text());
    }

    @Test
    public void checkTags() {
        newsPage.labelNews.click();
        ArrayList<SelenideElement> arrayTag = newsPage.getArrayList();
        for (int i = 0; i < arrayTag.size(); i++) {
            arrayTag.get(i).click();
            System.out.println("CHECK TAG " + (i + 1) + " ...");
            Assertions.assertNotNull(newsPage.checkTags.text());
            System.out.println("CHECK TAG " + (i + 1) + " SUCCESS");
            back();
        }
    }
}
