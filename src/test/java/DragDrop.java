import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
    public WebDriver driver;
    @Test
    public void dragAndDrop() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        Thread.sleep(1500);
        WebElement des=driver.findElement(By.id("draggable"));
        WebElement element2=driver.findElement(By.xpath("//p[text()='Drop here']"));
        Actions action =  new Actions(driver);
        action.dragAndDrop(des,element2).perform();
    }
}