package net.epam.domain.pages;

import net.epam.domain.uimaps.XpathLocators;
import net.epam.domain.entities.definitions.Range;
import net.epam.domain.uimaps.CompositionRoot;
import net.epam.infrastructure.common.StringUtilities;
import net.epam.infrastructure.sut.controls.interfaces.Button;
import net.epam.infrastructure.sut.controls.uielements.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataGrid {

    public static DataGrid get() {
        return new DataGrid();
    }

    private DataGrid() {
    }

    public boolean isVisible() {
        return CompositionRoot.getTextLabelVisibleByXpath(XpathLocators.dataGridTableRoot, "Data Grid Table root").isDisplayed();
    }

    public enum columnId {
        productDivision,
        rangeName,
        articleStatusCode,
        workingNumber
    }


    private List<WebElement> getRowCells(int rowNumber) {
        List<WebElement> rows = WebDriverUtils.get().findElements(By.xpath(XpathLocators.dataGridTableRoot + "//tbody/tr"));
        return rows.get(rowNumber).findElements(By.tagName("td"));
    }

    private WebElement getCell(List<WebElement> rowCells, String columnName) {
        int index = Integer.parseInt(WebDriverUtils.get().findElement(By.xpath(XpathLocators.dataGridTableRoot + "//div[@data-id='" + columnName + "']")).getAttribute("data-col-index"));
        return rowCells.get(index);
    }

    public String getCellValue(int rowNumber, columnId columnName) {
        return getCell(getRowCells(rowNumber), columnName.toString()).getText();
    }

    final String nextPageButton_xpath = "/div[contains(@class, 'pagination-part navigation-arrows next')]";
    final String previousPageButton_xpath = "/div[contains(@class, 'pagination-part previous navigation-arrows')]";

    final String nextPageButtonDisabled_xpath = "/div[contains(@class, 'pagination-part navigation-arrows next  disabled')]";
    final String previousPageButtonDisabled_xpath = "/div[contains(@class, 'pagination-part previous navigation-arrows  disabled')]";

    Button nextPage = CompositionRoot.getButtonClickableByXpath(XpathLocators.dataGridPaginationRoot + nextPageButton_xpath, "Next Page button");
    Button previousPage = CompositionRoot.getButtonClickableByXpath(XpathLocators.dataGridPaginationRoot + previousPageButton_xpath, "Previous Page button");

    public boolean goToNextPage() {
        if (isNextPageAvailable()) {
            nextPage.click();
            return true;
        }
        return false;
    }

    public boolean goToPreviuosPage() {
        if (isPreviousPageAvailable()) {
            previousPage.click();
            return true;
        }
        return false;
    }

    private boolean isNextPageAvailable() {
        return CompositionRoot.getButtonClickableByXpath(nextPageButtonDisabled_xpath, "Next Page disabled button").isAbsent();
    }

    private boolean isPreviousPageAvailable() {
        return CompositionRoot.getButtonClickableByXpath(previousPageButtonDisabled_xpath, "Previous Page disabled button").isAbsent();
    }

    public WebElement searchRow(String rowXPath) {

        String finalPath = XpathLocators.dataGridTableRoot + rowXPath;

        List<WebElement> elems = WebDriverUtils.get().findElements(By.xpath(finalPath + "/.."));
        if (elems.size() > 0)
            return elems.get(0);
        if (elems.size() == 0) {
            while (goToNextPage()) {
                elems = WebDriverUtils.get().findElements(By.xpath(finalPath + "/.."));
                if (elems.size() > 0) {
                    return elems.get(0);
                }
            }
        }
        return null;
    }

    public DataGrid searchAndCheckRangeInDataGridCustomFilter(Range range) {
        checkRow(searchRangeInDataGridCustomFilter(range));
        return this;
    }

    ;

    public WebElement searchRangeInDataGridCustomFilter(Range range) {

        Map<Integer, String> columnHeadersRangeDefaultFilter = new HashMap<Integer, String>();
        columnHeadersRangeDefaultFilter.put(0, "carryOverArticleCnt");
        columnHeadersRangeDefaultFilter.put(1, "newClrArticleCnt");
        columnHeadersRangeDefaultFilter.put(2, "actGoInMarginPct");
        columnHeadersRangeDefaultFilter.put(3, "actNetSalesAmnt");
        columnHeadersRangeDefaultFilter.put(4, "actBuyingVolume");

        String row_xpath = "td[text()='%0$s']";
        String separator = "/following-sibling::";

        return searchRow("//" + StringUtilities.appendStringsWithSeparator(row_xpath, separator, range.getActualCarryOverArticle(),
                range.getActualNewColorArticle(), range.getActualGoInMarginPercent(), range.getActualNetSalesEURk(),
                range.getActualVolumeUnit()));
//        return searchRow(finalRow_xpath.toString());
    }

    public WebElement searchRangeInDataGridDefaultFilter(Range range) {

        Map<Integer, String> columnHeadersRangeDefaultFilter = new HashMap<Integer, String>();
        columnHeadersRangeDefaultFilter.put(0, "mrktDepartment");
        columnHeadersRangeDefaultFilter.put(1, "productDivision");
        columnHeadersRangeDefaultFilter.put(2, "quarter");
        columnHeadersRangeDefaultFilter.put(3, "rangeName");
        columnHeadersRangeDefaultFilter.put(4, "seasonCode");
        columnHeadersRangeDefaultFilter.put(5, "totalModelCnt");

        String row_xpath = "td[text()='%0$s']";
        String separator = "/following-sibling::";

        return searchRow("//" + StringUtilities.appendStringsWithSeparator(row_xpath, separator,
                range.getMarketingDepartment(),
                range.getProductDivision(), range.getQuarter(), range.getRangeName(),
                range.getSeason(), range.getNumberOfModels()));
    }

    public void checkRow(WebElement rowToCheck) {
        int index = Integer.parseInt(rowToCheck.getAttribute("rowIndex"));
        if (null != rowToCheck) {
            WebElement checkBox = WebDriverUtils.get().findElement(By.xpath("//div[@class='ht_clone_left handsontable']//table[@class='htCore']//tbody/tr[" + index + "]//input[@class='checkbox']"));
            Actions actions = new Actions(WebDriverUtils.get());
            actions.moveToElement(rowToCheck);
            checkBox.click();
        }
    }

}
