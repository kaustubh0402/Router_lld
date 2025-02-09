package handlers;

public class AuthorizeRouter {
    Router nextRouter;

    AuthorizeRouter(Router nextRouter){
        this.nextRouter = nextRouter;
    }

    public void handleRequest(String request){
        System.out.println("Authorization is successful: " +  request);
    }
}
