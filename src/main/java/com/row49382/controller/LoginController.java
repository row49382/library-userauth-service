package com.row49382.controller;

import com.row49382.common.security.JwtService;
import com.row49382.dto.TokenResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final JwtService jwtService;

    public LoginController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping
    public ResponseEntity<TokenResponse> getToken(Authentication authentication) {
        String token = this.jwtService.generateToken(
                authentication.getName(),
                Map.of("Authorities",
                        authentication.getAuthorities().stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.joining(" "))));

        return ResponseEntity.ofNullable(new TokenResponse(token));
    }
}
