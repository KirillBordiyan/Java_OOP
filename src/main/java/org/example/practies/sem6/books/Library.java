package org.example.practies.sem6.books;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Library implements Searchable{
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = new ArrayList<>();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .toList();
    }
}
