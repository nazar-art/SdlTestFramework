package net.epam.tests;


import net.epam.domain.entities.definitions.Model;
import net.epam.domain.pages.MainPage;
import org.junit.Test;

import static net.epam.domain.entities.repositories.ModelRepository.getModelWithAttributesForFilters;

public class ManageColumnFilerTest {

    @Test
    public void verifyFiltersAreEditable() {
        final Model model = getModelWithAttributesForFilters();
        String filterName = "Simulation";
        String tab = "Model";
        String[] attributes = {"Quarter", "Range Name", "Retail Exit Date"};
        MainPage.get().navigateToColumnFilter().selectPredefinedFilter(filterName, model).selectAndSaveFilterAttributes(tab, attributes, model);
    }


}
