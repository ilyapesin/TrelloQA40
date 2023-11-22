package tests;

import dto.UserDTO;
import manager.HelperUser;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void testLoginPositivUserDTO() {
     UserDTO userDTO = new UserDTO("pesinilya@gmail.com", "Vp12345$");
        helperUser.loginUser(userDTO);
    }
}
