package SmokeTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

    ChromeDriver driver = new ChromeDriver();


    @Test
    public void fiveTest() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        // open page
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by");
        Thread.sleep(2000);

        // click on Apple
        driver.findElement(By.xpath("//div[@id='container']/div/div/div/div/div/ul/ul/li[6]")).click();
        Thread.sleep(2000);

        // click on Mi
        driver.findElement(By.xpath("//div[@id='container']/div/div/div/div/div/ul/ul/li[5]")).click();
        Thread.sleep(2000);


        // close browser
        driver.quit();
    }

}

