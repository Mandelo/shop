package result;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import result.CustomException;
import result.ErrorEnum;
import result.Result;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/26
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理自定义异常
     *
     */
    @ExceptionHandler(value = CustomException.class)
    @ResponseBody
    public Result bizExceptionHandler(CustomException e) {
        return Result.defineError(e);
    }

    /**
     * 处理其他异常
     *
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionHandler( Exception e) {
        return Result.otherError(ErrorEnum.INTERNAL_SERVER_ERROR);
    }

}
