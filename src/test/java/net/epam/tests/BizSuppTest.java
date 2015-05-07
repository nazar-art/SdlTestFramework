package net.epam.tests;

import net.epam.domain.entities.definitions.Login;
import net.epam.domain.entities.definitions.Range;
import net.epam.domain.entities.repositories.LoginRepository;
import net.epam.domain.pages.MainPage;
import org.junit.Test;


public class BizSuppTest extends TestBase {

    @Test
    public void businessSupportRoleDefaultedToConfidentialRange() {
        final Login loginPM = LoginRepository.getAdidasPM();
        final Range range = net.epam.domain.entities.repositories.RangeRepository.getRandomRange();
        final Login loginBSU = LoginRepository.getAdidasBSU();

        MainPage.get().loginMP(loginPM).setConfidentialToRange(range).logout().loginMP(loginBSU).accessToConfidetialRange(range);
    }
}
