package handlers;

import DTO.Request;

public class AuthenticateRouter implements Router {
    Router nextRouter;

    public AuthenticateRouter(Router nextRouter){
        this.nextRouter = nextRouter;
    }

    public void handleRequest(Request request) {
        System.out.println("Handling authentication request: " + request);
    }
}
