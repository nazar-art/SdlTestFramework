package net.epam.tests.ranges;

import net.epam.domain.entities.definitions.Login;
import net.epam.domain.entities.definitions.Range;
import net.epam.domain.entities.repositories.LoginRepository;
import net.epam.domain.pages.MainPage;
import net.epam.tests.TestBase;
import org.junit.Test;


public class CreateRangeTest extends TestBase {

    @Test
    public void createRangeWithRightClick() {

        final Login login = LoginRepository.getAdidasPM();
        Range range = MainPage.get().login(login).navigateToRangeTab().rightClickAndSelectNew().fillRangeDataAndSave();
        MainPage.get().verifyIfRangeCreationIsCorrect(range);

    }

    @Test
    public void createRangeWithWrongData() {
        //failed
    }

}
