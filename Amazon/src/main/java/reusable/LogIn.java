package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogIn extends BrowserInvo{

    public static WebDriver logInPage() {
        WebElement logInEle=driver.findElement(By.id("nav-link-accountList"));
        Actions mou=new Actions(driver);
        mou.clickAndHold(logInEle).build().perform();
        driver.findElement(By.partialLinkText("Sign in")).click();
        //driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("saravanakumarres@gmail.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sarath");
        driver.findElement(By.className("a-button-input")).click();


        return driver;
    }
}