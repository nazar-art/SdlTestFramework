package net.epam.tests;


import net.epam.domain.pages.Header;
import org.junit.Test;

public class TestLogin extends TestBase {

    @Test
    public void verifyUserName(){
        Header.get().verifyLoggedUserName();
    }
}
