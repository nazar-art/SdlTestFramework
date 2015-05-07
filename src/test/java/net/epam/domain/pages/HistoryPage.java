package net.epam.domain.pages;

import net.epam.domain.entities.definitions.History;

/**
 * Created by Yurii_Helesh on 02-Mar-15.
 */
public class HistoryPage {

    public static HistoryPage get() {
        return new HistoryPage();
    }

    private HistoryPage() {
    }

    public HistoryPage showHistoryForModelUnderFromToDate(History history) {
        return this;
    }

    public HistoryPage showHistoryForArticleUnderFromToDates(History history) {
        return this;
    }

    public HistoryPage clickOnShowHistoryButton() {
        return this;
    }

    public HistoryPage verifyHistoryResults() {
        return this;
    }
}
