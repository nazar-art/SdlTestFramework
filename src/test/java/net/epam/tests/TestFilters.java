package net.epam.tests;

import net.epam.domain.entities.repositories.FiltersValueRepository;
import net.epam.domain.entities.repositories.RangeRepository;
import net.epam.domain.pages.MainPage;

import org.junit.Test;

public final class TestFilters extends TestBase {

	@Test
	public void openDefaultFilter() {
		MainPage.get().openDefaultFilter()
		.filterExistInList("Default Filter");
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

}
