package com.campus.streamcampus.dto;

import com.campus.streamcampus.entity.Visibilidad;
import jakarta.validation.constraints.*;

public record VideoRequest(
        @NotBlank
        @Size(max = 150)
        String titulo,

        @Size(max = 2000)
        String descripcion,

        @NotBlank
        @Size(max = 500)
        @Pattern(regexp = "https?://\\S+")
        String url,

        @NotNull
        @Positive
        Integer duracion,

        @NotNull
        Visibilidad visibilidad,

        @NotNull
        @Positive
        Long categoriaId

        // PENDIENTE - PRÓXIMAMENTE: canalId (Canal, Eidan)
) {
}
