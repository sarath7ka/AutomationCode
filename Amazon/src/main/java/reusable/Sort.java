package reusable;

import org.asynchttpclient.ClientStats;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class Sort extends BrowserInvo{

    public static WebDriver sortOut(){

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pendrive"+Keys.ENTER);
        Actions mous=new Actions(driver);
        driver.findElement(By.id("a-autoid-0")).click();
        WebElement sor=driver.findElement(By.id("a-autoid-0"));
        int sizee=sor.findElements(By.id("a-popover-wrapper")).size();
        System.out.println(sizee);

       // List <WebElement> sort=driver.findElements(By.className("a-popover-wrapper"));
       // Actions sortt = new Actions((WebDriver) sor);
        //size = driver.findElement(By.id("s-result-sort-select_0")).click();
    switch (sizee){
        case 1:
            driver.findElement(By.id("s-result-sort-select_1")).click();
            break;
        case 2:
            driver.findElement(By.id("s-result-sort-select_2")).click();
            break;
        case 3:
            driver.findElement(By.id("s-result-sort-select_3")).click();
            break;
        case 4:
            driver.findElement(By.id("s-result-sort-select_4")).click();
            break;

    }



        return driver;
    }
}
