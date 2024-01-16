import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AutoId {
    public WebDriver driver;

    @Test
    public void fileUpload() throws InterruptedException, IOException {
        driver=new ChromeDriver();
        driver.get("https://pdfcompressor.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/label/span")).click();
        Thread.sleep(4500);
        Runtime.getRuntime().exec("C:\\Users\\DELL\\Documents\\SelFile.exe");
        Thread.sleep(6000);

    }
}
