package com.optionalinterface.ecommercesystem;
import java.util.* ;

public class Product {

	 String name;
	 Optional<Double> discount;
	 Optional<String> coupon;
	 Optional<String> seller;
	 Optional<String> description;
	 Optional<String> deliveryPartner;

	 //constructor
	 public Product(String name, Double discount, String coupon, String seller, String description, String deliveryPartner) {
		 this.name = name;
		 this.discount = Optional.ofNullable(discount);
		 this.coupon = Optional.ofNullable(coupon);
		 this.seller = Optional.ofNullable(seller);
		 this.description = Optional.ofNullable(description);
		 this.deliveryPartner = Optional.ofNullable(deliveryPartner);
	 }

}
