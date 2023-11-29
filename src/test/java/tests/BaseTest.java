package tests;

import dto.UserDTOLombok;
import manager.ApplicationManager;
import manager.HelperUser;
import manager.HalperLogout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class BaseTest {
    HelperUser helperUser = new HelperUser();
    HalperLogout halperLogout = new HalperLogout();
    Logger logger= LoggerFactory.getLogger(BaseTest.class);
    UserDTOLombok user = UserDTOLombok.builder()
            .email("pesinilya@gmail.com")
            .password("Vp12345$")
            .build();
    boolean flagNeedLogout = false;
    boolean flagNeedOpenMain = false;
    @BeforeSuite
    public void precondition() throws Exception {
        logger.info("open brauser");

        ApplicationManager.init();
    }
    @AfterSuite
    public void postcondition(){
        logger.info("close brauser");
        ApplicationManager.tearDown();
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
