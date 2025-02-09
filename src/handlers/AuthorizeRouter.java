package handlers;

import DTO.Request;
import services.AuthRoleService;

public class AuthorizeRouter implements Router{
    private final Router nextRouter;
    private final AuthRoleService authRoleService;

    public AuthorizeRouter(Router nextRouter, AuthRoleService authRoleService){
        this.nextRouter = nextRouter;
        this.authRoleService = authRoleService;

    }

    public void handleRequest(Request request){
        System.out.println("Authorization is successful: " +  request);
        authRoleService.AutorizeRole(request);
    }
}
