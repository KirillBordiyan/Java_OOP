package org.example.practies.sem6.library.books;

import java.util.List;

public interface Searchable {
    public List<Book> findByAuthor(String author);
}
