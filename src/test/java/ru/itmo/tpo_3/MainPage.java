package ru.itmo.tpo_3;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// https://beincrypto.com
public class MainPage {
    public SelenideElement hamburger = $x("//header/div/div/button");
    public SelenideElement currentLang = $x("//div[3]/div[2]");

    public SelenideElement ruButton = $x("//a[contains(text(),'Русский')]");
    public SelenideElement enButton = $x("//a[contains(text(),'English')]");

    public SelenideElement newsTag = $x("//li/a");

    public SelenideElement learnTag = $x("//nav/div/ul/li/a");
}
