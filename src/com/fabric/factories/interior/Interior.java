package com.fabric.factories.interior;

public class Interior {

    private InteriorType interiorType;
    public double priceForInterior;

    Interior(InteriorType model) {
        this.interiorType = model;
    }

    public void setPriceForInterior(double priceForInterior) {
        this.priceForInterior = priceForInterior;
    }
    public InteriorType getInteriorType() { return interiorType; }
}
