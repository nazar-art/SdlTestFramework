package net.epam.domain.entities.definitions;

import net.epam.infrastructure.data.InputOutputUtils;

public final class Site {

    private final String url;

    public static Site getDefault() {
        return new Site(InputOutputUtils.getFutureQA());
    }

    public static Site getSystemLoginPage(){
        return new Site(InputOutputUtils.getSystemLoginPageURL());
    }

    private Site(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
