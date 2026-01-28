package com.junit.main.numberutils;
import java.util.* ;

public class NumberUtilsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		NumberUtils nu = new NumberUtils() ;
		
		//taking input from user and displaying result
		System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (nu.isEven(num)) {
            System.out.println(num + " is even.");
        } 
        else {
            System.out.println(num + " is odd.");
        }

        sc.close();


	}

}
