package team.arryn.aa.chapter3.util;


import lombok.Data;

/**
 * 传给前端的数据,返回的结果
 * @param
 */
@Data
public class Result{
    private int  status;
    private Object data;

    public Result() {
    }

    public Result(Object data) {
        this.status=200;
        this.data = data;
    }

    public Result(int status, Object data) {
        this.status = status;
        this.data = data;
    }
}