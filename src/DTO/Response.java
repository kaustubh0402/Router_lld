package DTO;

import java.util.Optional;

public class Response {
    private String responseType;
    private Optional<Object> body;

    //setters and getters
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setBody(Optional<Object> body) {
        this.body = body;
    }

    public Optional<Object> getBody() {
        return body;
    }
}
