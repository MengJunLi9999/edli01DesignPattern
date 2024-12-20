package org.edli01.designPattern.creationalPatterns.factoryMethod;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.creationalPatterns.factoryMethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-09-29 11:51
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implement the Factory Method Pattern in design patterns.
 **/
public abstract class ToyFactory {
    public void doSomething() {
        CuteAnimals cuteAnimals = createAnimal();
        cuteAnimals.sayHello();
        cuteAnimals.run();
    }

    public abstract CuteAnimals createAnimal();
}
