package com.bibliotheque.validator.Error;


public class NotValidData extends RuntimeException  {
        private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public NotValidData(String message) {
        this.message = message;
    }

    public NotValidData(String message, String message1) {
        super(message);
        this.message = message1;
    }

    public NotValidData(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    public NotValidData(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public NotValidData(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.message = message1;
    }
}
