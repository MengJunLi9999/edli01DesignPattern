package org.edli01.designpattern.creationalpatterns.abstractfactory;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.abstractfactory
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:20
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Concrete factory for adult animals
 */
public class AdultAnimalsFactory implements IToyFactory {
  @Override
  public ILandAnimals createLandAnimal() {
    return new Lion();
  }

  @Override
  public ISeaAnimals createSeaAnimal() {
    return new Dolphin();
  }
}
