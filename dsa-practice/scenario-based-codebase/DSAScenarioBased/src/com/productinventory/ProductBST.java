package com.productinventory;

public class ProductBST {

	Product root ;
	
	//method to insert new product 
	Product insert(Product root, int sku , String name, double price) {
		if( root == null) {
			return new Product(sku, name, price) ;
		}
		else if(root.sku < sku) {
			root.left = insert(root.left, sku, name, price) ;
		}
		else if (root.sku > sku) {
			root.right = insert(root.right, sku, name, price) ;
		}
		else {
            System.out.println("Duplicate roll number not allowed!");
		}
		return root ;
	}
	
	//methods to search a product, update prices and printing products
	Product search(Product root, int sku ) {
		if(root == null || root.sku == sku) {
			return root ;
		}
		if(sku < root.sku) {
			return search(root.left, sku) ;
		}
		return search(root.right, sku) ;
	}
	
	void updatePrice(int sku, double newPrice) {
        Product p = search(root, sku);
        if (p != null) {
            p.price = newPrice;
            System.out.println("Price updated for SKU " + sku);
        } else {
            System.out.println("Product not found!");
        }
    }

	
	void inorder(Product root) {
	    if (root == null) {
	        return;  
	    }
	    inorder(root.left);
	    System.out.println("SKU: " + root.sku + " | Name: " + root.name + " | Price: $" + root.price);
	    inorder(root.right);
	}

}
