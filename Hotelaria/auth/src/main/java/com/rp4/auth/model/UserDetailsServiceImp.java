package com.rp4.auth.model;

import com.rp4.auth.core.ApplicationUsuario;
import com.rp4.auth.repository.ApplicationUsuarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.Collection;


@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
@Slf4j
public class UserDetailsServiceImp implements UserDetailsService {
    private final ApplicationUsuarioRepository applicationUsuarioRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Probucrando no banco de Dados '{} ", username);
        ApplicationUsuario applicationUsuario = applicationUsuarioRepository.findByUsername(username);
        log.info("ApplicationUsuario encontrado '{}", applicationUsuario);
        if (applicationUsuario == null)
            throw new UsernameNotFoundException(String.format("Application usuario '%s' nao encontrado", username));
            return new CustomUserDetails(applicationUsuario);


    }
    private static  final class CustomUserDetails extends ApplicationUsuario implements UserDetails{
        public CustomUserDetails(@NotNull ApplicationUsuario applicationUsuario){
            super(applicationUsuario);
        }
        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_");
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }
}
