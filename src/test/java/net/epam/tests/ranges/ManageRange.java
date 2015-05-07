package net.epam.tests.ranges;

import net.epam.domain.entities.definitions.Login;
import net.epam.domain.entities.repositories.LoginRepository;
import net.epam.domain.pages.MainPage;
import net.epam.tests.TestBase;
import org.junit.Test;

public class ManageRange extends TestBase {

    @Test
    public void rangeNameAndProductDivisionEditTest() {
        final Login login = LoginRepository.getAdidasPM();
        MainPage.get().loginAsPM(login).clickOnRangeTab().openRightClickMenu().clickOnCreateNewRange()
                .setProductDivision("someDiv").setRangeName("name").setMarketingDepartment("department").setSeason("SS16")
                .clickOnProductDivisionField().clickOnRangeNameField();
    }

    @Test
    public void validationSplCharForRangeNameTest() {
        final Login login = LoginRepository.getAdidasPM();
        MainPage.get().loginAsPM(login).clickOnRangeTab().openRightClickMenu().clickOnCreateNewRange().setRangeName("$*_*$");
    }

    @Test
    public void validationAlphanumericCharForRangeNameTest() {
        final Login login = LoginRepository.getAdidasPM();
        MainPage.get().loginAsPM(login).clickOnRangeTab().openRightClickMenu().clickOnCreateNewRange().setRangeName("3724683");
    }
}
