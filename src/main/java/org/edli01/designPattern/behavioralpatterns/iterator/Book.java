package org.edli01.designpattern.behavioralpatterns.iterator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.iterator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Book class representing a book item
 */
public class Book {
  private String name;
  private String author;
  private String isbn;

  public Book(String name, String author, String isbn) {
    this.name = name;
    this.author = author;
    this.isbn = isbn;
  }

  @Override
  public String toString() {
    return "Book{name='" + name + "', author='" + author + "', isbn='" + isbn + "'}";
  }
} 