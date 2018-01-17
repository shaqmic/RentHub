package com.pm.app.apartment.model;

import java.util.List;

public class Location {
    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private List<Unit> units;
    private Address address;
}
