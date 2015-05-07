package net.epam.tests;

import net.epam.domain.entities.definitions.Login;
import net.epam.domain.entities.repositories.LoginRepository;
import net.epam.domain.pages.MainPage;
import org.junit.Test;


public class LoginAsReebokPMTest extends TestBase {

    @Test
    public void verifyLoginForReebok() {
        final Login loginPM = LoginRepository.getReebokPM();

        MainPage.get().loginPMreebok(loginPM).
                validateReebokLogo().
                validateUserName().
                logout();
    }
}
