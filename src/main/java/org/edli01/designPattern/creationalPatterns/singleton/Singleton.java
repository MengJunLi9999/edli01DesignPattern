package org.edli01.designPattern.creationalPatterns.singleton;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.creationalPatterns.singleton
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-09-27 18:05
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implement the Singleton Pattern in design patterns.
 **/

public final class Singleton {
    private static volatile Singleton instanceEdLi01;

    public String transaction;

    private Singleton(String transaction) {
        this.transaction = transaction;
    }

    public static Singleton getInstance(String transaction) {
        Singleton instanceObject = instanceEdLi01;

        if (instanceObject != null) {
            return instanceObject;
        }

        synchronized (Singleton.class) {
            if(instanceEdLi01 == null) {
                instanceEdLi01 = new Singleton(transaction);
            }

            return instanceEdLi01;
        }
    }
}
