import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

    private WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\augusto\\Automation\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        Thread.sleep(3000);
    }

    @Test

    public void handleFrame2() throws InterruptedException {
        WebElement frame1 =driver.findElement(By.id("frm2"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("arturo");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("shelby");
        Thread.sleep(6000);
        driver.quit();

    }
}