package com.rp4.auth.repository;

import com.rp4.auth.core.ApplicationUsuario;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationUsuarioRepository extends PagingAndSortingRepository<ApplicationUsuario, Long> {
    public ApplicationUsuario findByUsername(String username);
}
