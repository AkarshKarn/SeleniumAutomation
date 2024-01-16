import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.awt.*;
import java.io.IOException;
import java.util.List;

public class WebElementClass {

    public WebDriver webDriver;

    @Test
    public void webElement() throws InterruptedException, IOException, AWTException {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");

        webDriver.manage().window().maximize();

        webDriver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1500);


    }


}
