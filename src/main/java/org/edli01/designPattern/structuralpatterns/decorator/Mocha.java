package org.edli01.designpattern.structuralpatterns.decorator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.decorator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:50
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete decorator class for mocha
 */
public class Mocha extends CondimentDecorator {
  public Mocha(IBeverage beverage) {
    super(beverage);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return beverage.cost() + 0.20;
  }
} 