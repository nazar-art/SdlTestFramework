package net.epam.domain.pages;

import net.epam.domain.uimaps.RowsFilterUiMap;
import net.epam.infrastructure.sut.controls.uielements.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public final class RowsFilter {

    private WebElement filterContainer() {
        return WebDriverUtils.get().findElement(By.id("apvFilterContent"));
    }

    public static RowsFilter get() {
        return new RowsFilter();
    }

    private final RowsFilterUiMap controls;

    private RowsFilter() {
        this.controls = new RowsFilterUiMap();
    }

    public void openFilter() {
        controls.openFilter.click();
    }

    public void search(String searchText) {
        controls.searchText.type(searchText);
        controls.searchButton.click();
    }

    public void clear() {
        controls.clearAll.click();
    }

    public void clearSpecifiedFilter(String filterName) {
        filterContainer().findElement(By.linkText(filterName)).findElement(By.className("multilevelAccordion-clearFilter")).click();
    }

    private void search(String type, Map<String, List<String>> values) {
        WebElement filterContainer = filterContainer();

        //openSubFilter
        filterContainer.findElement(By.linkText(type)).click();

        for (Map.Entry<String, List<String>> entry : values.entrySet()) {
            String _range = entry.getKey();
            List<String> _attributes = entry.getValue();
            WebElement range_click = filterContainer.findElement(By.linkText(_range));
            //open SubSubFilter
            range_click.click();

            for (String _attribute : _attributes) {
                WebElement asd = range_click.findElement(By.xpath("//span[contains(text(), '" + _attribute + "')]"));
                WebElement parent = asd.findElement(By.xpath(".."));
                parent.findElement(By.tagName("input")).click();
            }
            //closeSubSubFilter
            range_click.click();
        }
        //close SubFilter
        filterContainer.findElement(By.linkText(type)).click();
    }

    public void searchRange(Map<String, List<String>> map) {
        search("Range", map);
    }

    private void openSubFilter() {
        ;
    }

    private void closeSubfilter() {
        ;
    }

    public void searchModel(Map<String, List<String>> map) {
        search("Model", map);
    }

    public void searchArticle(Map<String, List<String>> map) {
        search("Article", map);
    }
}
