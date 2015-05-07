package net.epam.domain.entities.definitions;


public class Article {

    public static ArticleBuilder get(Model model) {
        return new ArticleBuilder(model);
    }

    private final String actualFob;
    private final String actualFobStatus;
    private final String articleNumber;
    private final String articleType;
    private final String articleStatus;
    private final String bufferFob;
    private final String businessModelAttribute;
    private final String buyReadyValidationStatusDescription;
    private final String businessUnit;
    private final String buyingVolume;
    private final String colorName;
    private final String distributionChannel;
    private final String fulfilmentModelActual;
    private final String fulfilmentModelTarget;
    private final String glblForecastConsolidated;
    private final String leadColorWay;
    private final String marketClassification;
    private final String marketingProposedColor;
    private final String netSalesBV;
    private final String netSalesGlblPlan;

    private final String physicalColorway;
    private final String specialUsageCustomer;
    private final String specialUsage;
    private final String stdMarginActualFOB;
    private final String stdMarginBufferFOB;
    private final String stdMarginBV;
    private final String stdMarginTargetFOB;

    private final Model model;

    public Article(Model model, ArticleBuilder articleBuilder) {
        this.model = model;
        this.actualFob = articleBuilder.actualFob;
        this.actualFobStatus = articleBuilder.actualFobStatus;
        this.articleNumber = articleBuilder.articleNumber;
        this.articleStatus = articleBuilder.articleStatus;
        this.articleType = articleBuilder.articleType;
        this.bufferFob = articleBuilder.bufferFob;
        this.businessModelAttribute = articleBuilder.businessModelAttribute;
        this.businessUnit = articleBuilder.businessUnit;
        this.buyReadyValidationStatusDescription = articleBuilder.buyReadyValidationStatusDescription;
        this.buyingVolume = articleBuilder.buyingVolume;
        this.colorName = articleBuilder.colorName;
        this.distributionChannel = articleBuilder.distributionChannel;
        this.fulfilmentModelActual = articleBuilder.fulfilmentModelActual;
        this.fulfilmentModelTarget = articleBuilder.fulfilmentModelTarget;
        this.glblForecastConsolidated = articleBuilder.glblForecastConsolidated;
        this.leadColorWay = articleBuilder.leadColorWay;
        this.marketClassification = articleBuilder.marketClassification;
        this.marketingProposedColor = articleBuilder.marketingProposedColor;
        this.netSalesBV = articleBuilder.netSalesBV;
        this.netSalesGlblPlan = articleBuilder.netSalesGlblPlan;

        this.physicalColorway = articleBuilder.physicalColorway;
        this.specialUsageCustomer = articleBuilder.specialUsageCustomer;
        this.specialUsage = articleBuilder.specialUsage;
        this.stdMarginActualFOB = articleBuilder.stdMarginActualFOB;
        this.stdMarginBufferFOB = articleBuilder.stdMarginBufferFOB;
        this.stdMarginBV = articleBuilder.stdMarginBV;
        this.stdMarginTargetFOB = articleBuilder.stdMarginTargetFOB;
    }

    public String getActualFob() {
        return actualFob;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public String getActualFobStatus() {
        return actualFobStatus;
    }

    public String getArticleStatus() {
        return articleStatus;
    }

    public String getArticleType() {
        return articleType;
    }

    public String getBufferFob() {
        return bufferFob;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public String getBusinessModelAttribute() {
        return businessModelAttribute;
    }

    public String getBuyReadyValidationStatusDescription() {
        return buyReadyValidationStatusDescription;
    }

    public String getBuyingVolume() {
        return buyingVolume;
    }

    public String getColorName() {
        return colorName;
    }

    public String getDistributionChannel() {
        return distributionChannel;
    }

    public String getFulfilmentModelActual() {
        return fulfilmentModelActual;
    }

    public String getFulfilmentModelTarget() {
        return fulfilmentModelTarget;
    }

    public String getGlblForecastConsolidated() {
        return glblForecastConsolidated;
    }

    public String getLeadColorWay() {
        return leadColorWay;
    }

    public String getMarketClassification() {
        return marketClassification;
    }

    public String getMarketingProposedColor() {
        return marketingProposedColor;
    }

    public String getNetSalesBV() {
        return netSalesBV;
    }

    public String getNetSalesGlblPlan() {
        return netSalesGlblPlan;
    }

    public String getPhysicalColorway() {
        return physicalColorway;
    }

    public String getSpecialUsageCustomer() {
        return specialUsageCustomer;
    }

    public String getSpecialUsage() {
        return specialUsage;
    }

    public String getStdMarginActualFOB() {
        return stdMarginActualFOB;
    }

    public String getStdMarginBufferFOB() {
        return stdMarginBufferFOB;
    }

    public String getStdMarginBV() {
        return stdMarginBV;
    }

    public String getStdMarginTargetFOB() {
        return stdMarginTargetFOB;
    }

    //getters from Model
    public String getBetterPlace() {
        return model.getBetterPlace();
    }

    public String getBuyReadyValidatorStatus() {
        return model.getBuyReadyValidatorStatus();
    }

    public String getCarryOverFromSeason() {
        return model.getCarryOverFromSeason();
    }

    public String getCreationDate() {
        return model.getCreationDate();
    }

    public String getDevelopmentTrack() {
        return model.getDevelopmentTrack();
    }

    public String getDevelopmentType() {
        return model.getDevelopmentType();
    }

    public String getEarliestBuyReadyDate() {
        return model.getEarliestBuyReadyDate();
    }

    public String getGlblGoInMarginActual() {
        return model.getGlblGoInMarginActual();
    }

    public String getGlblGoInMarginBuffer() {
        return model.getGlblGoInMarginBuffer();
    }

    public String getGlblGoInMarginBV() {
        return model.getGlblGoInMarginBV();
    }

    public String getGlblGoInMarginTarget() {
        return model.getGlblGoInMarginTarget();
    }

    public String getLifecycleStatus() {
        return model.getLifecycleStatus();
    }

    public String getLifecycleStatusSetOn() {
        return model.getLifecycleStatusSetOn();
    }

    public String getMarketingDepartment() {
        return model.getMarketingDepartment();
    }

    public String getMarketingForecast() {
        return model.getMarketingForecast();
    }

    public String getPriceSegment() {
        return model.getPriceSegment();
    }

    public String getProductManager() {
        return model.getProductManager();
    }

    public String getQuarter() {
        return model.getQuarter();
    }

    public String getReplenishment() {
        return model.getReplenishment();
    }

    public String getRetailExitDate() {
        return model.getRetailExitDate();
    }

    public String getRetailIntroDate() {
        return model.getRetailIntroDate();
    }

    public String getRrp() {
        return model.getRrp();
    }

    public String getRrpCurrency() {
        return model.getRrpCurrency();
    }

    public String getSellingRegion() {
        return model.getSellingRegion();
    }

    public String getTargetConsumer() {
        return model.getTargetConsumer();
    }

    public String getTargetFOB() {
        return model.getTargetFOB();
    }

    public String getTargetFOBCurrency() {
        return model.getTargetFOBCurrency();
    }

    public String getTransportationLeadTime() {
        return model.getTransportationLeadTime();
    }

    public static class ArticleBuilder {
        private String actualFob;
        private String actualFobStatus;
        private String articleNumber;
        private String articleType;
        private String articleStatus;
        private String bufferFob;
        private String businessModelAttribute;
        private String businessUnit;
        private String buyReadyValidationStatusDescription;
        private String buyingVolume;
        private String colorName;
        private String distributionChannel;
        private String fulfilmentModelActual;
        private String fulfilmentModelTarget;
        private String glblForecastConsolidated;
        private String leadColorWay;
        private String marketClassification;
        private String marketingProposedColor;
        private String netSalesBV;
        private String netSalesGlblPlan;

        private String physicalColorway;
        private String specialUsageCustomer;
        private String specialUsage;
        private String stdMarginActualFOB;
        private String stdMarginBufferFOB;
        private String stdMarginBV;
        private String stdMarginTargetFOB;
        private Model model;


        public ArticleBuilder(Model model) {
            this.model = model;
        }

        public ArticleBuilder setActualFob(String actualFob) {
            this.actualFob = actualFob;
            return this;
        }

        public ArticleBuilder setActualFobStatus(String actualFobStatus) {
            this.actualFobStatus = actualFobStatus;
            return this;
        }

        public ArticleBuilder setArticleNumber(String articleNumber) {
            this.articleNumber = articleNumber;
            return this;
        }

        public ArticleBuilder setArticleType(String articleType) {
            this.articleType = articleType;
            return this;
        }

        public ArticleBuilder setFulfilmentModelTarget(String fulfilmentModelTarget) {
            this.fulfilmentModelTarget = fulfilmentModelTarget;
            return this;
        }

        public ArticleBuilder setFulfilmentModelActual(String fulfilmentModelActual) {
            this.fulfilmentModelActual = fulfilmentModelActual;
            return this;
        }

        public ArticleBuilder setColorName(String colorName) {
            this.colorName = colorName;
            return this;
        }

        public ArticleBuilder setDistributionChannel(String distributionChannel) {
            this.distributionChannel = distributionChannel;
            return this;
        }

        public ArticleBuilder setBufferFob(String bufferFob) {
            this.bufferFob = bufferFob;
            return this;
        }

        public ArticleBuilder setBuyingVolume(String buyingVolume) {
            this.buyingVolume = buyingVolume;
            return this;
        }

        public ArticleBuilder setBuyReadyValidationStatusDescription(String buyReadyValidationStatusDescription) {
            this.buyReadyValidationStatusDescription = buyReadyValidationStatusDescription;
            return this;
        }

        public ArticleBuilder setBusinessUnit(String businessUnit) {
            this.businessUnit = businessUnit;
            return this;
        }

        public ArticleBuilder setBusinessModelAttribute(String businessModelAttribute) {
            this.businessModelAttribute = businessModelAttribute;
            return this;
        }

        public ArticleBuilder setArticleStatus(String articleStatus) {
            this.articleStatus = articleStatus;
            return this;
        }

        public ArticleBuilder setGlblForecastConsolidated(String glblForecastConsolidated) {
            this.glblForecastConsolidated = glblForecastConsolidated;
            return this;
        }

        public ArticleBuilder setNetSalesBV(String netSalesBV) {
            this.netSalesBV = netSalesBV;
            return this;
        }

        public ArticleBuilder setNetSalesGlblPlan(String netSalesGlblPlan) {
            this.netSalesGlblPlan = netSalesGlblPlan;
            return this;
        }

        public ArticleBuilder setMarketingProposedColor(String marketingProposedColor) {
            this.marketingProposedColor = marketingProposedColor;
            return this;
        }

        public ArticleBuilder setMarketClassification(String marketClassification) {
            this.marketClassification = marketClassification;
            return this;
        }

        public ArticleBuilder setLeadColorWay(String leadColorWay) {
            this.leadColorWay = leadColorWay;
            return this;
        }

        public ArticleBuilder setPhysicalColorway(String physicalColorway) {
            this.physicalColorway = physicalColorway;
            return this;
        }

        public ArticleBuilder setSpecialUsageCustomer(String specialUsageCustomer) {
            this.specialUsageCustomer = specialUsageCustomer;
            return this;
        }

        public ArticleBuilder setSpecialUsage(String specialUsage) {
            this.specialUsage = specialUsage;
            return this;
        }

        public ArticleBuilder setStdMarginActualFOB(String stdMarginActualFOB) {
            this.stdMarginActualFOB = stdMarginActualFOB;
            return this;
        }

        public ArticleBuilder setStdMarginBufferFOB(String stdMarginBufferFOB) {
            this.stdMarginBufferFOB = stdMarginBufferFOB;
            return this;
        }

        public ArticleBuilder setStdMarginBV(String stdMarginBV) {
            this.stdMarginBV = stdMarginBV;
            return this;
        }

        public ArticleBuilder setStdMarginTargetFOB(String stdMarginTargetFOB) {
            this.stdMarginTargetFOB = stdMarginTargetFOB;
            return this;
        }

        public Article build() {
            return new Article(model, this);
        }
    }
}
