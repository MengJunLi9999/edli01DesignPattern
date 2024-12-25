package org.edli01.designpattern.structuralpatterns.decorator;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.decorator
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Component interface for beverage
 */
public interface IBeverage {
  String getDescription();
  double cost();
} 