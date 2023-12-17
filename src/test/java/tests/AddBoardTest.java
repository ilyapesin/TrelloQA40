package tests;

import manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class AddBoardTest extends BaseTest{
    @BeforeClass
    public void beforeClass(){

        helperUser.login(user);
    }
    @AfterClass
    public void afterClass(){
        halperLogout.logout();
    }
    @Test
    public void addBoardTestPositive(){

    }
}
