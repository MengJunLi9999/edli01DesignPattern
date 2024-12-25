package org.edli01.designpattern.structuralpatterns.facade;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.facade
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:40
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Subsystem class for projector
 */
public class Projector {
  public void on() {
    System.out.println("Projector is on");
  }

  public void off() {
    System.out.println("Projector is off");
  }

  public void wideScreenMode() {
    System.out.println("Projector in widescreen mode (16:9 aspect ratio)");
  }
} 