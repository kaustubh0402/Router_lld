package services;

import DTO.Request;

public class TokenServiceImpl implements TokenService{
    public boolean validateToken(Request request){
        System.out.println("Token is valid: " + request);
        //Implement jwt token authorization
        return true;
    }
}
