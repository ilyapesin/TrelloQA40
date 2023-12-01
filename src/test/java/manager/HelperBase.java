package manager;

import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.IOException;

public class HelperBase {
    Logger logger= LoggerFactory.getLogger(HelperBase.class);
    public void click(By locator) {

        ApplicationManager.getWd().findElement(locator).click();
        logger.info("Locator "+locator+" clicked");
    }
    public void type(By locator, String text) {

        WebElement element = ApplicationManager.getWd().findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);

    }
    public boolean isTextActualEqualToExpected(By locator, String text) {
        if(ApplicationManager.getWd().findElement(locator).getText().toUpperCase().trim()
                .equals(text.toUpperCase().trim())) {
            return true;
        } else {
            System.out.println("actual result: " +
                    ApplicationManager.getWd().findElement(locator).getText().toUpperCase().trim() +
                    " expected result: " + text.toUpperCase().trim());
            return false;
        }
    }


    public void pause() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void takeScreenshot(String link){
        File tmp = ((TakesScreenshot)ApplicationManager.getWd()).getScreenshotAs(OutputType.FILE);
        File screenshot=new File(link);

        try {
            Files.copy(tmp, screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
