package org.edli01.designpattern.creationalpatterns.abstractfactory;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.abstractfactory
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-09-29 12:32
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implement the Abstract Factory Pattern in design patterns.
 **/
public class BabyAnimalsFactory implements IToyFactory {
  @Override
  public ILandAnimals createLandAnimal() {
    return new BabyElephant();
  }

  @Override
  public ISeaAnimals createSeaAnimal() {
    return new BabyShark();
  }
}