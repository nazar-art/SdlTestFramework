package net.epam.infrastructure.sut.controls.interfaces;

public interface GradeColumnHeader extends Control {

    boolean isSortedByAsc();

    boolean isSortedByDesc();

    boolean isUnsorted();

    void sortByAsc();

    void sortByDesc();

}
