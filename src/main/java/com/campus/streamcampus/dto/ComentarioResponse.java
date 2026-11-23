package com.campus.streamcampus.dto;

public record ComentarioResponse(
        Long id,
        String contenido,
        Long videoId

        // PENDIENTE - PRÓXIMAMENTE: usuarioId y nombreUsuario (Usuario, Eidan)
) {
}
