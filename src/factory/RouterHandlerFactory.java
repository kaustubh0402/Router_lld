package factory;

import handlers.*;
import services.AuthRoleServiceImpl;
import services.TokenServiceImpl;

public class RouterHandlerFactory {
    public static Router getRouterHandler(){
        Router router= new ValidateBodyRouter(
                new ValidateParamRouter(
                        new AuthorizeRouter(
                                new AuthenticateRouter(new FinishRouter(),new TokenServiceImpl()),new AuthRoleServiceImpl()
                        )
                )
        );

        Router router1= new ValidateParamRouter (
                new ValidateBodyRouter(
                        new AuthorizeRouter(
                                new AuthenticateRouter(new FinishRouter(),new TokenServiceImpl()),new AuthRoleServiceImpl()
                        )
                )
        );

        Router router2= new AuthorizeRouter(
                new AuthenticateRouter(new FinishRouter(),new TokenServiceImpl()),new AuthRoleServiceImpl()
        );

        Router router3= new AuthenticateRouter(
                new AuthorizeRouter(new FinishRouter(), new AuthRoleServiceImpl()),new TokenServiceImpl()
        );

        return  router3;
    }
}
