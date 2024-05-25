package com.security.security.service;

import com.security.security.dao.request.SignUpRequest;
import com.security.security.dao.request.SigninRequest;
import com.security.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
