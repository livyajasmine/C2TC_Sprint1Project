package com.tnsif.placementservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Placement {

    @Id
    @Column(name = "P_id")
    private int p_id;

    @Column(name = "CompanyName")
    private String companyName;

    @Column(name = "Role")
    private String role;

    @Column(name = "Package")
    private String packageOffered;

    @Column(name = "Location")
    private String location;

    @Column(name = "Eligibility")
    private String eligibility;

    public Placement() {
        super();
    }

    public Placement(int p_id, String companyName, String role, String packageOffered, String location,
            String eligibility) {
        super();
        this.p_id = p_id;
        this.companyName = companyName;
        this.role = role;
        this.packageOffered = packageOffered;
        this.location = location;
        this.eligibility = eligibility;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPackageOffered() {
        return packageOffered;
    }

    public void setPackageOffered(String packageOffered) {
        this.packageOffered = packageOffered;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    @Override
    public String toString() {
        return "Placement [p_id=" + p_id + ", companyName=" + companyName + ", role=" + role
                + ", packageOffered=" + packageOffered + ", location=" + location + ", eligibility=" + eligibility + "]";
    }
}
