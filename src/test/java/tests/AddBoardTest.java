package tests;

import manager.ApplicationManager;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class AddBoardTest extends BaseTest{
    boolean flagNeedBack=false;
    @BeforeClass
    public void beforeClass(){

        helperUser.login(user);
    }
    @AfterMethod
    public void afterMethod(){
        if(flagNeedBack) {
            halperBoards.navigateBack();
            flagNeedBack = false;
        }
    }
    @AfterClass
    public void afterClass(){
        halperLogout.logout();
    }
    @Test
    public void addBoardTestPositive(){
        String name=randomUtils.createRandomString(4);
        halperBoards.createNewBoard(name);
        halperBoards.pause(10000);
        flagNeedBack=true;
        Assert.assertTrue(halperBoards.validateBoardNameCorrect(name));
    }
}
