package net.epam.tests;

import net.epam.domain.entities.repositories.FavoriteRepository;
import net.epam.domain.pages.MainPage;

import org.junit.Test;

public final class TestHeaderFunctionality extends TestBase {

    @Test
    public void userPreferenceDependencyTree(){
        String productDivisionName = "NOT YET DEFINED";
        MainPage.get().setProductDivision(productDivisionName)
                .verifyIsCreationActive()
                .clearProductDivision()
                .verifyIsCreationNotActive();
    }

    @Test
    public void verifySavingDeletingView(){
        String favoriteName = FavoriteRepository.getUniqueView();
        MainPage.get()
                .favoriteNotExistInList(favoriteName)
                .createFavoriteView(favoriteName)
                .favoriteExistInList(favoriteName)
                .deleteAndAcceptFavoriteView(favoriteName)
                .favoriteNotExistInList(favoriteName);
    }

}
