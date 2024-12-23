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
public abstract class AToyFactory {
    public void doSomething() {
        ICuteAnimals ICuteAnimals = createAnimal();
        ICuteAnimals.sayHello();
        ICuteAnimals.run();
    }

    public abstract ICuteAnimals createAnimal();
}
