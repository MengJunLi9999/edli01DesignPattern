package org.edli01.oop.polymorphism;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.oop.polymorphism
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-20 16:35
 * @Instagram: https://www.instagram.com/edli_01
 * @Blog: https://edli-01.com/
 * @Description:
 **/
public class EdLi01Polymorphism {
    public static void main(String[] args) {
        ITFJavaDevelopment mobileApplicationDevelopment = new MobileApplicationDevelopment();
        ITFJavaDevelopment backendDevelopment = new BackendDevelopment();

        mobileApplicationDevelopment.develop();
        backendDevelopment.develop();
    }
}
