package org.edli01.designpattern.structuralpatterns.decorator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.decorator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Abstract decorator class for condiments
 */
public abstract class CondimentDecorator implements IBeverage {
  protected IBeverage beverage;

  public CondimentDecorator(IBeverage beverage) {
    this.beverage = beverage;
  }

  public abstract String getDescription();
} 