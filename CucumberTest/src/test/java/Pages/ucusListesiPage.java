package Pages;

import org.openqa.selenium.By;

public class ucusListesiPage extends basePage {
    public By gidisucusListesi = By.xpath("(//ul[@id='outbound-journeys']//li[@id])");
    public By donusucusListesi = By.xpath("(//ul[@id='return-journeys']//li[@id])");
    public By biletGidis;
    public By biletDonus;
    public By ECO_FLY_GIDIS = By.cssSelector("#outbound-journeys > li > div.details.row > ul > li > ul > li:nth-child(1) > div > div:nth-child(2) > .price");
    public By ECO_FLY_DONUS = By.cssSelector("#return-journeys > li > div.details.row > ul > li > ul > li:nth-child(1) > div > div:nth-child(2) > .price");


    public void gidisUcusuSec () throws InterruptedException {
        Thread.sleep(1000);
        waitForVisibility(gidisucusListesi);
        selectRandomList(gidisucusListesi);
        biletGidis = By.xpath("(//ul[@id='outbound-journeys']//li[@id])["+ basePage.random +"]");
        System.out.println(doGetText(biletGidis));
    }

    public void donusUcusuSec () throws InterruptedException {
        Thread.sleep(1000);
        waitForVisibility(donusucusListesi);
        selectRandomList(donusucusListesi);
        biletDonus = By.xpath("(//ul[@id='return-journeys']//li[@id])["+ basePage.random +"]");
        System.out.println(doGetText(biletDonus));
    }

    public void gidisCokluSınıfKontrol() throws InterruptedException {

        By promosyon = (By.cssSelector("ul#outbound-journeys > li:nth-child(" + basePage.random + ") > div:nth-child(1) > ul > li > div.warning"));
        System.out.println(doGetText(promosyon));
        System.out.println(doGetText(biletGidis));
        String promosyonText = doGetText(promosyon);
        System.out.println("-------------/n-------");
        System.out.println(promosyonText);

        if (promosyonText.contains("Promosyonlu")) {
            System.out.println("----- Coklu sinif ucusu var ------");
            Thread.sleep(1000);
            clicked(ECO_FLY_GIDIS);
        } else {
            System.out.println("----- Coklu sinif ucusu Yok ------");
        }
    }

    public void donusCokluSınıfKontrol() throws InterruptedException {

        By promosyon = (By.cssSelector("ul#return-journeys > li:nth-child(" + basePage.random + ") > div:nth-child(1) > ul > li > div.warning"));

        String promosyonText = doGetText(promosyon);
        System.out.println("--------------------");
        System.out.println(promosyonText);

        if (promosyonText.contains("Promosyonlu")) {
            System.out.println("----- Coklu sinif ucusu var ------");
            Thread.sleep(1000);
            clicked(ECO_FLY_DONUS);
        } else {
            System.out.println("----- Coklu sinif ucusu Yok ------");
        }
    }


}
