import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPractice {
    private WebDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","D:\\augusto\\Automation\\chrome\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.google.com/");
    }

@Test
    public void testGooglePage() throws InterruptedException {

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.clear();
        searchbox.sendKeys("ac dc back in black");
        searchbox.submit();
        Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div/div/div/div/div/div[2]/h3/a/h3")).click();
    Thread.sleep(12000);

}

@After
    public void tearDown(){
        driver.quit();
}

}
