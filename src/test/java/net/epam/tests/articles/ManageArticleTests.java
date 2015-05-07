package net.epam.tests.articles;

import net.epam.domain.entities.definitions.Article;
import net.epam.domain.pages.MainPage;
import net.epam.tests.TestBase;
import org.junit.Test;

public class ManageArticleTests extends TestBase {

    @Test()
    public void deleteArticleWithPlannedStatus() {
        final Article article = net.epam.domain.entities.repositories.ArticleRepository.getArticleInPlannedStatus();
        MainPage.get().clickOnArticleTab().selectArticleWithCheckbox(article).clickDelete().clickDeleteUnderWarningMessage();
    }
}
