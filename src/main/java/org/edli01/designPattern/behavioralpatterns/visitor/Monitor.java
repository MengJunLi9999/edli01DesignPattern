package org.edli01.designpattern.behavioralpatterns.visitor;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.visitor
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:55
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete element class for monitor
 */
public class Monitor implements IComputerPart {
  @Override
  public void accept(IComputerPartVisitor visitor) {
    visitor.visit(this);
  }

  @Override
  public String getName() {
    return "Monitor";
  }
} 