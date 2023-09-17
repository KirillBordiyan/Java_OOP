package org.example.practies.sem6.library.books;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Library implements Searchable{
    private List<Book> books = new ArrayList<>();

    public Library(List<Book> books) {
        this.books = books;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> author.equals(book.getAuthor()))
                .toList();
    }
}
