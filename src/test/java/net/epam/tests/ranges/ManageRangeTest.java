package net.epam.tests.ranges;

import net.epam.domain.entities.definitions.Range;
import net.epam.domain.pages.MainPage;
import org.junit.Test;

import java.util.List;

import static net.epam.domain.entities.repositories.RangeRepository.get75AdHocRanges;


public class ManageRangeTest {

    @Test
    public void verifyNextButtonOnFormView() {
        final List<Range> ranges = get75AdHocRanges();
        final Range firstRange = get75AdHocRanges().get(1);
        MainPage.get().navigateToRangeTab().openFormViewForFirstRecord(firstRange).clickNextButtonTill75thRecord(ranges);
    }
}
