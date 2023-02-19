package BuilderPattern.ResponseBuilder;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@JsonPropertyOrder({"httpStatus","errorCode","success","message"})
public class ErrorResponse {
    private HttpStatus httpStatus;
    private int errorCode;
    private boolean success;
    private String message;

    private ErrorResponse(Builder builder) {
        this.httpStatus = builder.httpStatus;
        this.errorCode = builder.errorCode;
        this.success = builder.success;
        this.message = builder.message;
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }

    public static class Builder<T> {
        private HttpStatus httpStatus;
        private int errorCode;
        private boolean success;
        private String message;

        public Builder(HttpStatus httpStatus) {
            this.httpStatus = httpStatus;
        }

        public Builder setSuccess(boolean success) {
            this.success = success;
            return this;
        }

        public Builder setErrorCode(int errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public ResponseEntity<ErrorResponse> build() {
            ErrorResponse ErrorResponse = new ErrorResponse(this);
            return ResponseEntity
                    .status(ErrorResponse.getHttpStatus())
                    .body(ErrorResponse);
        }
    }
}
