package net.epam.domain.entities.definitions;


public class Range {

    public static RangeBuilder get() {
        return new RangeBuilder();

    }

    private Range(RangeBuilder rb) {
        this.season = rb.season;
        this.marketingDepartment = rb.marketingDepartment;
        this.productDivision = rb.productDivision;
        this.quarter = rb.quarter;
        this.actualCarryOverModel = rb.actualCarryOverModel;
        this.actualTotalArticle = rb.actualTotalArticle;
        this.actualTotallyNewArticle = rb.actualTotallyNewArticle;
        this.confidential = rb.confidentional;
        this.creationDate = rb.creationDate;
        this.numberOfArticle = rb.numberOfArticle;
        this.rangeName = rb.rangeName;
        this.targetGoInMarginPercent = rb.targetGoInMarginPercent;
        this.targetNetSalesEURk = rb.targetNetSalesEURk;
        this.targetVolumeUnit = rb.targetVolumeUnit;
        this.targetModel = rb.targetModel;
        this.targetArticle = rb.targetArticle;
        this.numberOfModels = rb.numberOfModels;
        this.actualCarryOverArticle = rb.actualCarryOverArticle;
        this.actualNewColorArticle = rb.actualNewColorArticle;
        this.actualGoInMarginPercent = rb.actualGoInMarginPercent;
        this.actualNetSalesEURk = rb.actualNetSalesEURk;
        this.actualVolumeUnit = rb.actualVolumeUnit;
        this.actualMarketingForecast = rb.actualMarketingForecast;
        this.actualTotalModel = rb.actualTotalModel;
        this.actualTotallyNewModel = rb.actualTotallyNewModel;
    }

    private final String productDivision;
    private final String quarter;
    private final String season;
    private final String marketingDepartment;
    private final String actualCarryOverModel;
    private final String actualTotalArticle;
    private final String actualTotallyNewArticle;
    private final String confidential;
    private final String creationDate;
    private final String numberOfArticle;
    private final String rangeName;
    private final String targetGoInMarginPercent;
    private final String targetNetSalesEURk;
    private final String targetVolumeUnit;
    private final String targetModel;
    private final String targetArticle;
    private final String numberOfModels;
    private final String actualCarryOverArticle;
    private final String actualNewColorArticle;
    private final String actualGoInMarginPercent;
    private final String actualNetSalesEURk;
    private final String actualVolumeUnit;
    private final String actualMarketingForecast;
    private final String actualTotalModel;
    private final String actualTotallyNewModel;

    public String getSeason() {
        return season;
    }

    public String getMarketingDepartment() {
        return marketingDepartment;
    }

    public String getProductDivision() {
        return productDivision;
    }

    public String getQuarter() {
        return quarter;
    }

    public String getActualCarryOverModel() {
        return actualCarryOverModel;
    }

    public String getActualCarryOverArticle() {
        return actualCarryOverArticle;
    }

    public String getRangeName() {
        return rangeName;
    }

    public String getActualTotalArticle() {
        return actualTotalArticle;
    }

    public String getActualTotallyNewArticle() {
        return actualTotallyNewArticle;
    }

    public String getConfidential() {
        return confidential;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getNumberOfArticle() {
        return numberOfArticle;
    }

    public String getTargetGoInMarginPercent() {
        return targetGoInMarginPercent;
    }

    public String getTargetNetSalesEURk() {
        return targetNetSalesEURk;
    }

    public String getTargetVolumeUnit() {
        return targetVolumeUnit;
    }

    public String getTargetModel() {
        return targetModel;
    }

    public String getTargetArticle() {
        return targetArticle;
    }

    public String getNumberOfModels() {
        return numberOfModels;
    }

    public String getActualNewColorArticle() {
        return actualNewColorArticle;
    }

    public String getActualGoInMarginPercent() {
        return actualGoInMarginPercent;
    }

    public String getActualNetSalesEURk() {
        return actualNetSalesEURk;
    }

    public String getActualVolumeUnit() {
        return actualVolumeUnit;
    }

    public String getActualMarketingForecast() {
        return actualMarketingForecast;
    }

    public String getActualTotalModel() {
        return actualTotalModel;
    }

    public String getActualTotallyNewModel() {
        return actualTotallyNewModel;
    }

    public static class RangeBuilder {
        protected String productDivision;
        protected String actualCarryOverModel;
        protected String actualTotalArticle;
        protected String actualTotallyNewArticle;
        protected String confidentional;
        protected String creationDate;
        protected String numberOfArticle;
        protected String season;
        protected String marketingDepartment;
        protected String quarter;
        protected String rangeName;
        protected String targetGoInMarginPercent;
        protected String targetNetSalesEURk;
        protected String targetVolumeUnit;
        protected String targetModel;
        protected String targetArticle;
        protected String numberOfModels;
        protected String actualCarryOverArticle;
        protected String actualNewColorArticle;
        protected String actualGoInMarginPercent;
        protected String actualNetSalesEURk;
        protected String actualVolumeUnit;
        protected String actualMarketingForecast;
        protected String actualTotalModel;
        protected String actualTotallyNewModel;


        public RangeBuilder setSeason(String season) {
            this.season = season;
            return this;
        }

        public RangeBuilder setMarketingDepartment(String marketingDepartment) {
            this.marketingDepartment = marketingDepartment;
            return this;
        }

        public RangeBuilder setProductDivision(String productDivision) {
            this.productDivision = productDivision;
            return this;
        }


        public RangeBuilder setRangeName(String rangeName) {
            this.rangeName = rangeName;
            return this;
        }

        public RangeBuilder setTargetGoInMarginPercent(String targetGoInMarginPercent) {
            this.targetGoInMarginPercent = targetGoInMarginPercent;
            return this;
        }

        public RangeBuilder setTargetNetSalesEURk(String targetNetSalesEURk) {
            this.targetNetSalesEURk = targetNetSalesEURk;
            return this;
        }

        public RangeBuilder setTargetVolumeUnit(String targetVolumeUnit) {
            this.targetVolumeUnit = targetVolumeUnit;
            return this;
        }

        public RangeBuilder setTargetModel(String targetModel) {
            this.targetModel = targetModel;
            return this;
        }

        public RangeBuilder setTargetArticle(String targetArticle) {
            this.targetArticle = targetArticle;
            return this;
        }

        public RangeBuilder setNumberOfModels(String numberOfModels) {
            this.numberOfModels = numberOfModels;
            return this;
        }

        public RangeBuilder setQuarter(String quarter) {
            this.quarter = quarter;
            return this;
        }

        public RangeBuilder setActualCarryOverModel(String actualCarryOverModel) {
            this.actualCarryOverModel = actualCarryOverModel;
            return this;
        }

        public RangeBuilder setActualTotalArticle(String actualTotalArticle) {
            this.actualTotalArticle = actualTotalArticle;
            return this;
        }

        public RangeBuilder setActualTotallyNewArticle(String actualTotallyNewArticle) {
            this.actualTotallyNewArticle = actualTotallyNewArticle;
            return this;
        }

        public RangeBuilder setConfidentional(String confidentional) {
            this.confidentional = confidentional;
            return this;
        }

        public RangeBuilder setCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public RangeBuilder setNumberOfArticle(String numberOfArticle) {
            this.numberOfArticle = numberOfArticle;
            return this;
        }

        public RangeBuilder setActualCarryOverArticle(String actualCarryOverArticle) {
            this.actualCarryOverArticle = actualCarryOverArticle;
            return this;
        }

        public RangeBuilder setActualNewColorArticle(String actualNewColorArticle) {
            this.actualNewColorArticle = actualNewColorArticle;
            return this;
        }

        public RangeBuilder setActualGoInMarginPercent(String actualGoInMarginPercent) {
            this.actualGoInMarginPercent = actualGoInMarginPercent;
            return this;
        }

        public RangeBuilder setActualNetSalesEURk(String actualNetSalesEURk) {
            this.actualNetSalesEURk = actualNetSalesEURk;
            return this;
        }

        public RangeBuilder setActualVolumeUnit(String actualVolumeUnit) {
            this.actualVolumeUnit = actualVolumeUnit;
            return this;
        }

        public RangeBuilder setActualMarketingForecast(String actualMarketingForecast) {
            this.actualMarketingForecast = actualMarketingForecast;
            return this;
        }

        public RangeBuilder setActualTotalModel(String actualTotalModel) {
            this.actualTotalModel = actualTotalModel;
            return this;
        }

        public RangeBuilder setActualTotallyNewModel(String actualTotallyNewModel) {
            this.actualTotallyNewModel = actualTotallyNewModel;
            return this;
        }

        public Range build() {
            return new Range(this);
        }
    }
}
