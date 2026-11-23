package com.campus.streamcampus.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comentarios")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 1000)
    private String contenido;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "video_id", nullable = false)
    private Video video;

    // PENDIENTE - PRÓXIMAMENTE: columna usuario_id,

    public Comentario(String contenido, Video video) {
        this.contenido = contenido;
        this.video = video;
    }
}
