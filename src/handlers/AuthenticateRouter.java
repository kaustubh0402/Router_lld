package handlers;

public class AuthenticateRouter implements Router {
    Router nextRouter;

    AuthenticateRouter(Router nextRouter){
        this.nextRouter = nextRouter;
    }

    public void handleRequest(String request) {
        System.out.println("Handling authentication request: " + request);
    }
}
