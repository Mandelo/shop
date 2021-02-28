package result;

/**
 * @description:
 * @author: luox
 * @date： 2021/2/26
 */

public enum ErrorEnum {

    SUCCESS(200, "操作成功"),
    NO_PERMISSION(403, "权限不足"),
    NO_AUTH(401, "权限不足"),
    NOT_FOUND(404, "未找到该资源!"),
    INTERNAL_SERVER_ERROR(500, "服务器错误");

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    ErrorEnum(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

}
