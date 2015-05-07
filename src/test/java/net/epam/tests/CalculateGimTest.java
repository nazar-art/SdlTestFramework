package net.epam.tests;

import net.epam.domain.entities.definitions.Login;
import net.epam.domain.entities.definitions.Model;
import net.epam.domain.entities.repositories.LoginRepository;
import net.epam.domain.entities.repositories.ModelRepository;
import net.epam.domain.pages.MainPage;
import org.junit.Test;


public class CalculateGimTest extends TestBase {

    @Test
    public void mandatoryAttributes() {
        //failed
    }

    @Test
    public void mandatoryPartialEmpty() {
        //failed
    }

    @Test
    public void multipleModelsMandatoryData() {
        //failed
    }


    @Test
    public void gimFieldValidation() {
        //step1
        final Login login = LoginRepository.getAdidasPM();
        final Model model = ModelRepository.getModelWithIndicativeGim();

        MainPage.get().login(login).navigateToModelTab().verifyIndicativeGim(model.getIndicativeGim()).verifyGimDecimalValues(model);

    }


}
