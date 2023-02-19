package BuilderPattern.controller.exceptionhandler;

import BuilderPattern.ResponseBuilder.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class exceptionhandlercontroller {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity exceptionResponse() {
        return new ErrorResponse.Builder(HttpStatus.BAD_REQUEST)
                .setSuccess(false)
                .setErrorCode(108)
                .setMessage("INVALID PERSON")
                .build();
    }
}
