package org.edli01.designpattern.creationalpatterns.builder;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.creationalpatterns.builder
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:54
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Client class demonstrating the Builder Pattern
 */
public class EdLi01Builder {
  public static void main(String[] args) {
    Director director = new Director();
    ComputerBuilder gamingBuilder = new GamingComputerBuilder();
    ComputerBuilder workBuilder = new WorkstationComputerBuilder();

    director.setBuilder(gamingBuilder);
    Computer gamingComputer = director.constructComputer();
    System.out.println("Gaming Computer Built:");
    System.out.println(gamingComputer);

    System.out.println("\n====================\n");

    director.setBuilder(workBuilder);
    Computer workComputer = director.constructComputer();
    System.out.println("Workstation Computer Built:");
    System.out.println(workComputer);
  }
} 