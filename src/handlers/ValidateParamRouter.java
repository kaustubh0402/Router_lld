package handlers;

import DTO.Request;

public class ValidateParamRouter implements Router {

    Router nextRouter;

    public ValidateParamRouter(Router nextRouter){
        this.nextRouter= nextRouter;
    }

    public void handleRequest(Request request) {
        System.out.println("Validating request parameters: " + request);
    }
}
