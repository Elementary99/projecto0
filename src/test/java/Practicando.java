import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;




public class Practicando {

    private WebDriver driver;
    private String baseUrl;

    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\augusto\\Automation\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.facebook.com/";
    }

    @Test
    public void testPageTitle() throws InterruptedException {
        driver.get(baseUrl);
        String expectedTitle = "Facebook - Entrar o registrarse";
        //Thread.sleep(6000);
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        WebDriverWait wait2 = new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        String actualTitle = driver.getTitle();
        wait2.until(ExpectedConditions.titleContains("Entrar"));
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

}
