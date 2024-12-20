package org.edli01.oop.encapsulation;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.oop.encapsulation
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 15:10
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class EdLi01Encapsulation {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1l, "Java Book"));
        bookList.add(new Book(2l, "Design pattern"));
        bookList.add(new Book(3l, "Java Virtual Machine"));

        LibraryAccount edli01Account = new LibraryAccount(1l, "edli01", bookList);
        edli01Account.displayBorrowedBooks();
    }
}
