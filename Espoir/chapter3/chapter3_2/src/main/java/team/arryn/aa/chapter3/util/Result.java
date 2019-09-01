package team.arryn.aa.chapter3.util;


import lombok.Data;

/**
 * 传给前端的数据,返回的结果
 * @param <T>
 */
@Data
public class Result<T> {

    private int  status;
    private T data;

    public Result() {
    }

    public Result(T data) {
        this.status=200;
        this.data= data;
    }

    public Result(int status, T data) {
        this.status = status;
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}