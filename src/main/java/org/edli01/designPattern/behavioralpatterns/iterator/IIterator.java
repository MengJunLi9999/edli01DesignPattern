package org.edli01.designpattern.behavioralpatterns.iterator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.iterator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Iterator interface
 */
public interface IIterator<T> {
  boolean hasNext();
  T next();
  void reset();
} 