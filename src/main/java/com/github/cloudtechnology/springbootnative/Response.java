package com.github.cloudtechnology.springbootnative;

import lombok.Data;

@Data
public class Response {
    
    private boolean isok;
    private int status; // 200,400,500
    private String message;
    private Object data;

    public Response(){}

    public static Response succeed(Object obj) {
        Response response = new Response();
        response.setIsok(true);
        response.setStatus(200);
        response.setMessage("success");
        response.setData(obj);

        return response;
    }

    public static Response succeed() {
        Response response = new Response();
        response.setIsok(true);
        response.setStatus(200);
        
        return response;
    }


}
