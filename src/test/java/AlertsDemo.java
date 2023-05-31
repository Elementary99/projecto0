import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
    private WebDriver driver;

    @Test

public void Alerts() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\augusto\\Automation\\chrome\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
    Thread.sleep(3000);

    //Simple Alert
    driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();
    String alertText = driver.switchTo().alert().getText();
    System.out.println(alertText);
    Thread.sleep(2000);
    driver.switchTo().alert().accept();              //Solo acepta
    driver.switchTo().parentFrame();
    Thread.sleep(1000);

    //Confirmation Alert
    driver.findElement(By.xpath("//*[@id=\"confirmBox\"]")).click();
    String alertText1 = driver.switchTo().alert().getText();
    System.out.println(alertText1);
    Thread.sleep(2000);
    driver.switchTo().alert().dismiss(); //En este Rechaza
    driver.switchTo().parentFrame();
    Thread.sleep(1000);

    driver.findElement(By.xpath("//*[@id=\"confirmBox\"]")).click();
    String alertText3 = driver.switchTo().alert().getText();
    System.out.println(alertText3);
    Thread.sleep(2000);
    driver.switchTo().alert().accept(); //En este Acepta
    driver.switchTo().parentFrame();
    Thread.sleep(1000);

    //Prompt Alert
    driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
    String alertText4 = driver.switchTo().alert().getText();
    System.out.println(alertText4);
    Thread.sleep(2000);
    Alert alert = driver.switchTo().alert(); //Crea el elemento Alert
            alert.sendKeys("Augusto sanchez"); //Envia el texto
        Thread.sleep(4000);
    alert.accept(); //Acepta
    driver.switchTo().parentFrame();
    Thread.sleep(4000);

    driver.quit();


}
}
