package net.epam.tests;

import net.epam.domain.entities.definitions.Login;
import net.epam.domain.entities.repositories.LoginRepository;
import net.epam.domain.pages.MainPage;
import org.junit.Test;

public class ImageTest extends TestBase {

    @Test

    public void verifyImageIsClickableInImageCarousal() {

        final Login loginUser = LoginRepository.getAdidasUser();

        MainPage.get().loginUser(loginUser).
                navigateToArticleTab().
                selectRandomImageInRow().
                verifyFullBlowImageSize();
    }
}
