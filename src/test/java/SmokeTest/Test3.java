package SmokeTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

    ChromeDriver driver = new ChromeDriver();

    @Test
    public void thirdTest() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        try {
            // open page
            driver.manage().window().maximize();
            driver.get("https://catalog.onliner.by");
            Thread.sleep(2000);

            // find  input field
            WebElement element = driver.findElement(By.xpath("//input[@name='query']"));
            Thread.sleep(2000);

            // input "Notebook" and push Enter
            element.sendKeys("Notebook", Keys.ENTER);
            Thread.sleep(2000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        // close browser
        driver.quit();
    }

}

