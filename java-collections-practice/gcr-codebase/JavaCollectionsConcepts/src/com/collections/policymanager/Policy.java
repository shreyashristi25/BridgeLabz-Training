package com.collections.policymanager;
import java.time.* ;
public class Policy implements Comparable<Policy>{

	public String policyNumber;
    public String policyholderName;
    public LocalDate expiryDate;
    public String coverageType;
    public double premiumAmount;

    //constructor
    public  Policy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyholderName + " | " +expiryDate + " | " + coverageType + " | " + premiumAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy p = (Policy) o;
        return policyNumber.equals(p.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

}
