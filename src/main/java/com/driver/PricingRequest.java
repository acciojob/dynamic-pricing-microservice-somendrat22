package com.driver;

public class PricingRequest {
    private double demandFactor;
    private double competitorPricing;
    private double globalEventsImpact;

    public double getDemandFactor() {
        return demandFactor;
    }

    public void setDemandFactor(double demandFactor) {
        this.demandFactor = demandFactor;
    }

    public double getCompetitorPricing() {
        return competitorPricing;
    }

    public void setCompetitorPricing(double competitorPricing) {
        this.competitorPricing = competitorPricing;
    }

    public double getGlobalEventsImpact() {
        return globalEventsImpact;
    }

    public void setGlobalEventsImpact(double globalEventsImpact) {
        this.globalEventsImpact = globalEventsImpact;
    }
}