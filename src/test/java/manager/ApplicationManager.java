package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.ConfigProperties;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    //static WebDriver wd;
    static EventFiringWebDriver wd;


    static String browser;

    public ApplicationManager() {
      this.browser = System.getProperty("browser", BrowserType.CHROME);
    }


    static Logger logger=LoggerFactory.getLogger(ApplicationManager.class);
    public static void init(){
       // wd=new ChromeDriver();
    // wd=new EventFiringWebDriver(new ChromeDriver());
    ApplicationManager app=new ApplicationManager();
        if(browser.equals(BrowserType.CHROME)){
            wd=new EventFiringWebDriver(new ChromeDriver());
            logger.info("Tests start on Chrome");
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd=new EventFiringWebDriver(new FirefoxDriver());
            logger.info("Tests start on Firefox");
        } else if (browser.equals(BrowserType.SAFARI)) {
            wd=new EventFiringWebDriver(new SafariDriver());
        }
        wd.register(new WebDriverListener());
       // wd.navigate().to("https://trello.com/home");
        navigateHomePage();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }
    public  static void tearDown(){
        wd.quit();
    }

    public static WebDriver getWd() {

        return wd;
    }
    public static void navigateHomePage(){

       // wd.navigate().to("https://trello.com/home");
        wd.navigate().to(ConfigProperties.getProperty("url"));

    }
}
