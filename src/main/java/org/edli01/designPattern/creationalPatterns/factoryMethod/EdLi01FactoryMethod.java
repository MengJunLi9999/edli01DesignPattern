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
import java.util.Scanner;

public class EdLi01FactoryMethod {
    private static ToyFactory toyFactory;

    public static void main(String[] args) {
        generateToy();

        toyFunctions();
    }

    public static void generateToy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you like mouse?(Please answer YES or NO.)");
        String yesOrNo = scanner.nextLine();

        if (yesOrNo.equals("YES"))
            toyFactory = new MickeyMouseFactory();
        else
            toyFactory = new DonaldDockFactory();
    }

    public static void toyFunctions() {
        toyFactory.doSomething();
    }
}
