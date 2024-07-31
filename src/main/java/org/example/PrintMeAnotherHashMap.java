package org.example;

import java.util.HashMap;

public class PrintMeAnotherHashMap {
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "Pride");
    }
}

class Book {
    private String name;
    private String contents;
    private int publicationYear;

    public Book(String name, int publicationYear, String contents) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.contents = contents;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " (" + this.publicationYear + ")\n"
                + "Contents: " + this.contents;
    }
}
