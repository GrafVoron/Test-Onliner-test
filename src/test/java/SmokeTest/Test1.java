package SmokeTest;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class Test1 {

    ChromeDriver driver = new ChromeDriver();



    @Test
    public void firstTest() throws Exception {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");


        // open page
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by");
        Thread.sleep(2000);


        // press Logo Onliner
        driver.findElement(By.className("onliner_logo")).click();
        Thread.sleep(2000);


        // transition on main page and close browser
        driver.quit();


    }
}
