package yzm.example.vue.admin.service.base.response;

/**
 * @author yzm
 * @date 2022/2/22 - 21:03
 */
public class R<T> extends BaseResponse<T>{

    private static final long serialVersionUID = -8116306212660906077L;

    public static R<?> success() {
        return new R<>();
    }

    public static <T> R<T> success(T data) {
        R<T> rsp = new R<T>();
        rsp.setData(data);
        return rsp;
    }

}
