package net.epam.infrastructure.sut.controls.interfaces;

public interface GradeTable extends Control {

    String[] getStudents();

    void clickStudent(final String name);

}
