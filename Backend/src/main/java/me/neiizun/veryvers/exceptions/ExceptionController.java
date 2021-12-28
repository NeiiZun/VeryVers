package me.neiizun.veryvers.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler
    public ResponseEntity<APIException> onException(APIException exception) {
        return ResponseEntity.internalServerError().body(exception);
    }
}
