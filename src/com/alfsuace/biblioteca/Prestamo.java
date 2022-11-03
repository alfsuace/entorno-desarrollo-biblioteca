package com.alfsuace.biblioteca;

public class Prestamo {
    //-id: Integer
    //-libro: Libro
    //-usuario: Usuario
    //-fechaPrestamo: String
    //-fechaDevolucion: String

    private Integer id;
    private Libro libro;
    private Usuario usuario;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public void setId (Integer id) {
        this.id = id;
    }

    public Integer getId () {
        return id;
    }

    public void setLibro (Libro libro) {
        this.libro = libro;
    }

    public Libro getLibro () {
        return libro;
    }

    public void setUsuario (Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario () {
        return usuario;
    }

    public void setFechaPrestamo (String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaPrestamo () {
        return fechaPrestamo;
    }

    public void setFechaDevolucion (String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getFechaDevolucion () {
        return fechaDevolucion;
    }
}
