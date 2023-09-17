package org.example.practies.sem6.library.formatter;

import org.example.practies.sem6.library.books.Book;

public class HtmlFormatter implements Formatter{
    @Override
    public void formatTo(Book book) {
        System.out.println("HTML format");
    }
}
