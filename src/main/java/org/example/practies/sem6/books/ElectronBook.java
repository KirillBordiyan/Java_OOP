package org.example.practies.sem6.books;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.practies.sem6.genre.BookGenre;

@Getter
@Setter
@ToString
public class ElectronBook extends Book{
    //LSP
    private ReadingFormat readingFormat;
    private int weight;


    public ElectronBook(String naming, String author, BookGenre genre, int publishYear,
                        ReadingFormat readingFormat, int weight) {
        super(naming, author, genre, publishYear);
        this.readingFormat = readingFormat;
        this.weight = weight;
    }
}
