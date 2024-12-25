package org.edli01.designpattern.behavioralpatterns.visitor;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.visitor
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Element interface for computer parts
 */
public interface IComputerPart {
  void accept(IComputerPartVisitor visitor);
  String getName();
} 