package com.campus.streamcampus.repository;

import com.campus.streamcampus.entity.Video;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VideoRepository extends JpaRepository<Video, Long> {

    @Override
    @EntityGraph(attributePaths = "categoria")
    List<Video> findAll();

    @Override
    @EntityGraph(attributePaths = "categoria")
    Optional<Video> findById(Long id);

    @EntityGraph(attributePaths = "categoria")
    List<Video> findByCategoriaId(Long categoriaId);

    // PENDIENTE - PRÓXIMAMENTE: findByCanalId y "canal" en los EntityGraph (Canal, Eidan)
}
