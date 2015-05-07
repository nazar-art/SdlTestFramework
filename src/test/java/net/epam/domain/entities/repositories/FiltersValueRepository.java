package net.epam.domain.entities.repositories;

import net.epam.domain.pages.ColumnsFilter;

import java.util.*;

public final class FiltersValueRepository {

    //Models ageGroupCode, businessSegmentCode

    public static Map<String, List<String>> getFilterValues() {
        Map<String, List<String>> filterValues = new HashMap<>();

        filterValues.put("Ranges", /*getRangeIdsValues()*/
                Arrays.asList(
                ColumnsFilter.rangeIds.carryOverArticleCnt.toString(),
                ColumnsFilter.rangeIds.newClrArticleCnt.toString(),
                ColumnsFilter.rangeIds.actGoInMarginPct.toString(),
                ColumnsFilter.rangeIds.actNetSalesAmnt.toString(),
                ColumnsFilter.rangeIds.actBuyingVolume.toString())
        );
        return filterValues;
    }

    private static List<String> getRangeIdsValues() {
        List<String> result = new ArrayList<>();
        for (ColumnsFilter.rangeIds ids : ColumnsFilter.rangeIds.values()) {
            result.add(ids.toString());
        }
        return result;
    }

    public static String getUniqueFilter() {
        String filterName = String.valueOf(System.currentTimeMillis());
        return filterName.substring(filterName.length() - 5, filterName.length()) + "_auto";
    }
}
