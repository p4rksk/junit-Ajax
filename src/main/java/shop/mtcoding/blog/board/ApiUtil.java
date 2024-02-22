package shop.mtcoding.blog.board;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class ApiUtil<T> {
    private Integer sattus; //200, 400, 404, 405
    private String msg; // 성공, 실패시 -> 정확한 메세지
    private T body; // new 할 때 어떤 타입일지 알게 되니 데이터는 타입을 제네릭 쓰기

    public ApiUtil(T body) {
        this.sattus = 200;
        this.msg = "성공";
        this.body = body;
    }

    public ApiUtil(Integer sattus, String msg) {
        this.sattus = sattus;
        this.msg = msg;
        this.body = null;
    }
}
