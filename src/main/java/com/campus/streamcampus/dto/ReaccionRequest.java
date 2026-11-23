package com.campus.streamcampus.dto;

import com.campus.streamcampus.entity.TipoReaccion;
import jakarta.validation.constraints.NotNull;

public record ReaccionRequest(
        @NotNull
        TipoReaccion tipo

        // PENDIENTE - PRÓXIMAMENTE: usuarioId (Usuario, Eidan)
) {
}
