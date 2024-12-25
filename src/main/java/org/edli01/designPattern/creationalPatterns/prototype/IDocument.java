package org.edli01.designpattern.creationalpatterns.prototype;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.prototype
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:00
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Prototype interface for documents
 */
public interface IDocument extends Cloneable {
  IDocument clone();
  void display();
} 