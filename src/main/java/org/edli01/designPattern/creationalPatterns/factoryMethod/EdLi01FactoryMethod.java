package org.edli01.designpattern.creationalpatterns.factorymethod;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.factorymethod
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-09-29 11:54
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implement the Factory Method Pattern in design patterns.
 */
import java.util.Scanner;

public class EdLi01FactoryMethod {
  private static AToyFactory AToyFactory;

  public static void main(String[] args) {
    generateToy();
    toyFunctions();
  }

  public static void generateToy() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Do you like mouse?(Please answer YES or NO.)");
    String yesOrNo = scanner.nextLine();

    if (yesOrNo.equals("YES")) {
        AToyFactory = new MickeyMouseFactoryA();
    } else {
        AToyFactory = new DonaldDockFactoryA();
    }
  }

  public static void toyFunctions() {
    AToyFactory.doSomething();
  }
}
