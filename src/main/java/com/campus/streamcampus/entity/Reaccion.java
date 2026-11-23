package com.campus.streamcampus.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reacciones")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Reaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TipoReaccion tipo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "video_id", nullable = false)
    private Video video;

    // PENDIENTE - PRÓXIMAMENTE: relación columna usuario_id

    public Reaccion(TipoReaccion tipo, Video video) {
        this.tipo = tipo;
        this.video = video;
    }
}
