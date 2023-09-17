package org.example.practies.sem6.genre;

import lombok.ToString;

@ToString
public class BookGenre implements Genre{
    //OCP
    private String bookGenre;

    public BookGenre(String bookGenre){
        this.bookGenre = bookGenre;
    }
    @Override
    public String genreInfo() {
        return bookGenre;
    }
}
