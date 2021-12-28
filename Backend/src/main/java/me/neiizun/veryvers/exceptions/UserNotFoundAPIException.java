package me.neiizun.veryvers.exceptions;

public class UserNotFoundAPIException extends APIException{
    public UserNotFoundAPIException(String message) {
        super("USER_NOT_FOUND", message);
    }
}
