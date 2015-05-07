package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.interfaces.Button;
import net.epam.infrastructure.sut.controls.interfaces.TextInput;

public class RowsFilterUiMap {

    public final Button openFilter;
    public  Button closeFilter;
    public final Button clearAll;
    public final TextInput searchText;
    public final Button searchButton;

    public RowsFilterUiMap() {
        openFilter = CompositionRoot.getButtonClickableByXpath("//div[contains(@class, 'row-filter-button')]", "Open Filter");
        clearAll = CompositionRoot.getButtonClickableById("btnClearAll", "Clear All");
        searchText = CompositionRoot.getTextInputClickableByXpath("//input[@class='apvSearchInput']", "Search input");
        searchButton = CompositionRoot.getButtonClickableById("innerSearchBtn", "Search button");
    }
}
