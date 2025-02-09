package handlers;

import DTO.Request;
import services.TokenService;

public class AuthenticateRouter implements Router {
    private final Router nextRouter;
    private final TokenService tokenService;

    public AuthenticateRouter(Router nextRouter,TokenService tokenService){
        this.nextRouter = nextRouter;
        this.tokenService = tokenService;
    }

    public void handleRequest(Request request) {
        tokenService.validateToken(request);
        System.out.println("Handling authentication request: " + request);
    }
}
