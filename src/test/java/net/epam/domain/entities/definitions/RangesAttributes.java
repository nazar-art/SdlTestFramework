package net.epam.domain.entities.definitions;


public class RangesAttributes {
    public enum Article {
        ACTUAL_FOB("actualFOB"),
        ACTUAL_FOB_STATUS("actualFOBStatus"),
        ARTICLE_IMAGE("articleImage"),
        articleNumber("articleNumber"),
        articleStatusCode("articleStatusCode"),
        articleTypeCode("articleTypeCode"),
        betterPlaceCode("betterPlaceCode"),
        bufferFOB("bufferFOB"),
        businessModelCode("businessModelCode"),
        businessUnitCode("businessUnitCode"),
        buyReadyValidationStatus("buyReadyValidationStatus"),
        buyReadyStatusDescr("buyReadyStatusDescr");

        private String value;

        private Article(String value) {
            this.value = value;
        }
    }

}
