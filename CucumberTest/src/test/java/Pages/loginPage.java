package Pages;

import org.openqa.selenium.By;

public class loginPage extends basePage {

    public By signuyeolBtn = By.xpath("//a[@class='sign-up login-to-register']");
    public By registeruyeolBtn = By.xpath("//button[@class='register register-button']");
    public By email = By.xpath("//input[@type='email']");
    public By password = By.xpath("//input[@type='password']");



    public void tıklaSignUyeolBtn(){
        clicked(signuyeolBtn);
    }

    public void tiklaRegisterUyeolBtn() throws InterruptedException {
        clicked(registeruyeolBtn);
        Thread.sleep(1000);
    }

    public void setEmail (String keyword) throws InterruptedException {
        Thread.sleep(1000);
        sendKey(email,keyword);
    }

    public void setPassword (String keyword) throws InterruptedException {
        Thread.sleep(1000);
        sendKey(password,keyword);
    }
}
