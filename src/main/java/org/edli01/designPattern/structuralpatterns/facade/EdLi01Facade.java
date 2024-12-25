package org.edli01.designpattern.structuralpatterns.facade;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.facade
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:55
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Facade Pattern
 */
public class EdLi01Facade {
  public static void main(String[] args) {
    // 初始化所有子系統
    Amplifier amp = new Amplifier();
    DVDPlayer dvd = new DVDPlayer();
    Projector projector = new Projector();
    TheaterLights lights = new TheaterLights();

    // 創建外觀
    HomeTheaterFacade homeTheater = 
      new HomeTheaterFacade(amp, dvd, projector, lights);

    // 使用外觀來觀看電影
    homeTheater.watchMovie("Raiders of the Lost Ark");
    System.out.println("\nMovie is playing...\n");
    homeTheater.endMovie();
  }
} 