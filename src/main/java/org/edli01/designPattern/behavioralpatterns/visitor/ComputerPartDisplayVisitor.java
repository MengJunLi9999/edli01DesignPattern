package org.edli01.designpattern.behavioralpatterns.visitor;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.visitor
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:00
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete visitor for displaying computer parts
 */
public class ComputerPartDisplayVisitor implements IComputerPartVisitor {
  @Override
  public void visit(Computer computer) {
    System.out.println("Displaying " + computer.getName());
  }

  @Override
  public void visit(Mouse mouse) {
    System.out.println("Displaying " + mouse.getName());
  }

  @Override
  public void visit(Keyboard keyboard) {
    System.out.println("Displaying " + keyboard.getName());
  }

  @Override
  public void visit(Monitor monitor) {
    System.out.println("Displaying " + monitor.getName());
  }
} 