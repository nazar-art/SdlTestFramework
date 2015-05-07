package net.epam.domain.entities.repositories;

import net.epam.domain.entities.definitions.Model;
import net.epam.domain.entities.definitions.Range;

import java.util.LinkedList;
import java.util.List;

public class RangeRepository {

    public static Range getRegular() {
        return Range.get().setSeason("FW10").build();
    }

    public static Range getRangeWithDivision() {
        //todo with clear division
        return null;
    }

    public static List<Range> get75AdHocRanges() {
        return null;
    }

    public static Range getRandomRange() {
        return null;
    }

    public static Range getWithModels(Model... models) {
        return null;
    }

    public static Range getConfidentialRange(Range range) {
        return null;
    }


    public static Range getRange1() {
        return Range.get()
                .setActualCarryOverArticle("1")
                .setActualNewColorArticle("3")
                .setActualGoInMarginPercent("0")
                .setActualNetSalesEURk("0")
                .setActualVolumeUnit("0")
                .build();
    }

    public static Range getRange2() {
        return Range.get()
                .setActualCarryOverArticle("18")
                .setActualNewColorArticle("14")
                .setActualGoInMarginPercent("69.65")
                .setActualNetSalesEURk("5058824.33")
                .setActualVolumeUnit("9377")
                .build();
    }


    public static Range getRange3() {
        return Range.get()
                .setActualCarryOverArticle("33")
                .setActualNewColorArticle("0")
                .setActualGoInMarginPercent("68.2")
                .setActualNetSalesEURk("4826787.92")
                .setActualVolumeUnit("0")
                .build();
    }


    public static List<Range> getRangeList() {
        List l = new LinkedList<Range>();
        l.add(getRange1());
        l.add(getRange2());
        l.add(getRange3());

        return l;
    }


}
