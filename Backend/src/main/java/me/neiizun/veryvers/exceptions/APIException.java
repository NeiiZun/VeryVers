package me.neiizun.veryvers.exceptions;

public class APIException extends RuntimeException {
    private final String code;
    private final String message;

    public APIException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
