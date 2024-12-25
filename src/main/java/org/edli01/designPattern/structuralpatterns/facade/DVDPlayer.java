package org.edli01.designpattern.structuralpatterns.facade;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.facade
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Subsystem class for DVD player
 */
public class DVDPlayer {
  public void on() {
    System.out.println("DVD Player is on");
  }

  public void off() {
    System.out.println("DVD Player is off");
  }

  public void play(String movie) {
    System.out.println("Playing movie: " + movie);
  }

  public void stop() {
    System.out.println("DVD Player stopped");
  }

  public void eject() {
    System.out.println("DVD ejected");
  }
} 