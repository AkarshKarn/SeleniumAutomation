import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;


import static java.util.logging.FileHandler.*;

public class FacebookLogin {
    public WebDriver webDriver;
    @Test
    public void login() throws InterruptedException, IOException, AWTException {
        webDriver=new ChromeDriver();
        webDriver.get("https://www.facebook.com/");

        String str=webDriver.getCurrentUrl();
        System.out.println(str);

        String src=webDriver.getPageSource();
        System.out.println(src);

        String tit=webDriver.getTitle();
        System.out.println(tit);

        webDriver.manage().window().maximize();
        Thread.sleep(1000);

        webDriver.findElement(By.name("email")).sendKeys("abcd12@gmail.com");
        Thread.sleep(1000);

        webDriver.findElement(By.name("pass")).sendKeys("123456");
        Thread.sleep(1000);

        webDriver.findElement(By.name("login")).click();
        Thread.sleep(1000);

        Thread.sleep(1500);

        webDriver.navigate().to("https://crex.live/");
        Thread.sleep(1000);

        webDriver.navigate().back();
        Thread.sleep(1500);

        webDriver.navigate().forward();
        Thread.sleep(1500);

        webDriver.navigate().back();
        Thread.sleep(1500);

        webDriver.navigate().refresh();
        Thread.sleep(1500);

        webDriver.quit();




    }
}

