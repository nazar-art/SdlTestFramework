package net.epam.domain.entities.repositories;

import net.epam.domain.entities.definitions.Site;

public final class SutConfigurationRepository {

    private SutConfigurationRepository() {
    }

    public static String getFutureQa() {
        return Site.getDefault().getUrl();
    }

    public static String getSystemLoginPageURL(){
        return Site.getSystemLoginPage().getUrl();
    }
}
