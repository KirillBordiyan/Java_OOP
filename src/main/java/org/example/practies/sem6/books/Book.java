package org.example.practies.sem6.books;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.practies.sem6.genre.BookGenre;

@Getter
@Setter
@ToString
public class Book {
    //SRP
    private String naming;
    private String author;
    private BookGenre genre;
    private int publishYear;

    public Book(String naming, String author, BookGenre genre,int publishYear){
        this.naming = naming;
        this.author = author;
        this.genre = genre;
        this.publishYear = publishYear;
    }
}

