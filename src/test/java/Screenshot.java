import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Screenshot {
    public WebDriver webDriver;

    @Test
    public void screenshotTest() throws InterruptedException, IOException, AWTException {
        webDriver=new ChromeDriver();
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
        Thread.sleep(1000);
        TakesScreenshot ss = (TakesScreenshot) webDriver;
        File StFile = ss.getScreenshotAs(OutputType.FILE);
        File DsFile = new File("C:\\Users\\DELL\\IntelliJIdeaProjects\\SeleniumAutomtion\\FacebookSS\\pics.png");
        FileHandler.copy(StFile, DsFile);
    }
}