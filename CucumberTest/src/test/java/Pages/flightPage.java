package Pages;

import org.openqa.selenium.By;

public class flightPage extends basePage {

    public By gidisIl = By.id("origin-input");
    public By donusIl = By.id("destination-input");
    public By gidisTarihSec = By.id("departure-input");
    public By donusTarihSec = By.id("return-input-placeholder");
    public By gidisilSecimi = By.cssSelector("#origin>.results>ul>li");
    public By donusilSecimi = By.cssSelector("#destination>.results>ul>li");
    public By calendarDate = By.xpath("//div[@class='calendar-left']//button[@class='week in']");
    public By calendarDateReturn = By.xpath("//div[@class='calendar-right']//button[@class='week in']");
    public By ucakBiletiBulBtn = By.id("search-button");




    public void gidisilSecim(String string) throws InterruptedException {
        clicked(gidisIl);
        sendKey(gidisIl,string);
        Thread.sleep(1000);
        selectList(gidisilSecimi,0);

    }

    public void donusilSecim(String string) throws InterruptedException {
        clicked(donusIl);
        sendKey(donusIl,string);
        Thread.sleep(1000);
        selectList(donusilSecimi,0);
    }

    public void gidisTarihSecim() throws InterruptedException {
        clicked(gidisTarihSec);
        selectRandomList(calendarDate);
        Thread.sleep(1000);

    }

    public void donusTarihSecim() throws InterruptedException {
        clicked(donusTarihSec);
        Thread.sleep(1000);
        selectRandomList(calendarDateReturn);
    }

    public void setUcakBiletiBulBtn(){
        clicked(ucakBiletiBulBtn);
    }




}
