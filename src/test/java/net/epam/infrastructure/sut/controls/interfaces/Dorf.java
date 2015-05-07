package net.epam.infrastructure.sut.controls.interfaces;

public interface Dorf extends Control {

    TextLabel getTitle();

    TextLabel getStatistics();

    TextLabel getSelfCorrectedWord(String selfCorrectedWord);

    TextLabel getWrongWord(String selfCorrectedWord);

    TextLabel getStrikedWord(String selfCorrectedWord);

}
