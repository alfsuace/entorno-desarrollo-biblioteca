package com.alfsuace.biblioteca;

public class Autor {
    //-id: Integer
    //-nombre: String
    //-apellidos: String
    //-fechaNacimiento: String
    //-localidadNacimiento: String
    private Integer id;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String localidadNacimiento;

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

    public void setFechaNacimiento (String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaNacimiento () {
        return fechaNacimiento;
    }

    public void setLocalidadNacimiento (String localidadNacimiento) {
        this.localidadNacimiento = localidadNacimiento;
    }

    public String getLocalidadNacimiento () {
        return localidadNacimiento;
    }
}
