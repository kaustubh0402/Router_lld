package handlers;

public class ValidateBodyRouter implements Router {

    Router nextRouter;

    ValidateBodyRouter(Router nextRouter) {
        this.nextRouter = nextRouter;
    }
    
    public void handleRequest(String request) {
        System.out.println("Validating request body: " + request);
    }
}
