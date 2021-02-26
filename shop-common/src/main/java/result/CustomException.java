package result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/26
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomException extends RuntimeException {

    private Integer errorCode;
    private String errorMsg;

}
