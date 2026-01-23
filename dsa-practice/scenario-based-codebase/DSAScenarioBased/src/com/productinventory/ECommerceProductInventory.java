package com.productinventory;
import java.util.* ;

public class ECommerceProductInventory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		ProductBST bst= new ProductBST() ;
		
		//taking user choice as input and displaying result accordingly
		while(true) {
			System.out.println("------E-Commerce Product Inventory------") ;
			System.out.println("1. Insert Product") ;
			System.out.println("2. Lookup Product") ;
			System.out.println("3. Price Update") ;
			System.out.println("4. Print products(In Sorted Order) : ") ;
			System.out.println("Enter your choice :") ;
			int choice = sc.nextInt();
			
			switch(choice) {
			
				case 1 :
					System.out.print("Enter SKU: ");
                    int sku = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    
                    bst.root = bst.insert(bst.root, sku, name, price);
                    
                    System.out.println("Product " + name + " added to inventory.") ;
                    break;

                case 2:
                    System.out.print("Enter SKU to Lookup: ");
                    int lookupSku = sc.nextInt();
                    Product found = bst.search(bst.root, lookupSku);
                    if (found != null)
                        System.out.println("Found: SKU " + found.sku + ", Name: " + found.name + ", Price: $" + found.price);
                    else
                        System.out.println("Product not found!");
                    break;

                case 3:
                    System.out.print("Enter SKU to Update Price: ");
                    int updateSku = sc.nextInt();
                    
                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();
                    
                    bst.updatePrice(updateSku, newPrice);
                    break;
                
                case 4:
                    if (bst.root == null) {
                        System.out.println("Inventory is empty!");
                    } else {
                        System.out.println("Sorted Product Inventory:");
                        bst.inorder(bst.root);
                    }
                    break;

                case 5:
                    System.out.println("Exiting........!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
			}
				
		}

	}

}
