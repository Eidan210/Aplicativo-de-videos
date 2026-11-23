package com.campus.streamcampus.repository;

import com.campus.streamcampus.entity.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

    List<Comentario> findByVideoId(Long videoId);

    // PENDIENTE - PRÓXIMAMENTE: EntityGraph de "usuario"
}
