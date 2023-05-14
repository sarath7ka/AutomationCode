package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingOut extends BrowserInvo{


    public static WebDriver signnOut(){

        WebElement logOut=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(500));
        Actions mous=new Actions(driver);
        mous.clickAndHold(logOut).build().perform();
        driver.findElement(By.id("nav-item-signout")).click();





        return driver;

    }
}
