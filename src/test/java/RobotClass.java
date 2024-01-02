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
    public void robotClassKeyboardTest() throws InterruptedException, IOException, AWTException {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com/");

        webDriver.manage().window().maximize();
        Thread.sleep(1000);

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        Thread.sleep(1000);

        webDriver.findElement(By.name("pass")).sendKeys("");

        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_K);
        robot.keyRelease(KeyEvent.VK_K);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("//input=[@name='login']")).click();

    }

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
//        driver.findElement(By.id("t1")).sendKeys("Santosh");
        Thread.sleep(2000);
        webDriver.switchTo().defaultContent();
        webDriver.findElement(By.id("t2")).sendKeys("Sharma");
    }
}