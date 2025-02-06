package DTO;

import java.util.Optional;

public class Request {
    private String requestType;
    private String route;;
    private Optional<Object> body;

    //setters and getters
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestType() {
        return requestType;
    }

}
