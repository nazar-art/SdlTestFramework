package net.epam.tests;

import net.epam.domain.pages.MainPage;
import org.junit.Test;


public class ExportTest extends TestBase {

    @Test
    public void verifyExportToExcelOptionForModelViewForAdidasAfterAppliyingBothRowAndColumnFilter() {
        MainPage.get().accessModelView().applyFilters().downloadCurrentData();
    }
}
