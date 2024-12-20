package org.edli01.designPattern.creationalPatterns.abstractFactory;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.creationalPatterns.abstractFactory
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-09-29 13:00
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implement the Abstract Factory Pattern in design patterns.
 **/
public class TheTypeOfAnimal {
    private LandAnimals landAnimals;

    private SeaAnimals seaAnimals;

    public TheTypeOfAnimal(ToyFactory toyFactory) {
        landAnimals = toyFactory.createLandAnimal();

        seaAnimals = toyFactory.createSeaAnimal();
    }

    public void eat() {
        landAnimals.eat();

        seaAnimals.eat();
    }
}