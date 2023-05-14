package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RemoveCart extends BrowserInvo {


    public static WebDriver removeCar(){

        //List<WebElement> cart = driver.findElements(By.id("sc-active-cart"));
       // cart.set(driver.findElements(By.className("a-size-small sc-action-delete")));
        driver.findElements(By.id("sc-active-C1fa2d043-590e-4526-bb91-3ae300a2c4fe"));

        return driver;
    }

}
