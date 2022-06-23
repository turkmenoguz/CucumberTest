package Steps;

import Pages.ucusListesiPage;
import io.cucumber.java.en.When;

public class flightListPageSteps {

    ucusListesiPage ucusListesiPage = new ucusListesiPage();

    @When("Gidis ucusu secilir")
    public void gidis_ucus_sec() throws InterruptedException {
        ucusListesiPage.gidisUcusuSec();
    }

    @When("Gidis ucusu icin coklu sinif var olup olmadigi kontrol edilir")
    public void gidis_coklu_sınıf_kontrolu() throws InterruptedException {
        ucusListesiPage.gidisCokluSınıfKontrol();

    }

    @When("Dönüş ucusu secilir")
    public void donus_ucus_sec() throws InterruptedException {
        ucusListesiPage.donusUcusuSec();
    }

    @When("Donus ucusu icin coklu sinif var olup olmadigi kontrol edilir")
    public void donus_coklu_sınıf_kontrolu() throws InterruptedException {
        ucusListesiPage.donusCokluSınıfKontrol();

    }
}
