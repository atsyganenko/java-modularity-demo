package main.bookapp;

import books.inmemory.storage.service.InMemoryBooksService;
import books.json.printer.JsonBookPrinter;
import books.printer.api.BookPrinter;
import books.simpletext.printer.SimpleTextBookPrinter;
import books.storage.api.entities.Book;
import books.storage.api.service.BooksService;

public class BookApp {

    public static void main(String args[]) {
        BooksService booksService = new InMemoryBooksService();

        int id = booksService.createBook("The Little Prince", 30.00);
        BookPrinter jsonPrinter = new JsonBookPrinter();
        BookPrinter simpleTextPrinter = new SimpleTextBookPrinter();

        Book book = booksService.getBook(id);

        jsonPrinter.printIntroductionMsg();
        jsonPrinter.printBook(book);

        simpleTextPrinter.printIntroductionMsg();
        simpleTextPrinter.printBook(book);
    }

}
