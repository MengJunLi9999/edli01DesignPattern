package org.edli01.designpattern.behavioralpatterns.visitor;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.visitor
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Visitor interface for computer parts
 */
public interface IComputerPartVisitor {
  void visit(Computer computer);
  void visit(Mouse mouse);
  void visit(Keyboard keyboard);
  void visit(Monitor monitor);
} 