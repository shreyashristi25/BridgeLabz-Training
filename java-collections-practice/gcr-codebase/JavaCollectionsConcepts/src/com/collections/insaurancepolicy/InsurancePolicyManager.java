package com.collections.insaurancepolicy;
import java.util.* ;
import java.time.* ;

public class InsurancePolicyManager {
	
	 private Set<Policy> hashSet = new HashSet<>();
	 private Set<Policy> linkedHashSet = new LinkedHashSet<>();
	 private Set<Policy> treeSet = new TreeSet<>();

	 //method to add policy, display all policies, display expiring policies, displaying policies by coverage and displaying duplicate policies
	 public void addPolicy(Policy policy) {
		 hashSet.add(policy);
	     linkedHashSet.add(policy);
	     treeSet.add(policy);
	 }

	 public void displayAllPolicies() {
		 System.out.println("All Unique Policies:");
	     hashSet.forEach(System.out::println);
	 }

	 public void displayExpiringSoon() {
		 LocalDate now = LocalDate.now();
	     System.out.println("Policies expiring within 30 days:");
	     for (Policy p : treeSet) {
	    	 if (!p.getExpiryDate().isAfter(now.plusDays(30))) {
	    		 System.out.println(p);
	         }
	     }
	 }

	 public void displayByCoverage(String type) {
		 System.out.println("Policies with coverage type: " + type);
	     for (Policy p : hashSet) {
	    	 if (p.getCoverageType().equalsIgnoreCase(type)) {
	    		 System.out.println(p);
	         }
	     }
	 }

	 public void displayDuplicates() {
		 Map<String, Integer> countMap = new HashMap<>();
	     for (Policy p : linkedHashSet) {
	    	 countMap.put(p.getPolicyNumber(), countMap.getOrDefault(p.getPolicyNumber(), 0) + 1);
	     }
	     System.out.println("Duplicate Policies:");
	     countMap.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println("PolicyNumber: " + e.getKey() + " Count: " + e.getValue()));
	    }

}
