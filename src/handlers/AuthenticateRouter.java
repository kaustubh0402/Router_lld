package handlers;

public class AuthenticateRouter implements Router {
    @Override
    public void handleRequest(String request) {
        System.out.println("Handling authentication request: " + request);
    }
}
