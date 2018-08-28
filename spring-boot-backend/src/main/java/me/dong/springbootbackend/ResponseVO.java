package me.dong.springbootbackend;

import lombok.Data;

/**
 * Created by ethan.kim on 2018. 8. 28..
 */
@Data
public class ResponseVO<T> {

    private String message;

    private boolean check = true;

    private T response;

    public static <T> ResponseVO<T> newInstance(T data) {
        ResponseVO<T> resp = new ResponseVO<>();
        resp.setResponse(data);

        return resp;
    }
}
