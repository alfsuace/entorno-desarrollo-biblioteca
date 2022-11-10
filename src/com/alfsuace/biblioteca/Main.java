package com.alfsuace.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

    Author author = new Author();
    Genre genre = new Genre();
    Book book = new Book();
    Borrow borrow = new Borrow();
    User user = new User();



    System.out.println("Introduzca el libro");
    Scanner book1 = new Scanner(System.in);
    book.setTitle(book1.nextLine());
    System.out.println("Introduzca el isbn");
    book.setIsbn(book1.nextLine());
    System.out.println("Introduzca la fecha de publicación");
    book.setReleaseDate(book1.nextLine());
    System.out.println("Introduzca el autor");

/*
    System.out.println("Introduzca el autor");
    Scanner author1 = new Scanner(System.in);

    System.out.println("Introduzca el género");
    Scanner genre1 = new Scanner(System.in);

    System.out.println("Introduzca el usuario");
    Scanner user1 = new Scanner(System.in);


    System.out.println("Introduzca el préstamo");
    Scanner borrow1 = new Scanner(System.in);
*/







    }
}