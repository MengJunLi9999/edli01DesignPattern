package org.edli01.designpattern.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.iterator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete collection implementing IBookCollection
 */
public class Library implements IBookCollection {
  private List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  @Override
  public void addBook(Book book) {
    books.add(book);
  }

  @Override
  public void removeBook(Book book) {
    books.remove(book);
  }

  @Override
  public IIterator<Book> getIterator() {
    return new LibraryIterator();
  }

  private class LibraryIterator implements IIterator<Book> {
    private int currentIndex = 0;

    @Override
    public boolean hasNext() {
      return currentIndex < books.size();
    }

    @Override
    public Book next() {
      if (hasNext()) {
        return books.get(currentIndex++);
      }
      return null;
    }

    @Override
    public void reset() {
      currentIndex = 0;
    }
  }
} 