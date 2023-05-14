package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Filter extends BrowserInvo{


        List<WebElement> filterr = driver.findElements(By.id("s-refinements"));


        private By pendrive=id("twotabsearchtextbox");
        private By department = xpath("//div[@id='n-title']");
        private By flashDrive = id("n/3151491");
        private By customerReview = id("reviewsRefinements");
        private By oneStar = id("p_72/1248882011");
        private By dataStorage = xpath("//div[@id='p_n_feature_keywords_five_browse-bin-title']");
        private By macCheck = id("p_n_feature_keywords_five_browse-bin/7688214011");


        public Filter Pendr(){
            driver.findElement(pendrive).sendKeys("pendrive"+Keys.ENTER);
            return this;
        }
        public Filter Dep () {
            driver.findElement(department);
            return this;

        }
        public Filter FlashButton () {
            driver.findElement(flashDrive).click();
            return this;
        }
        public Filter Customer () {
            driver.findElement(customerReview);
            return this;
        }
        public Filter OneStarClick () {
            driver.findElement(oneStar).click();
            return this;
        }
        public Filter DataStorage () {
            driver.findElement(dataStorage);
            return this;
        }
        public Filter MacCheck () {
            driver.findElement(macCheck).click();
            return this;
        }


}