package com.collections.policymanager;
import java.util.* ;
import java.time.* ;

public class PolicyManager {

	Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>(); 
    
    //methods to add policy, show all policies, show policies which as expiring soon, and showing policies by coverage
    public void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    public void showAll() {
    	 System.out.println("--- All Unique Policies ---");
    	 for (Policy p : hashSet) {
    		 System.out.println(p);
    	 }
    }

    public void showExpiringSoon() {
    	System.out.println("--- Policies Expiring Soon ---");
        LocalDate limit = LocalDate.now().plusDays(30);
        boolean found = false;

        for (Policy p : treeSet) {
            if (!p.expiryDate.isAfter(limit)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No policies expiring within 30 days.");
        }
    }

    public void showByCoverage(String type) {
    	System.out.println("--- Policies with Coverage: " + type + " ---");
        for (Policy p : hashSet) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

}
