package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteBoardTest extends BaseTest{
    @BeforeClass
    public void beforeClass(){
        helperUser.login(user);
    }
    @AfterClass
    public void afterClass(){
        halperLogout.logout();

    }
    @Test
    public void deleteOneBoardPositive() {
        String name=randomUtils.createRandomString(4);
        halperBoards.createNewBoard(name);
//        halperBoards.deleteBoardByName(name);
//        Assert.assertFalse(halperBoards.validateBoardExistByName(name));

    }
}
