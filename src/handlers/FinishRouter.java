package handlers;

import DTO.Request;

public class FinishRouter implements Router {

    public void handleRequest(Request request){
        System.out.println("Finishing request: " + request);
    }
}
