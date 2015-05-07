package net.epam.domain.pages;

import junit.framework.Assert;
import net.epam.domain.uimaps.ColumnsFilterUiMap;
import net.epam.domain.uimaps.CompositionRoot;
import net.epam.domain.uimaps.XpathLocators;
import net.epam.infrastructure.common.StringUtilities;
import net.epam.infrastructure.sut.controls.interfaces.Button;
import net.epam.infrastructure.sut.controls.interfaces.TextLabel;
import net.epam.infrastructure.sut.controls.uielements.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Map;

public final class ColumnsFilter {

    private final ColumnsFilterUiMap controls;

    private TextLabel filterVisible = CompositionRoot.getTextLabelVisibleByXpath(XpathLocators.columnsFiltersListRoot, "Filter Container");

//    String filterPath;

    private ColumnsFilter() {
        this.controls = new ColumnsFilterUiMap();
    }

    public static ColumnsFilter get() {
        return new ColumnsFilter();
    }

    private String getFilterPath(String name) {
        return XpathLocators.columnsFiltersListRoot + "//div[@class='label' and text()='" + name + "']";
    }

    private WebDriver getDriver() {
        return WebDriverUtils.get();
    }

    public void openFilters() {
    	try {
    		Thread.sleep(1000);	
		} catch (Exception e) {
			e.printStackTrace();
		}

        controls.openFilter.click();
        filterVisible.isDisplayed();

        TextLabel spinner = CompositionRoot.getTextLabelClickableByCssSelector("loading-spinner", "spiner");
        Assert.assertTrue("spinner.isAbsent()", spinner.isAbsent());
    }

    public void closeFilters() {
        controls.openFilter.click();
    }

    /*public static void main(String[] args) {
        for (rangeIds ids : rangeIds.values()) {
            System.out.println(ids.toString());
        }
    }*/

    /**
     * @param filterValues value which should be selected.
     * @return True - when filter was modified, otherwise False returned
     */
    private boolean setFilterValues(Map<String, List<String>> filterValues) {
        boolean filterWasChanged = false;

        for (String key : filterValues.keySet()) { // iterate over criteria
//            WebElement filterKey = getDriver().findElement(
//                    By.xpath(XpathLocators.columnsFiltersListRoot + "//div[@class='label' and text()='" + key + "']"));

            // wrapper for element
            String xpath = StringUtilities.buildString(XpathLocators.columnsFiltersListRoot, "//div[@class='label' and text()='" + key + "']");
            Button filterButton = CompositionRoot.getButtonStaticByXpath(xpath, "filter key");

            if (!sectionIsOpen(key)) {
                filterButton.click();
            }
            List<String> _attributes = filterValues.get(key);

            for (String _attribute : _attributes) {
                WebElement labelElement = getDriver().findElement(By.xpath(XpathLocators.columnsFiltersListRoot + "//input[@name='" + _attribute + "']"));

                scrollToElement(labelElement);

                if (!labelElement.isSelected()) {
                    labelElement.click();
                    filterWasChanged = true;
                }

                /*// wrapper for element
                String xpathLabel = StringUtilities.buildString(XpathLocators.columnsFiltersListRoot, "//input[@name='" + _attribute + "']");
                CheckBox checkBox = CompositionRoot.getCheckBoxClickableByXpath(xpathLabel, "checkbox element");

                //todo not realized
                scrollToElement(checkBox);

                if (!checkBox.isSelected()) {
                    checkBox.click();
                    filterWasChanged = true;
                }*/
            }
            if (sectionIsOpen(key)) {
                filterButton.click();
            }
        }
        return filterWasChanged;
    }

    private boolean sectionIsOpen(String name) {
        String path = StringUtilities.buildString(getFilterPath(name), XpathLocators.COL_FILTER_ICON_DOWN_XPATH);
        Button iconArrowDownButton = CompositionRoot.getButtonStaticByXpath(path, "arrow Down");
        return iconArrowDownButton.isDisplayed();
    }

    private boolean sectionIsClosed(String name) {
        String buttonXpath = getFilterPath(name) + XpathLocators.COL_FILTER_ICON_RIGHT_XPATH;
        Button iconArrowRight = CompositionRoot.getButtonStaticByXpath(buttonXpath, "arrow Right");
        return iconArrowRight.isDisplayed();
    }

    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", element);
    }

    public boolean openFilter(String filterName) {
        openFilters();
        String editIconXpath = XpathLocators.columnsFiltersListRoot + "//span[text()='" + filterName + "']";
        CompositionRoot.getButtonClickableByXpath(editIconXpath, "filter name").click();
        return filterVisible.isAbsent();
    }

    public void editFilter(String filterName, Map<String, List<String>> newFilterValues) {
        openFilters();

        String editIconXpath = XpathLocators.columnsFiltersListRoot + "//span[text()='" + filterName + "']";
//        TextLabel filterLabel = CompositionRoot.getTextLabelClickableByXpath(editIconXpath, "filter name");
        WebElement editIcon = getDriver().findElement(By.xpath(editIconXpath));///../span[@class='icon icon-settings js-edit']"));

        Actions actions = new Actions(getDriver());
        actions.moveToElement(editIcon).build().perform();
        String editIconButton = "../span[@class='icon icon-settings js-edit']";
        CompositionRoot.getButtonStaticByXpath(editIconXpath + "/" + editIconButton, "editIconButton").click();
        //editIcon.findElement(By.xpath(editIconButton)).click();
        if (setFilterValues(newFilterValues)) {
            saveAndApply();
        } else {
            filterBackButton();
            if (!isFilterActive(filterName))
                applyFilter(filterName);
            else
                closeFilters();
        }
    }

    private void filterBackButton() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", getDriver().findElement(By.xpath(XpathLocators.columnsFiltersListRoot
                + "//div[@class='icon icon-arrow-left-2 js-back back-button']")));
        controls.backButton.click();
    }

    public boolean isFilterActive(String filterName) {
        String className = getDriver().findElement(By.xpath(
                XpathLocators.columnsFiltersListRoot + "//span[text() = '" + filterName + "']/..")).getAttribute("className");
        return className.contains("active");
    }

    public void deleteFilter(String filterName) {
        String filterPath = XpathLocators.columnsFiltersListRoot + "//span[text() = '" + filterName + "']/..";
        WebElement editIcon = getDriver().findElement(By.xpath(filterPath));

        Actions actions = new Actions(getDriver());
        actions.moveToElement(editIcon).build().perform();
        getDriver().findElement(By.xpath(XpathLocators.columnsFiltersListRoot + "//div[@class='item js-item cursor-pointer' and span[text() = '" + filterName + "']]" + XpathLocators.FILTER_SETTINGS_EDIT)).click();
    }

    private void saveAndApply() {
        controls.saveFilter.click();

        TextLabel spinner = CompositionRoot.getTextLabelClickableByCssSelector("loading-spinner", "spiner");
        Assert.assertTrue("spinner.isAbsent()", spinner.isAbsent());

        filterVisible.isAbsent();
    }

    public void createAndApply(String filterName, Map<String, List<String>> filterValues) {
        controls.openFilter.click();
        controls.newFilter.click();

        CompositionRoot.getTextInputClickableByXpath(XpathLocators
                .columnsFiltersListRoot + "//input[@placeholder='Enter Name Here']", "Filter Input")
                .sendText(filterName);

        setFilterValues(filterValues);

        saveAndApply();

    }

    public void applyFilter(String name) {
        CompositionRoot.getButtonStaticByXpath(
                XpathLocators.columnsFiltersListRoot + "//span[text() = '" + name + "']/..", name + "  filter")
                .click();

        filterVisible.isAbsent();
    }



    public boolean filterPresent(String filterName) {
        List<WebElement> names = getDriver().findElements(By.xpath(XpathLocators.columnsFiltersListRoot + "//span[text() = '" + filterName + "']"));
        return names.size() > 0;
    }

    public enum rangeIds {
        carryOverArticleCnt,
        newClrArticleCnt,
        actGoInMarginPct,
        actNetSalesAmnt,
        actBuyingVolume,
        actMrktForecast,
        //
        actModelCnt,
        newModelCnt,
        carryOverModelCnt,
        actArticleCnt,
        newArticleCnt,
        confidentialFlag,
        creationDate,
        mrktDepartment,
        totalArticleCnt,
        productDivision,
        quarter,
        rangeName,
        seasonCode,
        targetGoInMarginPct,
        targetNetSalesAmount,
        targetVolumeUnits,
        targetModelCount,
        targetArticleCount,
        totalModelCnt

    }

    public enum ModelIds {
        ageGroupCode,
        betterPlaceCode,
        businessSegmentCode,
        brandAssetCode,
        buyReadyStatusDescr,
        buyReadyValidationStatus,
        buyingVolumeUnit,
        carriedOverFrom,
        categoryMrktLineCode,
        confidentialFlag,
        constructionTypeCode,
        consumerBenefitCode,
        corporateMrktLineCode,
        creationCenterCode,
        creationDate,
        developmentOrganization,
        developmentTrackCode,
        developmentTypeCode,
        dropDate,
        earliestBuyReadyDate,
        factoryName,
        featuresAndBenefit,
        genderCode,
        gfr,
        glblGoInMarginActFOB,
        glblGoInMarginBufferFOB,
        glblGoInMarginBVFOB,
        glblGoInMarginTgtFOB,
        indicativeGIM,
        lifeCycleStatusCode,
        lifeCycleStatusDate,
        localUsageCode,
        manufacturingCapability,
        mrktDepartment,
        mrktForecast,
        mrktProposedSize,
        modelDescr,
        modelName,
        modelNameLong,
        modelNumber,
        modelStatus,
        projectManagerName,
        priceSegmentCode,
        productClassCode,
        productDivision,
        productGroupCode,
        productManagerName,
        productTypeCode,
        quarter,
        referenceWorkingNumber,
        replenishmentflag,
        retailIntroDate,
        retailExitDate,
        rrp,
        rrpCurrencyCode,
        rrp2,
        rrp2CurrencyCode,
        salesLineCode,
        salesUnitCode,
        seasonCode,
        sellingRegionCode,
        sportsCategoryCode,
        placeHolderStyleCount,
        subBrand,
        targetConsumerCode,
        targetFOB,
        targetFOBCurrencyCode,
        targetMaterialCode,
        targetSourcingCode,
        targetTechnologyCode,
        techConceptCodes,
        transportLeadTimeCode,
        workingNumber,
        totalArticleCnt;

    }

    public enum ArticleIds {
        actualFOB,
        actualFOBStatus,
        articleNumber,
        articleStatusCode,
        articleTypeCode,
        betterPlaceCode,
        bufferFOB,
        businessModelCode,
        businessUnitCode,
        buyReadyValidationStatus,
        buyReadyStatusDescr,
        buyingVolume,
        carriedOverFrom,
        colorName,
        creationDate,
        developmentTrackCode,
        developmentTypeCode,
        distributionChannels,
        earliestBuyReadyDate,
        ffmModelActual,
        ffmModelCode,
        glblForecast,
        glblGoInMarginActFOB,
        glblGoInMarginBufferFOB,
        glblGoInMarginBVFOB,
        glblGoInMarginTgtFOB,
        leadColorway,
        lifeCycleStatusCode,
        lifeCycleStatusDate,
        mrktClassificationCode,
        mrktDepartment,
        mrktForecast,
        mrktPropose,
        bvNetSales,
        glblNetSales,
        physicalColorway,
        priceSegmentCode,
        productManagerName,
        quarter,
        replenishmentflag,
        retailExitDate,
        retailIntroDate,
        rrp,
        rrpCurrencyCode,
        seasonCode,
        sellingRegionCode,
        splUsage,
        specialUsageCode,
        stdGoInMarginActFOB,
        stdGoInMarginBufferFOB,
        stdGoInMarginBVFOB,
        stdGoInMarginTgtFOB,
        targetConsumerCode,
        targetFOB,
        targetFOBCurrencyCode,
        transportLeadTimeCode
    }

}
