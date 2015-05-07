package net.epam.domain.entities.repositories;

public class FavoriteRepository {

    public static String getUniqueView() {
        String filterName = String.valueOf(System.currentTimeMillis());
        return filterName.substring(filterName.length() - 5, filterName.length()) + "_auto";
    }
}
