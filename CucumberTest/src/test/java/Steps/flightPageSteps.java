package Steps;

import Pages.homePage;
import Pages.flightPage;
import io.cucumber.java.en.When;

public class flightPageSteps {

    Pages.homePage homePage = new homePage();
    flightPage flightPage = new flightPage();

    @When("Gidiş {string} ve Dönüş {string} seçilir")
    public void gidiş_ve_dönüş_seçilir(String string, String string2) throws InterruptedException {
        flightPage.gidisilSecim(string);
        flightPage.donusilSecim(string2);
    }

    @When("Gidiş tarihi dönüş tarihi seçilir")
    public void gidiş_tarihi_ve_dönüş_tarihi_seçilir() throws InterruptedException {
        flightPage.gidisTarihSecim();
        flightPage.donusTarihSecim();
    }

    @When("Uçak bileti Bul butonuna tıklanır")
    public void uçak_bileti_bul_butonuna_tıklanır() {
        flightPage.setUcakBiletiBulBtn();
    }

}
