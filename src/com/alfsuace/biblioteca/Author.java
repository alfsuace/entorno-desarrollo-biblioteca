package com.alfsuace.biblioteca;

public class Author {
    //-id: Integer
    //-nombre: String
    //-apellidos: String
    //-fechaNacimiento: String
    //-localidadNacimiento: String
    private Integer id;
    private String name;
    private String surname;
    private String birthDate;
    private String birthPlace;

    public void setId (Integer id) {
        this.id = id;
    }

    public Integer getId () {
        return id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public String getSurname () {
        return surname;
    }

    public void setBirthDate (String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate () {
        return birthDate;
    }

    public void setBirthPlace (String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthPlace () {
        return birthPlace;
    }

    public String getFullName(){
        return  name + " " + surname;
    }
}
