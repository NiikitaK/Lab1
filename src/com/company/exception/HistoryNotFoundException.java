package com.company.exception;

public class HistoryNotFoundException extends Exception {
    public HistoryNotFoundException() {
        super();
    }

    public HistoryNotFoundException(String message) {
        super(message);
    }
}
