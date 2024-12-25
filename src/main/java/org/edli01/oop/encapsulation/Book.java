package org.edli01.oop.encapsulation;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.oop.encapsulation
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 15:31
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class Book {
  private Long bookId;
  private String bookName;

  Book(Long bookId, String bookName) {
    this.bookId = bookId;
    this.bookName = bookName;
  }

  public Long getBookId() {
    return this.bookId;
  }

  public String getBookName() {
    return this.bookName;
  }
}
