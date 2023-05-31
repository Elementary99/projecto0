import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {

    private WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\augusto\\Automation\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
        Thread.sleep(5000);
    }
        @Test
        public void testGooglePage() throws InterruptedException {

            WebElement frame = driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
            driver.switchTo().frame(frame);
            WebElement drag1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
            WebElement drag2 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
            WebElement drag3 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[3]/img"));
            WebElement drag4 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[4]/img"));
            WebElement drop = driver.findElement(By.xpath("//*[@id=\"trash\"]"));

            Actions action = new Actions (driver);
            action.dragAndDrop(drag1, drop).perform();
            Thread.sleep(500);
            action.dragAndDrop(drag2, drop).perform();
            Thread.sleep(500);
            action.dragAndDrop(drag3, drop).perform();
            Thread.sleep(500);
            action.dragAndDrop(drag4, drop).perform();

            Thread.sleep(6000);

        }

        @After
        public void tearDown(){
            driver.quit();
        }


    }

