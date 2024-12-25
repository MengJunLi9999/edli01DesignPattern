package org.edli01.designpattern.structuralpatterns.decorator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.decorator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete component class for house blend coffee
 */
public class HouseBlend implements IBeverage {
  @Override
  public String getDescription() {
    return "House Blend Coffee";
  }

  @Override
  public double cost() {
    return 0.89;
  }
} 