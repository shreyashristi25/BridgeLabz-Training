package com.constructor.level1;

public class BookMain {
    public static void main(String[] args) {

        Book defaultBook = new Book();
        defaultBook.displayBookInfo();

        System.out.println();

        Book customBook = new Book("Harry Potter", "J. K. Rowling", 150.9);
        customBook.displayBookInfo();

        System.out.println();

   }

}


