package tests;

import manager.ApplicationManager;
import manager.HelperUser;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    HelperUser helperUser = new HelperUser();
    @BeforeSuite
    public void precondition(){
        ApplicationManager.init();
    }
    @AfterSuite
    public void postcondition(){
        ApplicationManager.tearDown();
    }
}
