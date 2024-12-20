package org.edli01.designPattern.creationalPatterns.factoryMethod;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.creationalPatterns.factoryMethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-09-29 11:54
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implement the Factory Method Pattern in design patterns.
 **/
public class DonaldDuck implements CuteAnimals {
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm Donald Duck.");
    }

    @Override
    public void run() {
        System.out.println("Donald Duck is running.");
    }
}
