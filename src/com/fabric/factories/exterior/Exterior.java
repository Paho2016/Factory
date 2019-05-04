package com.fabric.factories.exterior;

public class Exterior {

    private ExteriorType exteriorType;
    public double priceForExterior;

    Exterior(ExteriorType model) {
        this.exteriorType = model;
    }

    public void setPriceForInterior(double priceForInterior) { this.priceForExterior = priceForInterior;}
    public ExteriorType getExteriorType() { return exteriorType;}
}
