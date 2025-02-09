package services;

import DTO.Request;

public interface TokenService {
    public boolean validateToken(Request request);
}
