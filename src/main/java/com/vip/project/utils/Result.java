package com.vip.project.utils;

import lombok.Data;
import org.springframework.stereotype.Component;

import static com.vip.project.utils.Constants.*;

/**
 * @Author luotao
 */
@Component
@Data
public class  Result<T> {
    private String msg;
    private int code;
    private T data;

    public static <T> Result success(T t){
        Result result = new Result();
        result.setMsg(SUCCESS_MSG);
        result.setCode(SUCCESS_CODE);
        result.setData(t);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setMsg(ERROR_MSG);
        result.setCode(ERROR_CODE);
        return result;
    }
}
