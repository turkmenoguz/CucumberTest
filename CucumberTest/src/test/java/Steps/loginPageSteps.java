package Steps;

import Pages.loginPage;
import io.cucumber.java.en.When;

public class loginPageSteps {

    Pages.loginPage loginPage = new loginPage();

    @When("Üye ol butonuna tıklanır")
    public void üye_ol_butonuna_tıklanır() {
        loginPage.tıklaSignUyeolBtn();
    }
    @When("{string} {string} ile bilgileri girilir")
    public void ile_bilgileri_girilir(String string, String string2) throws InterruptedException {
        loginPage.setEmail(string);
        loginPage.setPassword(string2);
    }

    @When("Üye ol ekranında \"üye ol\" butonuna tıklanır")
    public void üye_ol_butonuna_tıkla() throws InterruptedException {
        loginPage.tiklaRegisterUyeolBtn();
    }
}


