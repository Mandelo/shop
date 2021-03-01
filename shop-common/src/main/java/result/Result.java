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

    public Result() {

    }

    public Result(Integer code, String msg,T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public static Result defineError(CustomException de){
        Result result = new Result();
        result.setCode(de.getErrorCode());
        result.setMsg(de.getErrorMsg());
        result.setData(null);
        return result;
    }

    public static Result OK(Object data){
        Result result = new Result();
        result.setCode(ErrorEnum.SUCCESS.getErrorCode());
        result.setMsg(ErrorEnum.SUCCESS.getErrorMsg());
        result.setData(data);
        return result;
    }

    public static Result otherError(ErrorEnum errorEnum){
        Result result = new Result();
        result.setMsg(errorEnum.getErrorMsg());
        result.setCode(errorEnum.getErrorCode());
        result.setData(null);
        return result;
    }
}