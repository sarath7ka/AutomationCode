package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AddCart extends BrowserInvo {

    public static WebDriver addCart(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrive"+Keys.ENTER);

        driver.findElement(By.id("submit.add-to-cart")).click();
        driver.findElement(By.id("nav-cart")).click();




        return driver;
    }
}
