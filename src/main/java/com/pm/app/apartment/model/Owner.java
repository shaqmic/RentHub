package com.pm.app.apartment.model;

import java.util.List;

public class Owner extends Person {
    public List<Location> getOwnedLocations() {
        return ownedLocations;
    }

    public void setOwnedLocations(List<Location> ownedLocations) {
        this.ownedLocations = ownedLocations;
    }

    private List<Location> ownedLocations;
}
