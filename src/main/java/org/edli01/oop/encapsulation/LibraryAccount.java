package org.edli01.oop.encapsulation;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.oop.encapsulation
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 15:14
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class LibraryAccount {
  private Long accountId;
  private String accountName;
  private List<Book> bookList = new ArrayList<>();

  public LibraryAccount(Long accountId, String accountName, List<Book> bookList) {
    this.accountId = accountId;
    this.bookList = bookList;
  }

  public Long getAccountId() {
    return this.accountId;
  }

  public String getAccountName() {
    return this.accountName;
  }

  public List<Book> getBookList() {
    return this.bookList;
  }

  public void displayBorrowedBooks() {
    System.out.println("Display borrowed books");
    for (Book book : bookList) {
      System.out.println("BookId : " + book.getBookId() + "; BookName : " + book.getBookName());
    }
  }
}
