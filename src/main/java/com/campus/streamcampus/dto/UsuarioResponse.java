package com.campus.streamcampus.dto;

import com.campus.streamcampus.entity.Usuario;

import java.time.LocalDateTime;

public record UsuarioResponse(
        Long id,
        String nombre,
        String email,
        LocalDateTime fechaRegistro
) {
    public static UsuarioResponse desde(Usuario usuario){
        return new UsuarioResponse(
                usuario.getId(),
                usuario.getNombre(),
                usuario.getEmail(),
                usuario.getFechaRegistro()
        );
    }
}
