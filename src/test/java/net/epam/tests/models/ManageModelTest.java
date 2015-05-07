package net.epam.tests.models;

import net.epam.domain.entities.definitions.Login;
import net.epam.domain.entities.definitions.Model;
import net.epam.domain.entities.definitions.Range;
import net.epam.domain.entities.repositories.LoginRepository;
import net.epam.domain.entities.repositories.ModelRepository;
import net.epam.domain.entities.repositories.RangeRepository;
import net.epam.domain.pages.MainPage;
import net.epam.domain.pages.ProductPreference;
import net.epam.tests.TestBase;
import org.junit.Test;

import java.util.List;

import static net.epam.domain.entities.repositories.ModelRepository.*;
import static net.epam.domain.entities.repositories.RangeRepository.get75AdHocRanges;

public class ManageModelTest extends TestBase {

    // PASSED CASES
    @Test
    public void deleteModelInPlannedState() {
        final Model plannedModel = ModelRepository.getModelInPlannedStatus();
        // todo finish test implementation

        MainPage.get().deleteModel(plannedModel);
    }

    @Test
    public void checkFieldValidationInGeneralInfo() {
        final Model plannedModelOne = ModelRepository.getModelInPlannedStatus();
        final Model plannedModelTwo = ModelRepository.getModelInPlannedStatus();
        final Model releasedModelOne = ModelRepository.getModelInReleasedStatus();
        final Model releasedModelTwo = ModelRepository.getModelInReleasedStatus();
        // todo finish test implementation
        MainPage.get().checkEditForPlanned(plannedModelOne, plannedModelTwo)
                .checkEditForReleased(releasedModelOne, releasedModelTwo);
    }

    // FAILED CASES
    @Test
    public void checkCarryOverModelWithArticles() {
        Model modelInReleasedStatus = ModelRepository.getModelInReleasedStatusWithProdDivision();
        Range rangeWithDivision = RangeRepository.getRangeWithDivision();
        // todo all carry over have approximately the same entities instances
    }

    @Test
    public void checkCopyModelLastCopyCached() {
        final Model plannedModel = ModelRepository.getModelInPlannedStatus();
        final Model releasedModel = ModelRepository.getModelInReleasedStatus();
        // todo finish test implementation

    }

    @Test
    public void createRangeLayoutDrillDownToModels() {
        final Range range = RangeRepository.getRandomRange();
        MainPage.get().drillDownToModels(range);
    }

    @Test
    public void deleteMultipleRangeHavingPlannedReleasedOnHoldDroppedAndInactiveStatus() {
        final Model plannedModel = ModelRepository.getModelInPlannedStatus();
        final Model releasedModel = ModelRepository.getModelInReleasedStatus();
        final Model onHoldModel = ModelRepository.getModelInOnHoldStatus();
        final Model droppedModel = ModelRepository.getModelInDroppedStatus();
        final Model inactiveModel = ModelRepository.getModelInInactiveStatus();
        final Range range = RangeRepository.getWithModels(plannedModel, releasedModel, onHoldModel, droppedModel, inactiveModel);

        MainPage.get().deleteRangeViaShortCut(range).validateWarningMessage().warningMessagePressDelete().warningMessagePressIgnore();
    }

    @Test
    public void editRangeByPressingEnterKeyForTextBox() {
        final Login login = LoginRepository.getAdidasPM();
        //TODO how apply filters
        final Range oldRange = RangeRepository.getRandomRange();
        final Range newRange = RangeRepository.getRandomRange();

        MainPage.get().loginMP(login).editRangeAttribute(oldRange, newRange);
    }

    @Test
    public void editRangeMassEdit() {
        final Login login = LoginRepository.getAdidasPM();
        //TODO how apply filters
        final Range firstRange = RangeRepository.getRandomRange();
        final Range secondRange = RangeRepository.getRandomRange();

        final String[] attributes = new String[]{};

        MainPage.get().loginMP(login).copyRangeAttributes(firstRange, secondRange, attributes).saveChanges();
    }

    @Test
    public void editRangeValidationMessages() {
        //TODO is the same????????
        final Login login = LoginRepository.getAdidasPM();

        final Range firstRange = RangeRepository.getRandomRange();
        final Range secondRange = RangeRepository.getRandomRange();

        final String[] attributes = new String[]{};

        MainPage.get().loginMP(login).copyRangeAttributes(firstRange, secondRange, attributes).saveChanges();
    }

    @Test
    public void markRangeAsConfidentialConfidentialityCrossPMsAccess1() {
        final Login login = LoginRepository.getAdidasPM();
        final Range range = RangeRepository.getRandomRange();

        MainPage.get().loginMP(login).setConfidentialToRange(range);
    }

    @Test
    public void createModelRangeDrillUp() {
        ModelRepository.getModelInReleasedStatus();
        //todo pass cell to mouse over
        MainPage.get().drillUpToRange(ModelRepository.getModelInPlannedStatus());
        //todo assertions
    }

    @Test
    public void createModelArticleDrillDown() {
        final Model allModels = ModelRepository.getRegular();
        //todo pass cell to mouse over
        MainPage.get().drillDownToArticles(allModels);
        //todo assertions
    }

    @Test
    public void productPreferenceSaveOption() {
        MainPage.get().openSettings();
        //todo edit attribute values
        ProductPreference.get().expandProductPreferences().enterAttributeValue("asasasa").save();
    }

    @Test
    public void windowCloseNotSaved() {
        MainPage.get().openSettings();
        //todo attributes under each section - General info, Coding & Production, Timing & Customer
        ProductPreference.get().expandProductPreferences().enterAttributeValue("asasasa").enterAttributeValue("fefef").closeWithoutSave();
    }

    @Test
    public void verifyModelsInactiveSeasonNotBeDeleted() {
        final Model activeModel = net.epam.domain.entities.repositories.ModelRepository.getModelInActiveSeason();
        final Model inactiveModel = net.epam.domain.entities.repositories.ModelRepository.getModelInInactiveSeason();
        MainPage.get().navigateToModelTab().deleteModelsByContextMenu(activeModel, inactiveModel).deleteModelsByShortcut(activeModel, inactiveModel);
    }

    @Test
    public void verifyNonSequentiallySelectionUsingCheckboxes() {
        final Model modelN1 = getRegularModelN1();
        final Model modelN2 = getRegularModelN2();
        MainPage.get().navigateToModelTab().selectCheckboxesAndCheckRecordsHightlight(modelN1, modelN2);
    }

    @Test
    public void verifyAscendingOrderSortForColumn() {
        List<Model> models = get75Models();
        String nameOfNumericalColumn = "Marketing Forecast";
        MainPage.get().navigateToModelTab().identifyAndClickNumericalColumn(nameOfNumericalColumn).verifyAscendingOrderSortInColumn(models).identifyPointer(nameOfNumericalColumn);
    }

    @Test
    public void verifyNextButtonOnFormView() {
        final List<Model> models = get75Models();
        MainPage.get().navigateToModelTab().openFormViewForFirstRecord(get75AdHocRanges().get(1)).clickNextButtonTill75thRecord(models);
    }
}
