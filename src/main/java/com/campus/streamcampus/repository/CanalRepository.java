package com.campus.streamcampus.repository;

import com.campus.streamcampus.entity.Canal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CanalRepository extends JpaRepository<Canal, Long> {

    boolean existsByNombre(String name);

    boolean existsByUsuarioId(Long usuarioId);

    Optional<Canal> findByUsuarioId (Long usuarioId);
}
