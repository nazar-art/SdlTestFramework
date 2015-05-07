package net.epam.tests;

import net.epam.domain.entities.repositories.FiltersValueRepository;
import net.epam.domain.entities.repositories.RangeRepository;
import net.epam.domain.entities.repositories.FavoriteRepository;
import net.epam.domain.pages.MainPage;
import org.junit.Test;

public final class TestExample extends TestBase {

    @Test
    public void userPreferenceDependencyTree(){
        String productDivisionName = "NOT YET DEFINED";
        MainPage.get().setProductDivision(productDivisionName)
                .verifyIsCreationActive()
                .clearProductDivision()
                .verifyIsCreationNotActive();
    }

	@Test
	public void createColumnFilter() {
		String filterName = FiltersValueRepository.getUniqueFilter();
		MainPage.get().createAndApplyFilter(filterName,FiltersValueRepository.getFilterValues())
				.applyFilter(filterName)
				.filterExistInList(filterName);
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

	@Test
	public void searchAndCheckRangeForNewFilter() {
		MainPage.get().editFilter(FiltersValueRepository.getFilterValues())
				.searchAndCheckRangeInDataGridCustomFilter(RangeRepository.getRangeList());
	}

	@Test
	public void createAndDeleteFilter() {
		String filterName = "d" + FiltersValueRepository.getUniqueFilter();
		MainPage.get().createAndApplyFilter(filterName,FiltersValueRepository.getFilterValues())
				.applyFilter("Default Filter")
				.deleteFilter(filterName)
				.filterNotExistInList(filterName);
	}

	@Test
	public void openDefaultFilter() {
		MainPage.get().openDefaultFilter()
		.filterExistInList("Default Filter");
	}

}
