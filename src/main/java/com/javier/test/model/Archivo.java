package com.javier.test.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
public class Archivo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = true, length = 40)
    private String codigo;

    @Column(nullable = true)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'") // Formato adecuado para JSON
    private LocalDateTime fechaInicioVigencia;

    @Column(nullable = true, length = 60)
    private String nombreFichero;

    @Column(nullable = true, length = 250)
    private String nombreFicheroFriendly;

    @Column(nullable = true, length = 120)
    private String mimeType;

    @Column(nullable = true)
    private int orden;

    @Column(nullable = true)
    private int obligatorio;

    @Column(nullable = true)
    private int activo;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(LocalDateTime fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public String getNombreFichero() {
        return nombreFichero;
    }

    public void setNombreFichero(String nombreFichero) {
        this.nombreFichero = nombreFichero;
    }

    public String getNombreFicheroFriendly() {
        return nombreFicheroFriendly;
    }

    public void setNombreFicheroFriendly(String nombreFicheroFriendly) {
        this.nombreFicheroFriendly = nombreFicheroFriendly;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getObligatorio() {
        return obligatorio;
    }

    public void setObligatorio(int obligatorio) {
        this.obligatorio = obligatorio;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
    
}
