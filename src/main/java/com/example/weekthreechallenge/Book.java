package com.example.weekthreechallenge;

public class Book {

    private String title;
    private String author;
    private long yearofpublication;
    private String ISBNNumber;
    private boolean available;

    public Book() {
       yearofpublication =2017;
       available = false;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, long yearofpublication, String ISBNNumber, boolean available) {
        this.title = title;
        this.author = author;
        this.yearofpublication = yearofpublication;
        this.ISBNNumber = ISBNNumber;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getYearofpublication() {
        return yearofpublication;
    }

    public void setYearofpublication(long yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
