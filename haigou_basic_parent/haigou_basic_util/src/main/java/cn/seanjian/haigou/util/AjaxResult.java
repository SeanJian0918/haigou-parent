package cn.seanjian.haigou.util;

/**
 * @Auther: Sean Jian
 * @Description: cn.aigou.util
 * @Date: 2019/3/26 15:03
 */
public class AjaxResult {
    private Boolean success = true;//默认操作是成功的
    private String msg = "操作成功";//操作成功返回的文字提示
    private Object object; //需要返回对象信息的时候

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }
}
