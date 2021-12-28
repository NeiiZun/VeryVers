package me.neiizun.veryvers.security.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;

@Component
public class JWTUtil {
    private final JWTConfig config;

    public JWTUtil(JWTConfig config) {
        this.config = config;
    }

    public String createToken(long userId) {
        return JWT.create()
                .withSubject(String.valueOf(userId))
                .sign(Algorithm.HMAC256(config.getSecret()));
    }

    public DecodedJWT decodeToken(String token) {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(config.getSecret()))
                .build();

        return verifier.verify(token);
    }

    public long getUserId(String token) {
        return Long.valueOf(decodeToken(token).getSubject());
    }
}
