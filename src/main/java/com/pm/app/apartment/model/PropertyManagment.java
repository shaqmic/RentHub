package com.pm.app.apartment.model;

import java.util.List;

public class PropertyManagment extends Person {
    public List<Location> getManagedLocations() {
        return managedLocations;
    }

    public void setManagedLocations(List<Location> managedLocations) {
        this.managedLocations = managedLocations;
    }

    private List<Location> managedLocations;
}
