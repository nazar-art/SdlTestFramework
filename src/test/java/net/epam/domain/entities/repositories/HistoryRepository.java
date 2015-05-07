package net.epam.domain.entities.repositories;

import net.epam.domain.entities.definitions.History;

public class HistoryRepository {
    public static History showHistoryForTimelines() {
        return
                History.get().setFromDate("2.01.2015").setToDate("2.03.2015").build();
    }

    public static History showHistoryForTimeLinesToCurrentDate() {
        return
                History.get().setFromDate("month ago").setToDate("today").build();
    }
}