package books.inmemory.storage.api.service;

import books.inmemory.storage.api.entities.Book;

public interface BooksService {
  Book getBook(int id);
  int createBook(String title, double price);
}
