package BuilderPattern.controller;

import BuilderPattern.ResponseBuilder.ApiResponse;
import BuilderPattern.dto.studentDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/builder/api")
public class controller {
    @PostMapping
    public ResponseEntity<ApiResponse> getOk(@RequestBody @Valid studentDto dto) {
        return new ApiResponse.Builder<>(HttpStatus.OK)
                .setSuccess(true)
                .setMessage("SUCCESS")
                .setData(dto)
                .build();
    }
}
