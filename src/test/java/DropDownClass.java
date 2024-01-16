import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownClass {
public WebDriver webDriver;

    @Test
    public void selectDropDawn() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.facebook.com");
        webDriver.manage().window().maximize();
        Thread.sleep(5000);
        webDriver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

// Select day:
        WebElement element = webDriver.findElement(By.id("day"));
        Select select = new Select(element);
        select.selectByIndex(2);
        Thread.sleep(2500);
        select.selectByValue("1");
        select.selectByVisibleText("12");
        Thread.sleep(2500);
//Select month:
        WebElement element1 = webDriver.findElement(By.id("month"));
        Select select1 = new Select(element1);
        select1.selectByValue("1");
        Thread.sleep(2500);
//Select year:
        WebElement element2 = webDriver.findElement(By.id("year"));
        Select select2 = new Select(element2);
        select2.selectByValue("2024");
        Thread.sleep(2500);


        List<WebElement> gender = webDriver.findElements(By.className("_58mt"));
        System.out.println(gender.size());

        for (
                WebElement ele : gender) {
            System.out.println("Genders are: " + ele.getText());
        }
    }
}
