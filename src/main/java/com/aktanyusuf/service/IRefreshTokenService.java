package com.aktanyusuf.service;

import com.aktanyusuf.jwt.AuthResponse;
import com.aktanyusuf.jwt.RefreshTokenRequest;

public interface IRefreshTokenService {

	public AuthResponse refreshToken(RefreshTokenRequest request);
}
