package net.epam.domain.pages;

import net.epam.domain.uimaps.CodingAndProductionUiMap;
import net.epam.domain.uimaps.XpathLocators;
import net.epam.infrastructure.sut.controls.uielements.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CodingAndProduction {
    private CodingAndProductionUiMap controls;

    private CodingAndProduction(){
        this.controls = new CodingAndProductionUiMap();
    }

    public static CodingAndProduction get(){
        return new CodingAndProduction();
    }

    private WebDriver getDriver() {
        return WebDriverUtils.get();
    }

    public void selectProductDivision(String productDivisionName){
        controls.productDivisionArrow.click();//in console execute $(".mCSB_container .select2-container").eq(0).select2("open");

        getDriver().findElement(By.xpath("//ul[@class='select2-results']//li//div[@class='select2-result-label' and text()='" + productDivisionName + "']")).click();
    }

    public void clearProductDivision(){
        controls.productDivisionClear.click();
    }

    public boolean isCreationCenterActive(){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", getDriver().findElement(By.xpath("//div[@class='mCSB_container']/div[@class='item']/div[@class='label']/span[text()='Creation Center']")));
        boolean flag = controls.creationCenterArrow.isDisplayed();

        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", getDriver().findElement(By.xpath(XpathLocators.HEADER_SETTING_ICON)));

        return flag;
    }
}
