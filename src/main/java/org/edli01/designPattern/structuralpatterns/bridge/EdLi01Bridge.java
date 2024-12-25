package org.edli01.designpattern.structuralpatterns.bridge;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.bridge
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:55
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Main class demonstrating the Bridge Pattern
 */
public class EdLi01Bridge {
  public static void main(String[] args) {
    testDevice(new TV());
    testDevice(new Radio());
  }

  public static void testDevice(IDevice device) {
    System.out.println("Tests with basic remote.");
    RemoteControl basicRemote = new RemoteControl(device);
    basicRemote.togglePower();
    device.printStatus();

    System.out.println("Tests with advanced remote.");
    AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(device);
    advancedRemote.togglePower();
    advancedRemote.mute();
    device.printStatus();
  }
} 