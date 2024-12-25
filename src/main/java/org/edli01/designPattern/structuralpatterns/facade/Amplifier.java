package org.edli01.designpattern.structuralpatterns.facade;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.facade
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Subsystem class for amplifier
 */
public class Amplifier {
  public void on() {
    System.out.println("Amplifier is on");
  }

  public void off() {
    System.out.println("Amplifier is off");
  }

  public void setVolume(int level) {
    System.out.println("Setting volume to " + level);
  }

  public void setSurroundSound() {
    System.out.println("Surround sound enabled");
  }

  public void setDVD() {
    System.out.println("Setting DVD input");
  }
} 