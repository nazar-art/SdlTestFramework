package net.epam.domain.entities.repositories;

import net.epam.domain.entities.definitions.Model;

import java.util.List;

public class ModelRepository {
    public static Model get() {
        return Model.get(RangeRepository.getRegular()).build();
    }

    public static Model getModelInPlannedStatus() {
//        return Model.get(RangeRepository.getRegular()).setAgeGroup("lnln").build();
        // todo create Model entity in PLANNED state
        return null;
    }

    public static Model getModelInReleasedStatus() {
        // todo create Model entity in RELEASED state
        return null;
    }

    public static Model getModelInReleasedStatusWithProdDivision() {
        // todo this model should have clear division
        return null;
    }

    public static Model getModelInActiveSeason() {
        return null;
    }

    public static Model getModelInInactiveSeason() {
        return null;
    }

    public static Model getRegularModelN1() {
        return null;
    }

    public static Model getRegularModelN2() {
        return null;
    }

    public static List<Model> get75Models() {
        return null;
    }

    public static Model getModelWithAttributesForFilters() {
        return null;
    }

    public static Model getRandomModel() {
        return null;
    }

    public static Model getModelInOnHoldStatus() {
        return null;
    }

    public static Model getModelInDroppedStatus() {
        return null;
    }

    public static Model getModelInInactiveStatus() {
        return null;
    }

    public static Model getModelWithIndicativeGim() {
        //filtering
        return null;
    }

    public static List<String> getAllIndicativeGims(Model model) {
        return null;
    }

    public static Model getReleasedAndPlanned() {
        return null;
    }

    public static Model getRegular() {
        return null;
    }
}
