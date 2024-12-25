package org.edli01.designpattern.creationalpatterns.abstractfactory;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.abstractfactory
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:16
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete product - Lion
 */
public class Lion implements ILandAnimals {
  @Override
  public void eat() {
    System.out.println("Lions like to eat meat.");
  }
}
