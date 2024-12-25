package org.edli01.designpattern.creationalpatterns.abstractfactory;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.abstractfactory
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:22
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Client class for Abstract Factory Pattern
 */
public class TheTypeOfAnimal {
  private ILandAnimals landAnimal;
  private ISeaAnimals seaAnimal;

  public TheTypeOfAnimal(IToyFactory factory) {
    landAnimal = factory.createLandAnimal();
    seaAnimal = factory.createSeaAnimal();
  }

  public void eat() {
    landAnimal.eat();
    seaAnimal.eat();
  }
}