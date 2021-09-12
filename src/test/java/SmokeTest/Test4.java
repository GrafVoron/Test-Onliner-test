package SmokeTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

    ChromeDriver driver = new ChromeDriver();


    @Test
    public void fourthTest() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        // open page
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by");
        Thread.sleep(2000);

        // click element Вход and transition on page registration
        driver.findElement(By.xpath("//div[text()='Вход']")).click();
        Thread.sleep(2000);

        // click button Войти and get error message
        driver.findElement(By.xpath("//div[text()='Войти']")).click();
        Thread.sleep(2000);

        // close browser
        driver.quit();




    }
}

