package net.epam.tests;

import net.epam.domain.entities.definitions.History;
import net.epam.domain.entities.repositories.HistoryRepository;
import net.epam.domain.pages.MainPageTwo;
import org.junit.Test;

public class ShowHistoryTest extends TestBase {

    @Test
    public void verifyHistoryUnderModel() {
        final History history = HistoryRepository.showHistoryForTimelines();
        MainPageTwo.get().selectReleasedModel()
                .selectHistoryOptionFromRightClickMenu()
                .showHistoryForModelUnderFromToDate(history)
                .clickOnShowHistoryButton()
                .verifyHistoryResults();
    }

    @Test
    public void verifyHistoryUnderArticle() {
        final History history = HistoryRepository.showHistoryForTimelines();
        MainPageTwo.get().selectReleasedArticle()
                .selectHistoryOptionFromRightClickMenu()
                .showHistoryForArticleUnderFromToDates(history)
                .clickOnShowHistoryButton()
                .verifyHistoryResults();
    }

    @Test
    public void verifyHistoryUnderArticleBySelectingOneMonthDateRange() {
        final History history = HistoryRepository.showHistoryForTimeLinesToCurrentDate();
        MainPageTwo.get().selectReleasedArticle()
                .selectHistoryOptionFromRightClickMenu()
                .showHistoryForArticleUnderFromToDates(history)
                .clickOnShowHistoryButton()
                .verifyHistoryResults();
    }
}
