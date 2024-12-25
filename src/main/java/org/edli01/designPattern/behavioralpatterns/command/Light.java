package org.edli01.designpattern.behavioralpatterns.command;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.behavioralpatterns.command
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 15:35
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Receiver class - Light
 */
public class Light {
  private String location;

  public Light(String location) {
    this.location = location;
  }

  public void turnOn() {
    System.out.println(location + " light is turned on");
  }

  public void turnOff() {
    System.out.println(location + " light is turned off");
  }
} 