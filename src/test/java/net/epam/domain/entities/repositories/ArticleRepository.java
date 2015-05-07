package net.epam.domain.entities.repositories;

import net.epam.domain.entities.definitions.Article;

import java.util.List;


public class ArticleRepository {

    public static Article getRegular() {
        return Article.get(ModelRepository.get()).setActualFob("jbhkbjh").build();
    }

    public static Article getArticleInPlannedStatus() {
        return null;
    }

    public static Article getArticleInActiveSeason() {
        return null;
    }

    public static Article getArticleInInactiveSeason() {
        return null;
    }

    public static List<Article> get75Articles() {
        return null;
    }
}
