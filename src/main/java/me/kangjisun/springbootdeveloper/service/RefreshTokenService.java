package me.kangjisun.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.kangjisun.springbootdeveloper.domain.RefreshToken;
import me.kangjisun.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {

    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken (String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("Unexpecte token"));
    }
}
