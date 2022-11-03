package com.alfsuace.biblioteca;

public class Genero {

    private Integer id;
    private String nombreGenero;
    private String descripcion;

    public void setId (Integer id) {
        this.id = id;
    }

    public Integer getId () {
        return id;
    }

    public void setDescripcion (String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public void setNombreGenero (String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public String getNombreGenero () {
        return nombreGenero;
    }
}
