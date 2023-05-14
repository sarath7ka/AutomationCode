package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.URL;

public class BrowserInvo {
    static WebDriver driver;

    public static WebDriver launchApp(){
        driver=new EdgeDriver();
        driver.navigate().to("https://www.amazon.com/");
        return driver;
    }
}
