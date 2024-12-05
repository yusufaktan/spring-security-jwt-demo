package com.aktanyusuf.controller;

import com.aktanyusuf.dto.DtoUser;
import com.aktanyusuf.jwt.AuthRequest;
import com.aktanyusuf.jwt.AuthResponse;
import com.aktanyusuf.jwt.RefreshTokenRequest;

public interface IRestAuthController {

	public DtoUser register(AuthRequest request);
	
	public AuthResponse authenticate(AuthRequest request);
	
	public AuthResponse refreshToken(RefreshTokenRequest request);
}
