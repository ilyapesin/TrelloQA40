package tests;

import dto.UserDTOLombok;
import manager.*;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;
import utils.RandomUtils;

import java.lang.reflect.Method;
@Listeners(TestNGListener.class)
public class BaseTest {
    HelperUser helperUser = new HelperUser();
    HalperLogout halperLogout = new HalperLogout();
    HelperBoards halperBoards = new HelperBoards();
    RandomUtils randomUtils = new RandomUtils();

    Logger logger= LoggerFactory.getLogger(BaseTest.class);
    UserDTOLombok user = UserDTOLombok.builder()
            .email("pesinilya@gmail.com")
            .password("Vp12345$")
            .build();
    boolean flagNeedLogout = false;
    boolean flagNeedOpenMain = false;

    @BeforeSuite(alwaysRun = true)
    public void precondition(){

        ApplicationManager.init();
        logger.info("open browser");
    }
    @AfterSuite(alwaysRun = true)
    public void postcondition(){
        ApplicationManager.tearDown();
        logger.info("close browser");
    }
    @BeforeMethod
    public void beforeMethod(Method method) {
       logger.info("before method " + method.getName());
    }
    @AfterMethod
    public void afterMethod(Method method) {
        logger.info("after method " + method.getName());
    }
}
