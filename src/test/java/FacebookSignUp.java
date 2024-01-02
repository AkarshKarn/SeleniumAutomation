import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignUp {
    public WebDriver webDriver;

    @Test
    public void signUp() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");

        webDriver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);

        webDriver.findElement(By.name("firstname")).sendKeys("Akarsh");
        Thread.sleep(1000);

        webDriver.findElement(By.name("lastname")).sendKeys("Karn");
        Thread.sleep(1000);

        webDriver.findElement(By.name("reg_email__")).sendKeys("akarsh@gmail.com");
        Thread.sleep(1000);

        webDriver.findElement(By.name("reg_email_confirmation__")).sendKeys("akarsh@gmail.com");
        Thread.sleep(1000);

        webDriver.findElement(By.name("reg_passwd__")).sendKeys("123456");
        Thread.sleep(1000);

        webDriver.findElement(By.name("birthday_day")).sendKeys("1");
        Thread.sleep(1000);

        webDriver.findElement(By.name("birthday_month")).sendKeys("Jan");
        Thread.sleep(1000);

        webDriver.findElement(By.name("birthday_year")).sendKeys("2001");
        Thread.sleep(1000);

        //    webDriver.findElement(By.xpath("//label[text()='Male']")).click();
        //    Thread.sleep(1000);

        webDriver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
        Thread.sleep(1000);

        webDriver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);

    }
}
