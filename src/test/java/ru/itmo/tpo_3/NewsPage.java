package ru.itmo.tpo_3;

import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$x;

public class NewsPage {
    public SelenideElement labelNews = $x("/html/body/div[4]/div[2]/main/section[1]/div/div[2]/div/div[2]/h3/a");
    public SelenideElement bodyNews = $x("/html/body/div[4]/div[2]/main/article/div/div[1]/div[5]/div[1]/p[2]");
    public SelenideElement authorNews = $x("/html/body/div[4]/div[2]/main/article/div/div[1]/div[5]/section/div/div[1]/div/div[1]/div[2]/a");
    public SelenideElement checkTags = $x("/html/body/div[4]/div[2]/main/div[2]/article/div[2]/h3/a");
    public ArrayList<SelenideElement> arrayList;

    public ArrayList<SelenideElement> getArrayList() {
        arrayList = new ArrayList<>();
        String firstPartPathTag = "/html/body/div[4]/div[2]/main/article/div/div[1]/div[5]/div[4]/ul/li[";
        String secondPartPathTag = "]/a";
        SelenideElement tag = $x(firstPartPathTag + "1" + secondPartPathTag);
        for (int i = 2; tag.exists(); i++) {
            arrayList.add(tag);
            tag = $x(firstPartPathTag + i + secondPartPathTag);
        }
        return arrayList;
    }

}
