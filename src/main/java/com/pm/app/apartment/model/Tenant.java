package com.pm.app.apartment.model;

public class Tenant extends Person{
    private Unit unit;

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
