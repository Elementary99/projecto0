import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowsDemo {

    private WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\augusto\\Automation\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/au/");
        Thread.sleep(3000);
    }

    @Test

    public void handleMultipleWindows() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"onetrust-policy-text\"]/a[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"ot-header-id-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"onetrust-pc-sdk\"]/div[3]/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[3]/div/div/div/a/span")).click();
        Thread.sleep(5000);
        Set<String> windowhandle = driver.getWindowHandles();
        System.out.println(windowhandle);
        Iterator<String> iterator = windowhandle.iterator();
        String parentwindow = iterator.next();
        String childwindow = iterator.next();

        driver.switchTo().window(childwindow);

        driver.findElement(By.name("UserFirstName")).sendKeys("Jose");
        driver.findElement(By.name("UserLastName")).sendKeys("Perez");

        Thread.sleep(6000);

        driver.quit();

    }

}
