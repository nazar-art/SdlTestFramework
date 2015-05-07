package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.interfaces.Button;

public class ColumnsFilterUiMap {
    public final Button openFilter;
    public final Button newFilter;
    public final Button saveFilter;
    public final Button backButton;
    public Button closeFilter;

    public ColumnsFilterUiMap() {
        openFilter = CompositionRoot.getButtonClickableByXpath("//div[contains(@class, 'column-manager-button')]", "Open Filter");
        newFilter = CompositionRoot.getButtonStaticByXpath("//div[contains(@class, 'add-new-column-set')]", "New column set");
        saveFilter = CompositionRoot.getButtonClickableByXpath("//button[text()='Save and Apply']", "SaveAndApply filter button");
        backButton = CompositionRoot.getButtonClickableByXpath(XpathLocators.columnsFiltersListRoot
                + "//div[@class='icon icon-arrow-left-2 js-back back-button']", "Filter Back button");
    }
}
