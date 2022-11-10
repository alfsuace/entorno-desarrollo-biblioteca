package com.alfsuace.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Book {
    //-id :Integer
    //-titulo: String
    //-isbn: String
    //-autor: List<Autor>
    //-genero: LIST<Genero>
    //-fechaPublicación: String
    private String title;
    private String isbn;
    private String releaseDate;
    private Author author;
    private List<Genre> genre = new ArrayList<>();


    public void setTitle (String title) {
        this.title = title;
    }

    public String getTitle () {
        return title;
    }
    public void addGenero(Genre genre){
        this.genre.add(genre);
    }
    public List<Genre> getGenre(){
        return genre;
    }

    public void setIsbn (String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn () {
        return isbn;
    }

    public void setReleaseDate (String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate () {
        return releaseDate;
    }

    public void setAuthor (Author author) {
        this.author = author;
    }

    public Author getAuthor () {
        return author;
    }

    public void setGenre (List<Genre> genre) {
        this.genre = genre;
    }

}
