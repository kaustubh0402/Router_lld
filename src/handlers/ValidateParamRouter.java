package handlers;

public class ValidateParamRouter implements Router {

    Router nextRouter;

    ValidateParamRouter(Router nextRouter){
        this.nextRouter= nextRouter;
    }

    public void handleRequest(String request) {
        System.out.println("Validating request parameters: " + request);
    }
}
