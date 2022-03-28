package ru.itmo.tpo_3;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

// https://beincrypto.com
public class MainPage {
    public SelenideElement hamburger = $x("//header/div/div/button");
    public SelenideElement currentLang = $x("//div[3]/div[2]");

    public SelenideElement ruButton = $x("//a[contains(text(),'Русский')]");
    public SelenideElement enButton = $x("//a[contains(text(),'English')]");

    public SelenideElement newsTag = $x("//li/a");

    /*
     * Check View news headlines
     */
    public SelenideElement learnTag = $x("//nav/div/ul/li/a");
    public SelenideElement tradingTag = $x("/html/body/div[4]/div[2]/main/section[1]/div/div/div[2]/div/div[1]/a/div[2]");

    public SelenideElement latestNewsTag = $x("/html/body/header/div/nav/div/ul/li[2]/a");
    public SelenideElement checkLatestNewTag = $x("/html/body/div[4]/div[2]/main/div[1]/h1/span");

    public SelenideElement opinionTag = $x("/html/body/header/div/nav/div/ul/li[3]/a");
    public SelenideElement checkOpinionTag = $x("/html/body/div[4]/div[2]/main/div[1]/h1/span");

    public SelenideElement bitcoinTag = $x("/html/body/header/div/nav/div/ul/li[4]/a");
    public SelenideElement checkBitcoinTag = $x("/html/body/div[4]/div[2]/main/div[1]/h1/span");

    public SelenideElement altcoinTag = $x("/html/body/header/div/nav/div/ul/li[5]/a");
    public SelenideElement checkAltcoinTag = $x("/html/body/div[4]/div[2]/main/div[1]/h1/span");

    public SelenideElement pricesTag = $x("/html/body/header/div/nav/div/ul/li[6]/a");
    public SelenideElement checkPricesTag = $x("/html/body/div[4]/div[2]/main/div/div[2]/div[1]/h1");

    public SelenideElement exchangesTag = $x("/html/body/header/div/nav/div/ul/li[7]/a");
    public SelenideElement checkExchangesTag = $x("/html/body/div[4]/div[2]/main/div[1]/div/div/div/div/div/div/div/div/div/div/div/span/div/div[2]/div[1]/h1");

    public SelenideElement pressReleasesTag = $x("/html/body/header/div/nav/div/ul/li[8]/a");
    public SelenideElement checkPressReleasesTag = $x("/html/body/div[4]/div[2]/main/div[1]/h1/span");

    /*
     * Check View full article
     */
    public SelenideElement tagNewsMainPage = $x("/html/body/div[4]/div[2]/main/section[1]/div/div[2]/div/div[2]/h3/a");

    public SelenideElement checkFirstName = $x("/html/body/div[2]/div/div[3]/div[1]/div[2]/a");

    public SelenideElement checkLogOut = $x("/html/body/div[2]/div/div[3]/a");

    public SelenideElement mainIcon = $x("/html/body/header/div/div[1]/a[1]");



}
