package manager;

import dto.UserDTO;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HelperUser extends HelperBase {
    //    click(By.xpath("//a[contains(@data-uuid, 'login')]"));
//    type(By.xpath("//input[@id='username']"), "pesinilya@gmail.com");
//    click(By.xpath("//button[@id='login-submit']"));
//    type(By.xpath("//*[@id='password']"), "Vp12345$");
//    click(By.xpath("//button[@id='login-submit']"));
//    String boardText = wd.findElement(By.xpath("//span[text()='Boards']")).getText();
//        Assert.assertEquals(boardText, "Boards", "text not Boards");
    By btnLogin = By.xpath("//a[contains(@data-uuid, 'login')]");
    By inputUsername = By.xpath("//input[@id='username']");
    By btnSubmit = By.xpath("//button[@id='login-submit']");
    By inputPassword = By.xpath("//input[@id='password']");
    By textBoards = By.xpath("//span[text()='Boards']");

    public void loginUser(UserDTO userDTO) {
        click(btnLogin);
        type(inputUsername, userDTO.getUsername());
        click(btnSubmit);
        type(inputPassword, userDTO.getPassword());
        click(btnSubmit);
    }
    public boolean validateTextBoards() {
        return isTextActualEqualExpected(textBoards,"Boards");
    }


}