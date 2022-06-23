package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class basePage {

    private  WebDriver driver =Driver.getDriver();
    public static int random;

    WebDriverWait wait = new WebDriverWait(driver,10);

    public  void navigateTo(String url){
        driver.get(url);
    }

    public  void clicked(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public  void waitForVisibility(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public  void sendKey(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }


    public  void switch2NextPage() {
        String currentTab = driver.getWindowHandle();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        int index = tabs.indexOf(currentTab);
        driver.switchTo().window((String) tabs.get(index + 1));
    }

    public  void checkElementText (WebElement actual,String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);
        System.out.println("My Message :  " + actual.getText());
    }

    public void switchframe (){
        driver.switchTo().frame(0);
    }

    public void selectList (By locator, int int1){
        List<WebElement> myElements = driver.findElements(locator);
        myElements.get(int1).click();
    }

    public By selectRandomList(By locator){
        List<WebElement> MyElements = driver.findElements(locator);
        Random myelementsSize = new Random();
        int random1 =myelementsSize.nextInt(MyElements.size());
        random = random1+1;
        MyElements.get(random1).click();
        return locator;
    }

    public  String doGetText(By locator){
        return driver.findElement(locator).getText();
    }




}
