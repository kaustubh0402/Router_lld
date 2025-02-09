package services;

import DTO.Request;

public class AuthRoleServiceImpl implements AuthRoleService{

    public boolean AutorizeRole(Request request){
        System.out.println("Role is valid: " + request);
        //Implement role authorization
        return true;
    }
}
