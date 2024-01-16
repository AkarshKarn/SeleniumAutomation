import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsExecutor {
    public WebDriver driver;

    @Test
    public void simple_alert() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        Thread.sleep(2500);
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2500);
        System.out.println(alert.getText());
        Thread.sleep(3500);
        alert.accept();
        Thread.sleep(2000);
    }

    @Test
    public void simpleAlert() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();
        Thread.sleep(2500);
        driver.findElement(By.id("timerAlertButton")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2500);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);
    }


    @Test
    public void confirmSimpleAlert() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();
        Thread.sleep(2500);
        driver.findElement(By.id("confirmButton")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2500);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);
    }

    @Test
    public void promtSimpleAlert() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();
        Thread.sleep(2500);
        driver.findElement(By.id("promtButton")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2500);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);
        alert.sendKeys("Akash");
    }




}