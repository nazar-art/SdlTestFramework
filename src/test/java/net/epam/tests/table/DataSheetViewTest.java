package net.epam.tests.table;

import net.epam.domain.pages.MainPage;
import net.epam.tests.TestBase;
import org.junit.Test;

public class DataSheetViewTest extends TestBase {

    // PASSED
    @Test
    public void verifyChooseFilterFromSavedViews() {
        // todo this case verify filter functional with Models / Range / Article
        // todo add input parameters what should be displayed on page
        MainPage.get().createNewColumnFilter("Filter name"/*some list of filter parameters, select values*/)
                .selectSavedFilter("Filter name")
                .checkDataSheetContent(/*some list of passed to filter parameters, presence on page*/);
    }

    // FAILED
    @Test
    public void verifyColumnFilterForModelView() {
        // todo this check filter selecting / deselecting column filter for Model
        // and check it influence on page
    }
}
