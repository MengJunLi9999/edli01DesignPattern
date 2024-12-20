package org.edli01.designPattern.creationalPatterns.abstractFactory;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.creationalPatterns.abstractFactory
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-09-29 12:31
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implement the Abstract Factory Pattern in design patterns.
 **/
public class AdultAnimalsFactory implements ToyFactory {
    @Override
    public LandAnimals createLandAnimal() {
        return new Lion();
    }

    @Override
    public SeaAnimals createSeaAnimal() {
        return new Dolphin();
    }
}
