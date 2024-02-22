package shop.mtcoding.blog.board;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardApiController { // Ajax 통신을 위한 컨트롤러
    private final BoardRepository boardRepository;

    @GetMapping("/api/boards")//api들은 보통 복수로 표현한다.
    public ApiUtil<List<Board>> findAll(HttpServletResponse response){
        //response.setStatus(400);
        List<Board> boardList = boardRepository.selectAll();
        return new ApiUtil<>(boardList); // MessageConverter (RestController면서, object를 응답할때)
    }
}
