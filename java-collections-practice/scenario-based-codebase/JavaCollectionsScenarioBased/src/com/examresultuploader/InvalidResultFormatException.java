package com.examresultuploader;

//custom exception
public class InvalidResultFormatException extends Exception {
    public InvalidResultFormatException(String message) {
        super(message);
    }
}
