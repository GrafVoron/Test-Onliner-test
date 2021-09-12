package SmokeTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class Test2 {

   ChromeDriver driver = new ChromeDriver();

    @Test
    public void firstTest() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        // open page
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by");
        Thread.sleep(2000);

        // click element Вход and transition on page registration
        driver.findElement(By.xpath("//div[text()='Вход']")).click();
        Thread.sleep(2000);

        // close browser
        driver.quit();



    }
}