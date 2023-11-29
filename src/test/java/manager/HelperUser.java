package manager;

import dto.UserDTO;
import dto.UserDTOLombok;
import dto.UserDTOWith;
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
    By textH5SignUp = By.xpath("//h5");
    By btnLogOut1 = By.xpath("//*[contains(@aria-label,'ILYA PESIN (pesinilya)')]");
    By btnLogOut2 = By.xpath("//*[text()='Log out']");
    By btnLogOut3 = By.xpath("//*[@class='css-178ag6o']");

//    public void loginUser(UserDTO userDTO) {
//        click(btnLogin);
//        type(inputUsername, userDTO.getUsername());
//        click(btnSubmit);
//        type(inputPassword, userDTO.getPassword());
//        click(btnSubmit);
//    }
//
//
//    public void loginUserDTOWith(UserDTOWith userDTO) {
//        click(btnLogin);
//        type(inputUsername, userDTO.getEmail());
//        click(btnSubmit);
//        type(inputPassword, userDTO.getPassword());
//        click(btnSubmit);
//
//    }

    public void login(UserDTOLombok user) {
//      click(btnLogin);
        clickLogin();
//      type(inputUsername, userDTOLombok.getEmail());
        printEmail(user.getEmail());
//      click(btnSubmit);
        submitLogin();
  //     type(inputPassword, userDTOLombok.getPassword());
        submitPassword(user.getPassword());
        //click(btnSubmit);
        submitPassword();
    }
    public void clickLogin()
    {
        click(btnLogin);
    }
    public void printEmail(String email){
        type(inputUsername, email);

    }
    public void submitLogin() {
        click(btnSubmit);
    }
    public void submitPassword(String password){

        type(inputPassword,password);
    }
    public void submitPassword() {

        click(btnSubmit);
    }

    public boolean validateTextBoardsExist() {

        return isTextActualEqualToExpected(textBoards, "Boards");
    }
    public boolean validateTextSignUpH5Displays(){
        return isTextActualEqualToExpected(textH5SignUp, "Sign up to continue");
    }



}