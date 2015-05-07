package net.epam.tests;

import net.epam.domain.entities.definitions.Login;
import net.epam.domain.entities.definitions.SearchValue;
import net.epam.domain.entities.repositories.LoginRepository;
import net.epam.domain.entities.repositories.SearchValuesRepository;
import net.epam.domain.pages.MainPage;
import org.junit.Test;

public class SearchTest extends TestBase {


    @Test
    public void arrowAndEnterKeys() {
        final Login loginUser = LoginRepository.getAdidasUser();
        final SearchValue searchByAttribute = SearchValuesRepository.searchByAttribute();

        MainPage.get().loginUser(loginUser).
                clickOnSearchTextBox().
                searchByAttribute(searchByAttribute).
                verifyAutoSuggestionForSearch().
                verifyNavigationOnSuggestionOptionWithKeys().
                selectOptionFromAutoSuggestionWithEnterKey().
                logout();

    }

    @Test
    public void searchIn() {

        final Login loginUser = net.epam.domain.entities.repositories.LoginRepository.getAdidasUser();

        MainPage.get().loginUser(loginUser).
                navigateToRangeTab().
                verifySearchInType().
                navigateToModelTab().
                verifySearchInType().
                navigateToArticleTab().
                verifySearchInType().
                logout();
    }

    @Test
    public void rowFilterRecalculation() {

        final Login loginUser = net.epam.domain.entities.repositories.LoginRepository.getAdidasUser();
        final SearchValue searchByAttribute = SearchValuesRepository.searchByAttribute();

        MainPage.get().loginUser(loginUser).
                navigateToModelTab().
                openRowFilter().
                verifyCountInRowFilter().
                selectSearchOption().
                clickOnSearchTextBox().
                searchByAttribute(searchByAttribute).
                clickOnSearchIcon().verifySearchResult().
                verifyCountInRowFilter().
                logout();
    }

    @Test
    public void rowFilterAttributeValues() {

        final Login loginUser = net.epam.domain.entities.repositories.LoginRepository.getAdidasUser();
        final SearchValue searchByAttribute = SearchValuesRepository.searchByAttribute();

        MainPage.get().loginUser(loginUser).
                openRowFilter().
                verifyRowFilterIsApplied().
                selectSearchOption().
                clickOnSearchTextBox().
                searchByAttribute(searchByAttribute).
                clickOnSearchIcon().
                verifySearchResult().
                verifyRowFilterAttributeCheckBoxes().
                logout();

    }
}
