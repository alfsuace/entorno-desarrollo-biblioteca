package com.alfsuace.biblioteca;

public class Usuario {
    //-id: Integer
    //-nombre: String
    //-apellidos: String
    //-dni: String
    //-telefono: Integer
    //-direccion: String
    //-población: String

    private Integer id;
    private String nombre;
    private String apellidos;
    private String dni;
    private Integer telefono;
    private String direccion;
    private String poblacion;

    public void setId (Integer id) {
        this.id = id;
    }

    public Integer getId () {
        return id;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre () {
        return nombre;
    }

    public void setApellidos (String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos () {
        return apellidos;
    }

    public void setDni (String dni) {
        this.dni = dni;
    }

    public String getDni () {
        return dni;
    }

    public void setTelefono (Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getTelefono () {
        return telefono;
    }

    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion () {
        return direccion;
    }

    public void setPoblacion (String poblacion) {
        this.poblacion = poblacion;
    }

    public String getPoblacion () {
        return poblacion;
    }
}
