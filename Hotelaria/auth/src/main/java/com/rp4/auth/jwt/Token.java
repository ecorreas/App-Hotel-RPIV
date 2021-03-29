package com.rp4.auth.jwt;
import io.jsonwebtoken.Claims;

import com.rp4.auth.service.UsuarioService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.List;
import java.util.Date;


@Service
public class Token {

    @Autowired
    private UsuarioService usuarioService;

    @Value("${security.jwt.token.secret_key}")
    private String chave;

    @Value("${security.jwt.token.expire_time}")
    private long expireTime;

    @PostConstruct
    public void generateToken() {
        chave = Base64.getEncoder().encodeToString(chave.getBytes());
    }

    public String criarToken(String username, List<String> roles) {
        Claims claims = Jwts.claims().setSubject(username);
        claims.put("roles", roles);

        Date now = new Date();
        Date validate = new Date(now.getTime() + expireTime);
        return Jwts.builder().setClaims(claims).setIssuedAt(now).setExpiration(validate)
                .signWith(SignatureAlgorithm.HS256, chave).compact();
    }

    public Authentication getAuthetication(String token) {
        UserDetails userDetails = this.usuarioService.loadUserByUsername(getNomeUsuario(token));
        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }

    private String getNomeUsuario(String token) {
        return Jwts.parser().setSigningKey(chave).parseClaimsJws(token).getBody().getSubject();
    }

    public String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7, bearerToken.length());
        }
        return null;
    }
}
