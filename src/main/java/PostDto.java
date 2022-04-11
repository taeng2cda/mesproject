import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class PostDto {

// @Builder 생성자를 막음

    private Integer id;
    private String name;
    private String content;
    private String slug;


}
