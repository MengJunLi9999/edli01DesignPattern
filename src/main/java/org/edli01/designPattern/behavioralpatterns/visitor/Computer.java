package org.edli01.designpattern.behavioralpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.visitor
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete element class for computer
 */
public class Computer implements IComputerPart {
  private List<IComputerPart> parts;

  public Computer() {
    parts = new ArrayList<>();
    parts.add(new Mouse());
    parts.add(new Keyboard());
    parts.add(new Monitor());
  }

  @Override
  public void accept(IComputerPartVisitor visitor) {
    for (IComputerPart part : parts) {
      part.accept(visitor);
    }
    visitor.visit(this);
  }

  @Override
  public String getName() {
    return "Computer";
  }
} 