package BuilderPattern.dto;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class studentDto {
    @NotBlank
    private String name;
    @NotBlank
    private String age;
    @Nullable
    private String university;
    @Nullable
    private int studentNumber;
}
