package manager;

import org.openqa.selenium.By;

public class HalperLogout extends HelperBase{

    By btnMenuAvatar = By.xpath("//div[@data-testid='header-member-menu-avatar']/span");
    By btnLogoutInMenuAvatar = By.xpath("//button[@data-testid='account-menu-logout']");
    By btnLogout = By.xpath("//button[@data-testid='logout-button']");
    public void logout() {
        click(btnMenuAvatar);
        click(btnLogoutInMenuAvatar);
        click(btnLogout);

    }
}
