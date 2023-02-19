package BuilderPattern.ResponseBuilder;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@JsonPropertyOrder({"httpStatus","success","message","data"})
public class ApiResponse<T> {
    private HttpStatus httpStatus;
    private boolean success;
    private String message;
    private T data;

    private ApiResponse(Builder builder) {
        this.httpStatus = builder.httpStatus;
        this.success = builder.success;
        this.message = builder.message;
        this.data = (T) builder.data;
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public static class Builder<T> {
        private HttpStatus httpStatus;
        private boolean success;
        private String message;
        private T data;

        public Builder(HttpStatus httpStatus) {
            this.httpStatus = httpStatus;
        }

        public Builder<T> setSuccess(boolean success) {
            this.success = success;
            return this;
        }

        public Builder<T> setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder<T> setData(T data) {
            this.data = data;
            return this;
        }

        public ResponseEntity<ApiResponse> build() {
            ApiResponse<T> apiResponse = new ApiResponse<>(this);
            return ResponseEntity
                    .status(apiResponse.getHttpStatus())
                    .body(apiResponse);
        }
    }
}
