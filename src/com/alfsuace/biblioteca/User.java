package com.alfsuace.biblioteca;

public class User {
    //-id: Integer
    //-nombre: String
    //-apellidos: String
    //-dni: String
    //-telefono: Integer
    //-direccion: String
    //-población: String

    private String name;
    private String surname;
    private String dni;
    private String telephone;
    private String adress;
    private String city;


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

    public void setDni (String dni) {
        this.dni = dni;
    }

    public String getDni () {
        return dni;
    }

    public void setTelephone (String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone () {
        return telephone;
    }

    public void setAdress (String adress) {
        this.adress = adress;
    }

    public String getAdress () {
        return adress;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public String getCity () {
        return city;
    }
}
