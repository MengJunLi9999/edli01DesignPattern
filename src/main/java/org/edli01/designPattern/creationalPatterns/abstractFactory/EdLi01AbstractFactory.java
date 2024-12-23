package org.edli01.designPattern.creationalPatterns.abstractFactory;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.creationalPatterns.abstractFactory
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-09-29 13:55
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implement the Abstract Factory Pattern in design patterns.
 **/
import java.util.Scanner;

public class EdLi01AbstractFactory {
    public static void main(String[] args) {
        TheTypeOfAnimal theTypeOfAnimal = selectTheTypeOfAnimal();

        theTypeOfAnimal.eat();
    }

    public static TheTypeOfAnimal selectTheTypeOfAnimal() {
        TheTypeOfAnimal theTypeOfAnimal;
        IToyFactory IToyFactory;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like baby animal toys?(Please answer YES or NO.)");
        String yesOrNo = scanner.nextLine();

        if (yesOrNo.equals("YES")) {
            IToyFactory = new BabyAnimalsFactoryI();
        } else {
            IToyFactory = new AdultAnimalsFactoryI();
        }

        theTypeOfAnimal = new TheTypeOfAnimal(IToyFactory);

        return theTypeOfAnimal;
    }
}
