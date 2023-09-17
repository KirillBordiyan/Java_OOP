package org.example.practies.sem6.library;

import org.example.practies.sem6.library.books.Book;
import org.example.practies.sem6.library.books.ElectronBook;
import org.example.practies.sem6.library.books.Library;
import org.example.practies.sem6.library.books.ReadingFormat;
import org.example.practies.sem6.library.formatter.Formatter;
import org.example.practies.sem6.library.formatter.JsonFormatter;
import org.example.practies.sem6.library.genre.BookGenre;

import java.util.Arrays;
import java.util.List;

public class MainLib {
    public static void main(String[] args) {
        Book eb = new ElectronBook("Горе от ума",
                "Грибоедов",
                new BookGenre("комедия"),
                1833,
                ReadingFormat.DOC,
                230);

        List<Book> bookList = Arrays.asList(
                new Book("Горе от ума",
                        "Грибоедов",
                        new BookGenre("комедия"),
                        1833),
                new Book("b2",
                        "au2",
                        new BookGenre("fantasy"),
                        1980),
                new Book("b3",
                        "au3",
                        new BookGenre("horror"),
                        2020));

        Library library = new Library(bookList);

        System.out.println(library.findByAuthor("au3"));

        Formatter form = new JsonFormatter();
    }
}


//2) Создать систему управления библиотекой(SOLID)
//        a)	Book - должен отвечать только за хранение информации о книге.
//          (единственная ответственность -> Single Responsibility Principle)
//        b)	Genre - должен хранить информацию о жанрах книг.
//          (открыт для расширения, но закрыт для изменения -> Open-Closed Principle)
//        c)	ElectronBook - должна иметь формат чтения и размер.
//          (Принцип подстановки Барбары Лисков - >Liskov Substitution Principle)
//        d)	Searchable - должен производить поиск по авторам книг.
//          (Принцип разделения интерфейса -> Interface Segregation Principle)
//        e)	Formatter - должен выводить информацию в различных форматах(без формата,json,html)- заглушки
//          (Принцип инверсии зависимостей -> Dependency Inversion Principle)
