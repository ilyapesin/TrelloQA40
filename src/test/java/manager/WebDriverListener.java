package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.DateUtils;

import java.util.Date;

public class WebDriverListener extends AbstractWebDriverEventListener {
Logger logger= LoggerFactory.getLogger(WebDriverListener.class);

    public WebDriverListener() {
        super();
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        super.beforeFindBy(by, element, driver);
        logger.info("Start searching element---> " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        super.afterFindBy(by, element, driver);
        logger.info("Element with locator--->"+ by+ " is found");
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        super.onException(throwable, driver);
        logger.info("Something went wrong");
        logger.info(throwable.getMessage());
        logger.info(throwable.fillInStackTrace().toString());
        logger.error("Message: " + throwable.getMessage());
       // int i=(int)(System.currentTimeMillis()/1000)%3600;
      //  String link="src/test/screenshorts/screen"+i+".png";
        String link="src/test/screenshorts/screen"+ DateUtils.getDateString() +".png";
        HelperBase helperBase=new HelperBase();
        helperBase.takeScreenshot(link);
        logger.info("Screenshot ---->"+link);
    }

    @Override
    public void beforeAlertAccept(WebDriver driver) {
        super.beforeAlertAccept(driver);
        logger.info("BeforeAlertAccept ---->"+driver);
    }

    @Override
    public void afterAlertAccept(WebDriver driver) {
        super.afterAlertAccept(driver);
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        super.beforeNavigateTo(url, driver);
        logger.info("BeforeNavigateTo ---->"+url);
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        super.afterNavigateTo(url, driver);
        logger.info("AfterNavigateTo----->"+url+"succses");
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        super.beforeClickOn(element, driver);
        logger.info("before click"+element.toString());
    }
}
