package manager;

import org.openqa.selenium.By;

public class HelperBoards extends HelperBase{
    By btnCreateNewBoard= By.xpath("//div[@class='board-tile mod-add']");
    By inputBoardName= By.xpath("//input[@data-testid='create-board-title-input']");
    By btnCreateNewBoardForm=By.xpath("//button[@data-testid='create-board-submit-button']");
    By textBoardName= By.xpath("//h1[@data-testid='board-name-display']");
    public  void clickBtnCreateNewBoard() {
        click(btnCreateNewBoard);
    }
    public void inputBoardName(String boardName) {
        type(inputBoardName,boardName);
    }
    public void clickBtnCreateNewBoardForm() {
        click(btnCreateNewBoardForm);
    }
    public void createNewBoard(String boardName){
        clickBtnCreateNewBoard();
        inputBoardName(boardName);
        pause(2000);
        clickBtnCreateNewBoardForm();
    }
    public boolean validateBoardNameCorrect(String boardName){
        return isTextActualEqualToExpected(textBoardName,boardName);
    }

}

