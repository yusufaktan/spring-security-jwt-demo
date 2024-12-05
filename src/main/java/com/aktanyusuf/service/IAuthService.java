package com.aktanyusuf.service;

import com.aktanyusuf.dto.DtoUser;
import com.aktanyusuf.jwt.AuthRequest;
import com.aktanyusuf.jwt.AuthResponse;

public interface IAuthService {

	public DtoUser register(AuthRequest request);
	
	public AuthResponse authenticate(AuthRequest request);
}
