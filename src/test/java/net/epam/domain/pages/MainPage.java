package net.epam.domain.pages;

import net.epam.domain.entities.definitions.*;
import net.epam.domain.entities.repositories.ModelRepository;
import net.epam.domain.entities.definitions.Range;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class MainPage {

    public static MainPage get() {
        return new MainPage();
    }

    Header header;
    ColumnsFilter columnsFilter;

    public MainPage setProductDivision(String productDivisionName){
        header.openSettings().openUserPreference().openCodingAndProduction().selectProductDivision(productDivisionName);
        return this;
    }

    public MainPage clearProductDivision(){
        header.openSettings().openUserPreference().openCodingAndProduction().clearProductDivision();
        return this;
    }

    public MainPage verifyIsCreationNotActive(){
        Assert.assertFalse(header.openSettings().openUserPreference().openCodingAndProduction().isCreationCenterActive(), "Creation Center is inactive");
        header.closeSettings();
        return this;
    }

    public MainPage verifyIsCreationActive(){
        Assert.assertTrue(header.openSettings().openUserPreference().openCodingAndProduction().isCreationCenterActive(), "Creation Center is active");
        header.closeSettings();
        return this;
    }

    public MainPage createFavoriteView(String favoriteName){
        header.openFavorites().createView(favoriteName);
        return this;
    }

    public MainPage deleteAndAcceptFavoriteView(String favoriteName){
        header.openFavorites().deleteFavorite(favoriteName).acceptMessage();
        return this;
    }

    public MainPage deleteAndDeclineFavoriteView(String favoriteName){
        header.openFavorites().deleteFavorite(favoriteName).declineMessage();
        return this;
    }

    public MainPage favoriteNotExistInList(String favoriteName) {
        Assert.assertFalse(header.openFavorites().favoritePresent(favoriteName), "Favorite still list");
        return this;
    }

    public MainPage favoriteExistInList(String favoriteName) {
        Assert.assertTrue(header.openFavorites().favoritePresent(favoriteName), "Favorite is in list");
        return this;
    }

    public MainPage editFilter(Map<String, List<String>> filters) {
        columnsFilter.editFilter("Default Filter", filters);
        return this;
    }

    public MainPage openDefaultFilter() {
        columnsFilter.openFilter("Default Filter");
        return this;
    }

    public MainPage deleteFilter(String filterName) {
        columnsFilter.openFilters();
        columnsFilter.deleteFilter(filterName);
        return this;
    }


    public MainPage createAndApplyFilter(String filterName, Map<String, List<String>> filterValues) {
        columnsFilter.createAndApply(filterName, filterValues);

        return this;
    }

    public MainPage applyFilter(String filterName) {
        columnsFilter.openFilters();
        columnsFilter.applyFilter(filterName);
        return this;
    }

    public MainPage filterNotExistInList(String filterName) {
        columnsFilter.openFilters();
        Assert.assertFalse(columnsFilter.filterPresent(filterName), "Filter still in list");
        return this;
    }
    
    public MainPage filterExistInList(String filterName) {
        columnsFilter.openFilters();
        Assert.assertTrue(columnsFilter.filterPresent(filterName), "Filter is in list");
        return this;
    }

    public MainPage searchAndCheckRangeInDataGridCustomFilter(List<Range> ranges) {
        for (Range range : ranges) {
            DataGrid.get()
                    .searchAndCheckRangeInDataGridCustomFilter(range);
        }
        return this;
    }

    private MainPage() {
        columnsFilter = ColumnsFilter.get();
        header = Header.get();
    }

    public MainPage createNewColumnFilter(String filterName) {
        // todo
        return this;
    }

    public MainPage selectSavedFilter(String filterName) {
        return this;
    }

    public MainPage checkDataSheetContent() {
        return this;
    }

    public MainPage deleteModel(Model plannedModel) {
        // todo
        return this;
    }

    public MainPage checkEditForPlanned(Model... plannedModels) {
        // todo
        return this;
    }

    public MainPage checkEditForReleased(Model... models) {
        // todo
        return this;
    }

    public MainPage loginPMreebok(Login login) {
        return this;
    }

    public MainPage validateReebokLogo() {
        return this;
    }

    public MainPage validateUserName() {
        return this;
    }

    public MainPage loginUser(Login login) {
        return this;
    }

    public MainPage logout() {
        return this;
    }

    public MainPage clickOnSearchTextBox() {
        return this;
    }

    public MainPage searchByAttribute(SearchValue search) {
        return this;
    }

    public MainPage verifySearchResult() {
        return this;
    }

    public MainPage selectSearchOption() {
        return this;
    }

    public MainPage verifyAutoSuggestionForSearch() {
        return this;
    }

    public MainPage verifyNavigationOnSuggestionOptionWithKeys() {
        return this;
    }

    public MainPage selectOptionFromAutoSuggestionWithEnterKey() {
        return this;
    }

    public MainPage navigateToRangeTab() {
        return this;
    }

    public MainPage verifySearchInType() {
        return this;
    }

    public MainPage navigateToModelTab() {
        return this;
    }

    public MainPage navigateToArticleTab() {
        return this;
    }

    public MainPage verifyCountInRowFilter() {
        return this;
    }

    public MainPage clickOnSearchIcon() {
        return this;
    }

    public MainPage openRowFilter() {
        return this;
    }

    public MainPage verifyRowFilterIsApplied() {
        return this;
    }

    public MainPage verifyRowFilterAttributeCheckBoxes() {
        return this;
    }

    public MainPage selectRandomImageInRow() {
        return this;
    }

    public MainPage verifyFullBlowImageSize() {
        return this;
    }

    public MainPage drillDownToModels(Range range) {
        return this;
    }

    public MainPage deleteRangeViaShortCut(Range range) {
        return this;
    }

    public MainPage warningMessagePressDelete() {
        return this;
    }

    public MainPage warningMessagePressIgnore() {
        return this;
    }

    public MainPage validateWarningMessage() {
        return this;
    }

    public MainPage loginMP(Login login) {
        return this;
    }

    public MainPage editRangeAttribute(Range currentRange, Range newRange) {
        return this;
    }

    public MainPage copyRangeAttributes(Range currentRange, Range targetRange, String[] attributes) {
        return this;
    }

    public MainPage saveChanges() {
        return this;
    }

    public MainPage setConfidentialToRange(Range range) {
        return this;
    }

    public MainPage protoOrderingInvoke() {
        return this;
    }

    public MainPage hangtagInvoke() {
        return this;
    }

    public MainPage hangtagClose() {
        return this;
    }

    public MainPage ILALabelingInvoke() {
        return this;
    }

    public MainPage ILALabelingClose() {
        return this;
    }

    public MainPage GIMFOBSimulationInvoke() {
        return this;
    }

    public MainPage GIMFOBSimulationClose() {
        return this;
    }

    public MainPage downloadCurrentData() {
        return this;
    }

    public MainPage goToMainPage() {
        return this;
    }

    public MainPage accessToConfidetialRange(Range range) {
        return this;
    }

    public MainPage applyFilters() {
        return this;
    }

    public MainPage accessModelView() {
        return this;
    }

    public MainPage openRightClickMenu() {
        return this;
    }

    //Login
    public MainPage loginAsPM(Login login) {
        return this;
    }

    //Articles
    public MainPage clickOnArticleTab() {
        return this;
    }

    public MainPage selectArticleWithCheckbox(Article article) {
        return this;
    }

    public MainPage clickDeleteUnderWarningMessage() {
        return this;
    }


    //Ranges

    public MainPage clickOnRangeTab() {
        return this;
    }

    public MainPage setRangeName(String someRange) {
        return this;
    }

    public MainPage setSeason(String season) {
        return this;
    }

    public MainPage setMarketingDepartment(String someDepartment) {
        return this;
    }

    public MainPage clickOnRangeNameField() {
        return this;
    }

    public MainPage clickOnProductDivisionField() {
        return this;
    }

    //Menu Option(Right Click)
    public MainPage clickDelete() {
        return this;
    }

    public MainPage clickOnCreateNewRange() {
        return this;
    }

    public MainPage login(Login login) {
        return this;
    }

    public MainPage rightClickAndSelectNew() {
        //clicking
        return this;
    }

    public Range fillRangeDataAndSave() {
        //filling
        return null;
    }

    public MainPage verifyIndicativeGim(String indicativeGim) {
        return this;
    }

    public MainPage verifyGimDecimalValues(Model model) {
        List<String> allGims = ModelRepository.getAllIndicativeGims(model);
        return this;
    }

    public MainPage verifyIfRangeCreationIsCorrect(Range range) {
        return this;
    }

    public MainPage deleteModelsByContextMenu(Model... models) {
        return this;
    }

    public MainPage deleteModelsByShortcut(Model... models) {
        return this;
    }

    public MainPage editArticleByMenu(Article... articles) {
        return this;
    }

    public MainPage editArticlesByShortcut(Article activeArticle, Article inactiveArticle) {
        return this;
    }

    public void selectCheckboxes(Model... models) {
    }

    public void checkHighlight(Model... models) {
    }

    public MainPage identifyAndClickNumericalColumn(String name) {
        return this;
    }

    public void checkDirectionOfPointer(String nameOfNumericalColumn) {
    }

    public MainPage selectPredefinedFilter(String filterName, Model model) {
        checkApplyingOfFilterInView(model);
        return this;
    }

    public void checkApplyingOfFilterInView(Model modelForCheckingFilter) {
    }

    public MainPage selectAndSaveFilterAttributes(String tab, String[] attributes, Model model) {
        checkApplyingOfFilterInView(model);
        return this;
    }

    public MainPage openFormViewForFirstRecord(Range firstRecord) {
        openRightClickMenu2();
        clickEditRecordOnRightClickMenu();
        return this;
    }

    public void openRightClickMenu2() {
    }


    public void clickEditRecordOnRightClickMenu() {
    }

    public void checkDisplayingOfFormView() {

    }

    public void checkDisablingOfPreviousButton(List<?> recordsOnCurrentPage) {
    }

    public void checkDisablingSaveButton(List<?> recordsOnCurrentPage) {
    }

    public void checkDataInFormView(List<?> recordsOnCurrentPage) {
    }

    public void checkDisablingOfNextButton(List<?> recordsOnCurrentPage) {
    }

    public MainPage clickNextButtonTill75thRecord(List<?> recordsOnCurrentPage) {
        checkDisplayingOfFormView();
        checkDisablingOfPreviousButton(recordsOnCurrentPage);
        checkDisablingSaveButton(recordsOnCurrentPage);
        checkDataInFormView(recordsOnCurrentPage);
        checkDisablingOfNextButton(recordsOnCurrentPage);
        return this;
    }


    public MainPage verifyAscendingOrderSortInColumn(List<?> recordsOnCurrentPage) {
        return this;
    }

    public MainPage identifyPointer(String nameOfNumericalColumn) {
        checkDirectionOfPointer(nameOfNumericalColumn);
        return this;
    }

    public void selectCheckboxesAndCheckRecordsHightlight(Model modelN1, Model modelN2) {
        selectCheckboxes(modelN1, modelN2);
        checkHighlight(modelN1, modelN2);
    }

    public MainPage navigateToColumnFilter() {
        return this;
    }

    public Range drillUpToRange(Model model) {

        return null;
    }

    public Article drillDownToArticles(Model model) {

        return null;
    }

    public void openSettings() {

    }
}
