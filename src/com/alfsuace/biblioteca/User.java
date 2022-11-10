package com.alfsuace.biblioteca;

public class User {
    //-id: Integer
    //-libro: Libro
    //-usuario: Usuario
    //-fechaPrestamo: String
    //-fechaDevolucion: String

    private Integer id;
    private Book book;
    private User user;
    private String borrowDate;
    private String returnDate;

    public void setId (Integer id) {
        this.id = id;
    }

    public Integer getId () {
        return id;
    }

    public void setBook (Book book) {
        this.book = book;
    }

    public Book getBook () {
        return book;
    }

    public void setUser (User user) {
        this.user = user;
    }

    public User getUser () {
        return user;
    }

    public void setBorrowDate (String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getBorrowDate () {
        return borrowDate;
    }

    public void setReturnDate (String returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnDate () {
        return returnDate;
    }
}
