package org.edli01.designpattern.creationalpatterns.abstractfactory;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.abstractfactory
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:24
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Abstract Factory Pattern
 */
public class EdLi01AbstractFactory {
  public static void main(String[] args) {
    IToyFactory factory = new AdultAnimalsFactory();
    TheTypeOfAnimal animal = new TheTypeOfAnimal(factory);
    animal.eat();
  }
}
