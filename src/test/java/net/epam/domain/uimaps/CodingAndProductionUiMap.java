package net.epam.domain.uimaps;

import net.epam.infrastructure.sut.controls.interfaces.Button;

public class CodingAndProductionUiMap {

    public final Button productDivisionArrow;
    public final Button productDivisionClear;
    public final Button creationCenterArrow;

    public CodingAndProductionUiMap(){
        this.productDivisionArrow = CompositionRoot.getButtonStaticByXpath("//div[@class='mCSB_container']/div[@class='item']/div/span[text()='Product Division']/../../div[@class='data-options']//span[@class='select2-arrow']", "product division arrow");
        this.productDivisionClear = CompositionRoot.getButtonStaticByXpath("//div[@class='mCSB_container']/div[@class='item']/div/span[text()='Product Division']/../../div[@class='data-options']//abbr[@class='select2-search-choice-close']", "product division clear");
        this.creationCenterArrow = CompositionRoot.getButtonStaticByXpath("//div[@class='mCSB_container']/div[@class='item']/div/span[text()='Creation Center']/../../div[@class='data-options']//span[@class='select2-arrow']", "creation center");
    }
}
