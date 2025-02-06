package handlers;

public class ValidateParamRouter implements Router {
    public void handleRequest(String request) {
        System.out.println("Validating request parameters: " + request);
    }
}
