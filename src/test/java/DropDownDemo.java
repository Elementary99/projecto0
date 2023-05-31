import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    private WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\augusto\\Automation\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(5000);
    }
    @Test

    public void DropHandle() throws InterruptedException {
        WebElement ddown = driver.findElement(By.xpath("//*[@id=\"course\"]"));
        Select select = new Select(ddown);
        select.selectByValue("python"); //Seleccion por valor
        Thread.sleep(4000);

        driver.quit();

    }
}
