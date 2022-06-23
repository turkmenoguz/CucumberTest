package Steps;

import Pages.homePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.Driver;

public class homePageSteps {

    Pages.homePage homePage = new homePage();

    @Given("{string} ana sayfası açılır")
    public void ana_sayfası_açılır(String string) {
        homePage.openUrl();
    }

    @When("Üye giriş butonuna tıklanır")
    public void üye_giriş_butonuna_tıklanır() {
        homePage.login();
    }

    @When("Uçak butonuna tıklanır")
    public void uçak_butonuna_tıklanır() {
        homePage.clickUcak();
    }

   @After
    public  void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("!!!!!!!!!!!!!!!!!!!!-----TEST BITTI----!!!!!!!!!!!");
        Driver.closeDriver();
    }




}
