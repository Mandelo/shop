package result;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @description: 统一返回结果
 * @author: luox
 * @date： 2021/2/26
 */
@Data
@Component
public class Result<T> {

    /**
     * 请求是否成功
     */
    private Boolean success;

    /**
     * code
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * data
     */
    private T data;

    private Result() {

    }

    public Result(Boolean success,Integer code, String msg,T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result defineError(CustomException de){
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(de.getErrorCode());
        result.setMsg(de.getErrorMsg());
        result.setData(null);
        return result;
    }

    public static Result otherError(ErrorEnum errorEnum){
        Result result = new Result();
        result.setMsg(errorEnum.getErrorMsg());
        result.setCode(errorEnum.getErrorCode());
        result.setSuccess(false);
        result.setData(null);
        return result;
    }
}