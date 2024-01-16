import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotClass {
    public WebDriver webDriver;

    @Test
    public void robotClassMouseTest() throws InterruptedException, AWTException {

        Robot robot = new Robot();

        robot.mouseMove(400, 550);
        robot.mouseWheel(3);
    }

    @Test
    public void scrollUp() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("window.scrollBy(0,50)");
    }

    @Test
    public void disable_enable_Input() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.get("file:///C:/Users/Admin/Desktop/Selenium/index1.html");
        webDriver.manage().window().maximize();
//Enable.....
        webDriver.findElement(By.id("1")).sendKeys("Sharma");
        Thread.sleep(2000);
//Disable.............
        webDriver.findElement(By.id("2")).sendKeys("Sharma");
        Thread.sleep(2000);
    }

    @Test
    public void actionClass() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.get("file:///C:/Users/Admin/Desktop/Selenium/demo2.html");
        webDriver.manage().window().maximize();
        webDriver.switchTo().frame(0);
        Thread.sleep(2000);
        webDriver.switchTo().defaultContent();
        webDriver.findElement(By.id("t2")).sendKeys("Sharma");
    }
}