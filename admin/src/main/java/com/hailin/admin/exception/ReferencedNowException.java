package com.hailin.admin.exception;


import com.hailin.admin.model.Reference;

public class ReferencedNowException extends RuntimeException {

    private final Reference reference;

    public ReferencedNowException(Reference reference) {
        this.reference = reference;
    }

    public ReferencedNowException(String message, Reference reference) {
        super(message);
        this.reference = reference;
    }

    public ReferencedNowException(String message, Throwable cause, Reference reference) {
        super(message, cause);
        this.reference = reference;
    }

    public ReferencedNowException(Throwable cause, Reference reference) {
        super(cause);
        this.reference = reference;
    }

    public ReferencedNowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Reference reference) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.reference = reference;
    }

    public Reference getReference() {
        return reference;
    }
}
