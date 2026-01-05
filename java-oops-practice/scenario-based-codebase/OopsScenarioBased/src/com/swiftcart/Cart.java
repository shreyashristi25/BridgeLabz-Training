package com.swiftcart;

//creating a cart class that implements ICheckout interface
public class Cart implements ICheckout{

	private Product [] products;
    private int size;          
    private double totalPrice;

    // Constructor for empty cart
    public Cart() {
        products = new Product[10]; 
        size = 0;
        totalPrice = 0.0;
    }

    // Constructor for Pre-selected items
    public Cart(Product[] initialProducts) {
        products = new Product[initialProducts.length];
        size = 0;
        for (Product p : initialProducts) {
            addProduct(p, 1);
        }
        calculateTotal();
    }

    // methods to add product, ensure the capacity of the cart and calculate total 
    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            ensureCapacity();
            products[size++] = product;
        }
        calculateTotal();
    }
 
    private void ensureCapacity() {
        if (size == products.length) {
            Product[] newArr = new Product[products.length * 2];
            for (int i = 0; i < products.length; i++) {
                newArr[i] = products[i];
            }
            products = newArr;
        }
    }

    private void calculateTotal() {
        totalPrice = 0.0;
        for (int i = 0; i < size; i++) {
            totalPrice += products[i].getPrice();
        }
    }

    //overriden methods from ICheckout 
    @Override
    public void generateBill() {
        System.out.println("----- SwiftCart Bill -----");
        for (int i = 0; i < size; i++) {
            System.out.println(products[i].getName() + " - ₹" + products[i].getPrice());
        }
        System.out.println("Total: ₹" + totalPrice);
    }
    @Override
    public void applyDiscount(double couponValue) {
        double discount = 0.0;
        for (int i = 0; i < size; i++) {
            if (products[i] instanceof PerishableProduct) {
                discount += couponValue * 1.2;
            } else if (products[i] instanceof NonPerishableProduct) {
                discount += couponValue;
            }
        }
        totalPrice -= discount;
        if (totalPrice < 0) totalPrice = 0;
    }
}

