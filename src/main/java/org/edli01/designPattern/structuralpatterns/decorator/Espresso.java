package org.edli01.designpattern.structuralpatterns.decorator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.decorator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete component class for espresso
 */
public class Espresso implements IBeverage {
  @Override
  public String getDescription() {
    return "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
} 