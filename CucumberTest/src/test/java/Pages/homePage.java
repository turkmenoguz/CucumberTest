package Pages;

import org.openqa.selenium.By;

public class homePage extends basePage {

    public  String url = "https://www.obilet.com/";
    public By uyegirisBtn = By.xpath("//li[@class='login']");
    public By ucakBtn = By.xpath("(//a[@href='/ucak-bileti'])[1]");



    public  void openUrl(){
        navigateTo(url);
    }

    public void login(){
        clicked(uyegirisBtn);
    }

    public void clickUcak(){
        clicked(ucakBtn);
    }




}


