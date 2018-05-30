package main.bookapp;

import books.inmemory.storage.service.InMemoryBooksService;
import books.inmemory.storage.api.entities.Book;
import books.inmemory.storage.api.service.BooksService;

public class BookApp {

    public static void main(String args[]) {
        BooksService booksService = new InMemoryBooksService();

        int id = booksService.createBook("The Little Prince", 30.00);
        printBookDetails(booksService.getBook(id));
    }

    private static void printBookDetails(Book book) {
        System.out.println(String.format("Book title: %s, price: %f", book.getTitle(), book.getPrice()));
    }
}
