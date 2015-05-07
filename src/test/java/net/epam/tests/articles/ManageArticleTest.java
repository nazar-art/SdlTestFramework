package net.epam.tests.articles;


import net.epam.domain.entities.definitions.Article;
import net.epam.domain.pages.MainPage;
import net.epam.tests.TestBase;
import org.junit.Test;

import java.util.List;

import static net.epam.domain.entities.repositories.ArticleRepository.get75Articles;

public class ManageArticleTest extends TestBase {


    @Test
    public void verifyArticlesInactiveSeasonNotBeEdited() {
        final Article activeArticle = net.epam.domain.entities.repositories.ArticleRepository.getArticleInActiveSeason();
        final Article inactiveArticle = net.epam.domain.entities.repositories.ArticleRepository.getArticleInInactiveSeason();
        MainPage.get().navigateToArticleTab().editArticleByMenu(activeArticle, inactiveArticle).editArticlesByShortcut(activeArticle, inactiveArticle);
    }

    @Test
    public void verifyAscendingOrderSort() {
        List<Article> articles = get75Articles();
        String nameOfNumericalColumn = "RRP";
        MainPage.get().navigateToArticleTab().identifyAndClickNumericalColumn(nameOfNumericalColumn).verifyAscendingOrderSortInColumn(articles).identifyPointer(nameOfNumericalColumn);
    }
}
