package net.epam.tests;

import net.epam.domain.pages.MainPage;
import org.junit.Test;


public class ActionBarTest extends TestBase {

    @Test
    public void verifyThePopUpDisappearsForArticleViewWhenSwitchedFromModelView() {
        MainPage.get().protoOrderingInvoke()
                .hangtagInvoke().hangtagClose()
                .ILALabelingInvoke().ILALabelingClose()
                .GIMFOBSimulationInvoke().GIMFOBSimulationClose()
                .hangtagInvoke().hangtagClose()
                .goToMainPage();
    }
}
