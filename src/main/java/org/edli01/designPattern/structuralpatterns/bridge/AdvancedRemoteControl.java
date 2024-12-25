package org.edli01.designpattern.structuralpatterns.bridge;

/**
 * @Project: edli01DesignPattern
 * @Package: org.edli01.designpattern.structuralpatterns.bridge
 * @Author: MENG-JUN LI
 * @CreateTime: 2024-12-25 16:45
 * @Instagram: https://www.instagram.com/edli_01
 * @WebSite: https://edli-01.com/
 * @Description: Refined abstraction class for advanced remote control
 */
public class AdvancedRemoteControl extends RemoteControl {
  public AdvancedRemoteControl(IDevice device) {
    super(device);
  }

  public void mute() {
    device.setVolume(0);
  }
} 