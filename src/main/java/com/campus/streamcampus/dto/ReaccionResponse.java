package com.campus.streamcampus.dto;

import com.campus.streamcampus.entity.TipoReaccion;

public record ReaccionResponse(
        Long id,
        TipoReaccion tipo,
        Long videoId

        // PENDIENTE - PRÓXIMAMENTE: usuarioId (Usuario, Eidan)
) {
}
