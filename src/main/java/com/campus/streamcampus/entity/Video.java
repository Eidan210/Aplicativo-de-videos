package com.campus.streamcampus.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "videos")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String titulo;

    @Column(length = 2000)
    private String descripcion;

    @Column(nullable = false, length = 500)
    private String url;


    @Column(nullable = false)
    private Integer duracion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private Visibilidad visibilidad;

    @Column(nullable = false)
    private Long vistas;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    // PENDIENTE - PRÓXIMAMENTE: columna canal_id

    public Video(String titulo, String descripcion, String url, Integer duracion, Visibilidad visibilidad, Categoria categoria) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.duracion = duracion;
        this.visibilidad = visibilidad;
        this.vistas = 0L;
        this.categoria = categoria;
    }
}
