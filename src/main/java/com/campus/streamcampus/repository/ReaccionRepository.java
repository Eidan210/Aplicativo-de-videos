package com.campus.streamcampus.repository;

import com.campus.streamcampus.entity.Reaccion;
import com.campus.streamcampus.entity.TipoReaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaccionRepository extends JpaRepository<Reaccion, Long> {

    long countByVideoIdAndTipo(Long videoId, TipoReaccion tipo);

    // PENDIENTE - PRÓXIMAMENTE: findByUsuarioIdAndVideoId (Usuario, Eidan)
}
