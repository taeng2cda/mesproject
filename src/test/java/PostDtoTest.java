import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class PostDtoTest {

    @Test( = AssertionError.class)
    @DisplayName("post dto 데이터를 체크 합니다.")
    public void testPostDtoSet(){

        Integer id = 1;
        String name = "제목";
        String content = "내용";
        String slug = "slug";

        // 롬복 빌더를 사용할경우 아래코드처럼 사용이 가능함
        PostDto dto = new PostDto.PostDtoBuilder()
                .id(id)
                .name(name)
                .content(content)
                .slug(slug)
                .build();
        System.out.println(dto.toString());

        dto.setId(1);
        dto.setName("제목");
        dto.setContent("내용");
        dto.setSlug("slug");

        assertFalse( id == dto.getId() );
        assertTrue( name == dto.getName() );
        assertTrue( content == dto.getContent() );
        assertTrue( slug == dto.getSlug() );

    }

}