package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    //static WebDriver wd;
    static EventFiringWebDriver wd;
    public static void init(){
       // wd=new ChromeDriver();
        wd=new EventFiringWebDriver(new ChromeDriver());
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
        wd.navigate().to("https://trello.com/home");
    }
}
