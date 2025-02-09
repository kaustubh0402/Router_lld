package handlers;

import DTO.Request;

public class AuthorizeRouter implements Router{
    Router nextRouter;

    public AuthorizeRouter(Router nextRouter){
        this.nextRouter = nextRouter;
    }

    public void handleRequest(Request request){
        System.out.println("Authorization is successful: " +  request);
    }
}
