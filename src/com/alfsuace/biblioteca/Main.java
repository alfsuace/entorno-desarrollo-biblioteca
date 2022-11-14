package com.alfsuace.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

    Author author = new Author();
    Genre genre = new Genre();
    Book book = new Book();
    Borrow borrow = new Borrow();
    User user = new User();
    Scanner author1 = new Scanner(System.in);
    Scanner book1 = new Scanner(System.in);
    Scanner genre1 = new Scanner(System.in);
    Scanner borrow1 = new Scanner(System.in);
    Integer authorId;
    Integer genreId;
    Integer borrowId;

    //autor
    System.out.println("Autor");
    authorId = 1;
    author.setId(authorId);
    System.out.println("Introduzca el nombre");
    author.setName(author1.nextLine());
    System.out.println("Introduzca el apellido");
    author.setSurname(author1.nextLine());
    System.out.println("Introduzca la fecha de nacimiento");
    author.setBirthDate(author1.nextLine());
    System.out.println("Introduzca el lugar de nacimiento");
    author.setBirthPlace(author1.nextLine());
    // System.out.println(author.getFullName());
    System.out.println("-------------------");

    //genre
    System.out.println("Genre");
    genreId = 1;
    genre.setId(genreId);
    System.out.println("Introduzca el genero");
    genre.setGenreName(genre1.nextLine());
    System.out.println("Introduzca una descripción del género");
    genre.setDescription(genre1.nextLine());
    System.out.println("-------------------");

    //libro
    System.out.println("Introduzca el libro");
    book.setTitle(book1.nextLine());
    System.out.println("Introduzca el isbn");
    book.setIsbn(book1.nextLine());
    System.out.println("Introduzca la fecha de publicación");
    book.setReleaseDate(book1.nextLine());
    System.out.println("Introduzca el autor");
    //faltan author y genre


    //Borrow
    borrowId = 1;
    borrow.setId(borrowId);
    //faltan user y book
    System.out.println("Introduzca la fecha de inicio del préstamo");
    borrow.setBorrowDate(borrow1.nextLine());
    System.out.println("Introduzca la fecha de fin del préstamo");
    borrow.setReturnDate(borrow1.nextLine());

    }
}