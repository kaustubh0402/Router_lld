package handlers;

import DTO.Request;

public class ValidateBodyRouter implements Router {

    Router nextRouter;

    public ValidateBodyRouter(Router nextRouter) {
        this.nextRouter = nextRouter;
    }

    public void handleRequest(Request request) {
        System.out.println("Validating request body: " + request);
    }
}
