package net.epam.domain.pages;

import net.epam.domain.entities.definitions.*;
import net.epam.domain.entities.repositories.ModelRepository;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class MainPageTwo {


    public static MainPageTwo get() {
        return new MainPageTwo();
    }


    ColumnsFilter columnsFilter;


    public MainPageTwo editFilter(Map<String, List<String>> filters) {
        columnsFilter.editFilter("Default Filter", filters);
        return this;
    }

    public MainPageTwo deleteFilter(String filterName) {
        columnsFilter.openFilters();
        columnsFilter.deleteFilter(filterName);
        return this;
    }


    public MainPageTwo createAndApplyFilter(String filterName, Map<String, List<String>> filterValues) {
        columnsFilter.createAndApply(filterName, filterValues);
        return this;
    }

    public MainPageTwo applyFilter(String filterName) {
        columnsFilter.openFilters();
        columnsFilter.applyFilter(filterName);
        return this;
    }

    public MainPageTwo filterNotExistInList(String filterName) {
        columnsFilter.openFilters();
        Assert.assertTrue(columnsFilter.filterPresent(filterName), "Filter still in list");
        return this;
    }

    public MainPageTwo searchAndCheckRangeInDataGridCustomFilter(List<Range> ranges) {
        for (Range range : ranges) {
            DataGrid.get()
                    .searchAndCheckRangeInDataGridCustomFilter(range);
        }
        return this;
    }

    private MainPageTwo() {
        columnsFilter = ColumnsFilter.get();
    }

    public MainPageTwo createNewColumnFilter(String filterName) {
        // todo
        return this;
    }

    public MainPageTwo selectSavedFilter(String filterName) {
        return this;
    }

    public MainPageTwo checkDataSheetContent() {
        return this;
    }

    public MainPageTwo deleteModel(Model plannedModel) {
        // todo
        return this;
    }

    public MainPageTwo checkEditForPlanned(Model... plannedModels) {
        // todo
        return this;
    }

    public MainPageTwo checkEditForReleased(Model... models) {
        // todo
        return this;
    }

    public MainPageTwo loginPMreebok(Login login) {
        return this;
    }

    public MainPageTwo validateReebokLogo() {
        return this;
    }

    public MainPageTwo validateUserName() {
        return this;
    }

    public MainPageTwo loginUser(Login login) {
        return this;
    }

    public MainPageTwo logout() {
        return this;
    }

    public MainPageTwo clickOnSearchTextBox() {
        return this;
    }

    public MainPageTwo searchByAttribute(SearchValue search) {
        return this;
    }

    public MainPageTwo verifySearchResult() {
        return this;
    }

    public MainPageTwo selectSearchOption() {
        return this;
    }

    public MainPageTwo verifyAutoSuggestionForSearch() {
        return this;
    }

    public MainPageTwo verifyNavigationOnSuggestionOptionWithKeys() {
        return this;
    }

    public MainPageTwo selectOptionFromAutoSuggestionWithEnterKey() {
        return this;
    }

    public MainPageTwo navigateToRangeTab() {
        return this;
    }

    public MainPageTwo verifySearchInType() {
        return this;
    }

    public MainPageTwo navigateToModelTab() {
        return this;
    }

    public MainPageTwo navigateToArticleTab() {
        return this;
    }

    public MainPageTwo verifyCountInRowFilter() {
        return this;
    }

    public MainPageTwo clickOnSearchIcon() {
        return this;
    }

    public MainPageTwo openRowFilter() {
        return this;
    }

    public MainPageTwo verifyRowFilterIsApplied() {
        return this;
    }

    public MainPageTwo verifyRowFilterAttributeCheckBoxes() {
        return this;
    }

    public MainPageTwo selectRandomImageInRow() {
        return this;
    }

    public MainPageTwo verifyFullBlowImageSize() {
        return this;
    }

    public MainPageTwo drillDownToModels(Range range) {
        return this;
    }

    public MainPageTwo deleteRangeViaShortCut(Range range) {
        return this;
    }

    public MainPageTwo warningMessagePressDelete() {
        return this;
    }

    public MainPageTwo warningMessagePressIgnore() {
        return this;
    }

    public MainPageTwo validateWarningMessage() {
        return this;
    }

    public MainPageTwo loginMP(Login login) {
        return this;
    }

    public MainPageTwo editRangeAttribute(Range currentRange, Range newRange) {
        return this;
    }

    public MainPageTwo copyRangeAttributes(Range currentRange, Range targetRange, String[] attributes) {
        return this;
    }

    public MainPageTwo saveChanges() {
        return this;
    }

    public MainPageTwo setConfidentialToRange(Range range) {
        return this;
    }

    public MainPageTwo protoOrderingInvoke() {
        return this;
    }

    public MainPageTwo hangtagInvoke() {
        return this;
    }

    public MainPageTwo hangtagClose() {
        return this;
    }

    public MainPageTwo ILALabelingInvoke() {
        return this;
    }

    public MainPageTwo ILALabelingClose() {
        return this;
    }

    public MainPageTwo GIMFOBSimulationInvoke() {
        return this;
    }

    public MainPageTwo GIMFOBSimulationClose() {
        return this;
    }

    public MainPageTwo downloadCurrentData() {
        return this;
    }

    public MainPageTwo goToMainPage() {
        return this;
    }

    public MainPageTwo accessToConfidetialRange(Range range) {
        return this;
    }

    public MainPageTwo applyFilters() {
        return this;
    }

    public MainPageTwo accessModelView() {
        return this;
    }

    public MainPageTwo openRightClickMenu() {
        return this;
    }

    //Login
    public MainPageTwo loginAsPM(Login login) {
        return this;
    }

    //Articles
    public MainPageTwo clickOnArticleTab() {
        return this;
    }

    public MainPageTwo selectArticleWithCheckbox(Article article) {
        return this;
    }

    public MainPageTwo clickDeleteUnderWarningMessage() {
        return this;
    }


    //Ranges

    public MainPageTwo clickOnRangeTab() {
        return this;
    }

    public MainPageTwo setProductDivision(String value) {
        return this;
    }

    public MainPageTwo setRangeName(String someRange) {
        return this;
    }

    public MainPageTwo setSeason(String season) {
        return this;
    }

    public MainPageTwo setMarketingDepartment(String someDepartment) {
        return this;
    }

    public MainPageTwo clickOnRangeNameField() {
        return this;
    }

    public MainPageTwo clickOnProductDivisionField() {
        return this;
    }

    //Menu Option(Right Click)
    public MainPageTwo clickDelete() {
        return this;
    }

    public MainPageTwo clickOnCreateNewRange() {
        return this;
    }

    public MainPageTwo login(Login login) {
        return this;
    }

    public MainPageTwo rightClickAndSelectNew() {
        //clicking
        return this;
    }

    public Range fillRangeDataAndSave() {
        //filling
        return null;
    }

    public MainPageTwo verifyIndicativeGim(String indicativeGim) {
        return this;
    }

    public MainPageTwo verifyGimDecimalValues(Model model) {
        List<String> allGims = ModelRepository.getAllIndicativeGims(model);
        return this;
    }

    public MainPageTwo verifyIfRangeCreationIsCorrect(Range range) {
        return this;
    }

    public MainPageTwo deleteModelsByContextMenu(Model... models) {
        return this;
    }

    public MainPageTwo deleteModelsByShortcut(Model... models) {
        return this;
    }

    public MainPageTwo editArticleByMenu(Article... articles) {
        return this;
    }

    public MainPageTwo editArticlesByShortcut(Article activeArticle, Article inactiveArticle) {
        return this;
    }

    public void selectCheckboxes(Model... models) {
    }

    public void checkHighlight(Model... models) {
    }

    public MainPageTwo identifyAndClickNumericalColumn(String name) {
        return this;
    }

    public void checkDirectionOfPointer(String nameOfNumericalColumn) {
    }

    public MainPageTwo selectPredefinedFilter(String filterName, Model model) {
        checkApplyingOfFilterInView(model);
        return this;
    }

    public void checkApplyingOfFilterInView(Model modelForCheckingFilter) {
    }

    public MainPageTwo selectAndSaveFilterAttributes(String tab, String[] attributes, Model model) {
        checkApplyingOfFilterInView(model);
        return this;
    }

    public MainPageTwo openFormViewForFirstRecord(Range firstRecord) {
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

    public MainPageTwo clickNextButtonTill75thRecord(List<?> recordsOnCurrentPage) {
        checkDisplayingOfFormView();
        checkDisablingOfPreviousButton(recordsOnCurrentPage);
        checkDisablingSaveButton(recordsOnCurrentPage);
        checkDataInFormView(recordsOnCurrentPage);
        checkDisablingOfNextButton(recordsOnCurrentPage);
        return this;
    }


    public MainPageTwo verifyAscendingOrderSortInColumn(List<?> recordsOnCurrentPage) {
        return this;
    }

    public MainPageTwo identifyPointer(String nameOfNumericalColumn) {
        checkDirectionOfPointer(nameOfNumericalColumn);
        return this;
    }

    public void selectCheckboxesAndCheckRecordsHightlight(Model modelN1, Model modelN2) {
        selectCheckboxes(modelN1, modelN2);
        checkHighlight(modelN1, modelN2);
    }

    public MainPageTwo navigateToColumnFilter() {
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

    public MainPageTwo selectReleasedModel() {
        return this;
    }

    public MainPageTwo selectReleasedArticle() {
        return this;
    }

    public HistoryPage selectHistoryOptionFromRightClickMenu() {
        return null;
    }
}
