package org.edli01.designpattern.behavioralpatterns.visitor;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.visitor
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:05
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Visitor Pattern
 */
public class EdLi01Visitor {
  public static void main(String[] args) {
    IComputerPart computer = new Computer();
    computer.accept(new ComputerPartDisplayVisitor());
  }
} 