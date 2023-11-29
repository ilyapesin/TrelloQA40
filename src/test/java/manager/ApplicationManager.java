package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    static WebDriver wd;
    public static void init(){
        wd=new ChromeDriver();
       // wd.navigate().to("https://trello.com/home");
        navigate();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }
    public  static void tearDown(){
        wd.quit();
    }

    public static WebDriver getWd() {

        return wd;
    }
    public static void navigate(){
        wd.navigate().to("https://trello.com/home");
    }
}
