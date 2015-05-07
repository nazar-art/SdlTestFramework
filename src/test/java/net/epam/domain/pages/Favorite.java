package net.epam.domain.pages;

import net.epam.domain.uimaps.FavoriteUiMap;
import net.epam.domain.uimaps.XpathLocators;
import net.epam.infrastructure.sut.controls.uielements.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Favorite {

    private FavoriteUiMap controls;

    private Favorite() {
        this.controls = new FavoriteUiMap();
    }

    public static Favorite get() {
        return new Favorite();
    }

    private WebDriver getDriver() {
        return WebDriverUtils.get();
    }

    public void createView(String viewName){
        controls.favoriteNameInput.sendText(viewName);
        controls.addFavoriteButton.click();
    }

    public NotificationMessage deleteFavorite(String favoriteName) {
        String favoritePath = XpathLocators.FAVORITE_LIST_ROOT + "//span[text() = '" + favoriteName + "']/..";
        WebElement deleteIcon = getDriver().findElement(By.xpath(favoritePath));

        Actions actions = new Actions(getDriver());
        actions.moveToElement(deleteIcon).build().perform();

        getDriver().findElement(By.xpath(XpathLocators.FAVORITE_LIST_ROOT + "//span[contains(text(),'" + favoriteName + "')]/../span[contains(@class,'icon-close')]")).click();

        return NotificationMessage.get();
    }


    public boolean favoritePresent(String favoriteName) {
        controls.favoriteTable.isActive();

        List<WebElement> names = getDriver().findElements(By.xpath(XpathLocators.FAVORITE_LIST_ROOT + "//span[contains(text(),'" + favoriteName + "')]"));
        return names.size() > 0;
    }
}
