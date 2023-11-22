package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HelperBase {
    public void click(By locator) {
        ApplicationManager.getDriver().findElement(locator).click();
    }
    public void type(By locator, String text) {

        WebElement element = ApplicationManager.getDriver().findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);

    }
    public boolean  isTextActualEqualExpected(By textBoards, String boards) {
        if(textBoards.equals(boards)) {
            return true;
        }else {
            System.out.println();
            return false;
        }
    }


}
