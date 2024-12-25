package org.edli01.designpattern.structuralpatterns.bridge;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.bridge
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:30
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Implementor interface for devices
 */
public interface IDevice {
  boolean isEnabled();
  void enable();
  void disable();
  int getVolume();
  void setVolume(int volume);
  int getChannel();
  void setChannel(int channel);
  void printStatus();
} 