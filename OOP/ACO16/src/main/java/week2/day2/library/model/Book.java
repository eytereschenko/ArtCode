package week2.day2.library.model;

import week2.day2.library.enums.Genre;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class Book extends PeriodicalIssue {


    public Book(String name, String authorName, int year, Genre genre) {
        super(name, authorName, year, genre);

    }
}
