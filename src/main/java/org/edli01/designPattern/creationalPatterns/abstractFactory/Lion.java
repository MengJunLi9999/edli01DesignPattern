package org.edli01.designPattern.creationalPatterns.abstractFactory;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.creationalPatterns.abstractFactory
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-09-29 13:08
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implement the Abstract Factory Pattern in design patterns.
 **/
public class Lion implements LandAnimals {
    @Override
    public void eat() {
        System.out.println("Lions like to eat raw meat.");
    }
}
