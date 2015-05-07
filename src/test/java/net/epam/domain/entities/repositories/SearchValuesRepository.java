package net.epam.domain.entities.repositories;

import net.epam.domain.entities.definitions.SearchValue;

public class SearchValuesRepository {
    public static SearchValue searchByAttribute() {
        return SearchValue.get().setSearchKeyword("new").build();
    }
}
