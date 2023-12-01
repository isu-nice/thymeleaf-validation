package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/* 기능이 약해서 잘 사용하지는 않음 -> 메서드 내에 validation을 추가하는 편이 더 좋은 방법!
@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000" // 여기서는 10_000 이런 식으로 작성하면 오류 발생함
        , message = "총 금액이 10,000원 이상이어야 합니다.")
*/
@Data
public class Item {

//    @NotNull(groups = UpdateCheck.class) // 수정 요구사항 추가
    private Long id;

//    @NotBlank(groups = {UpdateCheck.class, SaveCheck.class}, message = "공백x")
    private String itemName;

//    @NotNull(groups = {UpdateCheck.class, SaveCheck.class})
//    @Range(min = 1_000, max = 1_000_000, groups = {UpdateCheck.class, SaveCheck.class})
    private Integer price;

//    @NotNull(groups = {UpdateCheck.class, SaveCheck.class})
//    @Max(value = 9_999, groups = SaveCheck.class) // 수정 요구사항 추가
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
