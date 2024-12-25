package org.edli01.designpattern.structuralpatterns.facade;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.facade
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Subsystem class for theater lights
 */
public class TheaterLights {
  public void on() {
    System.out.println("Theater Lights are on");
  }

  public void off() {
    System.out.println("Theater Lights are off");
  }

  public void dim(int level) {
    System.out.println("Dimming lights to " + level + "%");
  }
} 