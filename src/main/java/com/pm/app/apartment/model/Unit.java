package com.pm.app.apartment.model;

public class Unit {
    private Tenant tenant;
    private double rent;
    private String paymentDueDate;
    private String gracePeriod;

    //TODO maintenanceHistory
    //TODO rentHistory
    //TODO tenantNoticeHistory;

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(String paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public String getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(String gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

}
