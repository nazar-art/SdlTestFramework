package net.epam.infrastructure.sut.controls.interfaces;

public interface Browser {

    void stop();

    void load(String path);

    void refresh();

    void getScreenShot();

}
