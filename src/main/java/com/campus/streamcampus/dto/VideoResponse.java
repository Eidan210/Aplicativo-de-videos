package com.campus.streamcampus.dto;

import com.campus.streamcampus.entity.Visibilidad;

public record VideoResponse(
        Long id,
        String titulo,
        String descripcion,
        String url,
        Integer duracion,
        Visibilidad visibilidad,
        Long vistas,
        Long categoriaId,
        String nombreCategoria

        // PENDIENTE - PRÓXIMAMENTE: canalId y nombreCanal (Canal, Eidan)
) {
}
