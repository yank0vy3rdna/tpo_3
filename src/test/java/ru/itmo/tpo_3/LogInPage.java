package ru.itmo.tpo_3;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LogInPage {

    public static final String EMAIL = "fjdfjkfsdjfs@mail.ru";
    public static final String PASSWORD = "gjS32juUNEjrV29";
    public static final String ERROR_PASSWORD = "gjS32ju";

    public SelenideElement profileButton =$x("/html/body/header/div/div[1]/div/div[1]/div");
    public SelenideElement emailInput =$x("/html/body/header/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div[1]/form/div[1]/input");
    public SelenideElement passwordInput =$x("/html/body/header/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div[1]/form/div[2]/input");
    public SelenideElement signInButton =$x("/html/body/header/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div[1]/form/div[5]/button");
    public SelenideElement editAccount =$x("/html/body/main/article/div/div/div/div/div[2]/div/h1");

    public SelenideElement errorText =$x("/html/body/header/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div[1]/form/div[4]/div"); //Error: The username ghdgfghgjfdcg is not registered on this site. If you are unsure of your username, try your email address instead.
}
