package com.javier.test.exception;

public class BookIdMismatchException extends RuntimeException {
    
    public BookIdMismatchException() {
        super("Book ID mismatch");
    }

    public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
    
}

