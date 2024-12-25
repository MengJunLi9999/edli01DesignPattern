package org.edli01.designpattern.structuralpatterns.decorator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.decorator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:52
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete decorator class for whip
 */
public class Whip extends CondimentDecorator {
  public Whip(IBeverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.10;
  }
} 