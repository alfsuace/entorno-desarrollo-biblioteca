package com.alfsuace.biblioteca;

public class Genre {

    private Integer id;
    private String genreName;
    private String description;

    public void setId (Integer id) {
        this.id = id;
    }

    public Integer getId () {
        return id;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String getDescription () {
        return description;
    }

    public void setGenreName (String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName () {
        return genreName;
    }
}
