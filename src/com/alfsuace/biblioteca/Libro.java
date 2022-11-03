package com.alfsuace.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    //-id :Integer
    //-titulo: String
    //-isbn: String
    //-autor: List<Autor>
    //-genero: LIST<Genero>
    //-fechaPublicación: String

    private Integer id;
    private String titulo;
    private String isbn;
    private String fechaPublicacion;
    private Autor autor;
    private List<Genero> genero = new ArrayList<>();

    public void setId (Integer id) {
        this.id = id;
    }

    public Integer getId () {
        return id;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo () {
        return titulo;
    }
    public void addGenero(Genero genero){
        this.genero.add(genero);
    }
    public List<Genero> getGenero(){
        return genero;
    }

    public void setIsbn (String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn () {
        return isbn;
    }

    public void setFechaPublicacion (String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getFechaPublicacion () {
        return fechaPublicacion;
    }

    public void setAutor (Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor () {
        return autor;
    }
}
