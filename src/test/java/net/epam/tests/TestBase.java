package net.epam.tests;

import junit.framework.Assert;
import net.epam.domain.entities.repositories.SutConfigurationRepository;
import net.epam.domain.pages.DataGrid;
import net.epam.domain.pages.SystemLoginPage;
import net.epam.domain.uimaps.CompositionRoot;
import net.epam.infrastructure.data.InputOutputUtils;
import net.epam.infrastructure.sut.controls.interfaces.TextLabel;
import org.junit.After;
import org.junit.Before;

public class TestBase {

    @Before
    public void init() {
        SystemLoginPage.get().load(SutConfigurationRepository.getSystemLoginPageURL());
        SystemLoginPage.get().enterScreenName(InputOutputUtils.getUsername())
                .enterPassword(InputOutputUtils.getPassword())
                .clickRememberMe()
                .clickSignIn();

        TextLabel spinner;
        spinner = CompositionRoot.getTextLabelClickableByCssSelector("loading-spinner", "spiner");
        Assert.assertTrue("spinner.isAbsent()", spinner.isAbsent());
        Assert.assertTrue("Data Grid not displayed", DataGrid.get().isVisible());
    }


    @After
    public void signOut() {
        SystemLoginPage.get().load(SutConfigurationRepository.getSystemLoginPageURL());
        SystemLoginPage.get().logout().stop();

    }

}
