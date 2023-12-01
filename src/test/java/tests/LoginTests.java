package tests;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class LoginTests extends BaseTest {
    @AfterMethod(alwaysRun = true)
    public void postcondition(Method method){
        if(flagNeedLogout)
        {
            halperLogout.logout();
            flagNeedLogout=false;
            logger.info("flagNeedLogout"+flagNeedLogout);
            logger.info("method information "+method.getName());

        }else if (flagNeedOpenMain){
            ApplicationManager.navigateHomePage();
            flagNeedOpenMain=false;
            logger.info("flagNeedOpenMain"+flagNeedOpenMain);

        }

    }

    @Test
    public void LoginPositivTest() {
        helperUser.login(user);
        flagNeedLogout=true;
       // helperUser.pause();
        Assert.assertTrue(helperUser.validateTextBoardsExist());

    }

    @Test
    public void LoginNegativeTest() {
        helperUser.clickLogin();
        helperUser.printEmail("pesinily@gmail.com");
        helperUser.submitLogin();
        flagNeedOpenMain=true;
//        helperUser.pause();
//        Assert.assertTrue(helperUser.validateTextSignUpH5Displays());

    }


}