package org.edli01.designpattern.behavioralpatterns.iterator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.iterator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Iterator Pattern
 */
public class EdLi01Iterator {
  public static void main(String[] args) {
    // 創建圖書館集合
    IBookCollection library = new Library();

    // 添加書籍
    library.addBook(new Book("Design Patterns", "Gang of Four", "978-0201633610"));
    library.addBook(new Book("Clean Code", "Robert Martin", "978-0132350884"));
    library.addBook(new Book("Refactoring", "Martin Fowler", "978-0134757599"));

    // 獲取迭代器
    IIterator<Book> iterator = library.getIterator();

    // 使用迭代器遍歷書籍
    System.out.println("Iterating through books:");
    while (iterator.hasNext()) {
      Book book = iterator.next();
      System.out.println(book);
    }

    // 重置迭代器
    System.out.println("\nResetting iterator and iterating again:");
    iterator.reset();
    while (iterator.hasNext()) {
      Book book = iterator.next();
      System.out.println(book);
    }
  }
} 